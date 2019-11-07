import React from 'react'
import Slots from './Slots'
import Coins from './Coins'
import BetPanel from './BetPanel'
import SlotMachineServiceClient from '../services/SlotMachineServiceClient'
import { TextField, Button } from '@material-ui/core'


export default class SlotMachine extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            slots: ['-', '-', '-'],
            username: "",
            selectingUsername: "",
            coins: "-"
        }
    }


    betHandler = (bettingCoins) => {
        SlotMachineServiceClient.post("/bet", {user: this.state.username, bet: bettingCoins}).then((res) => {
            this.setState({
                coins: res.data.remainingCoins,
                slots: res.data.slots
            })
        })
    }


    onSelectedUsername = () => {
        SlotMachineServiceClient.post("/startGame", { username: this.state.selectingUsername }).then((res) => {
            this.setState({
                username: res.data.user,
                coins: res.data.coins
            })
        }
        )
    }

    onUsernameChange = (event) => {
        this.setState({ selectingUsername: event.target.value });
    }

    render() {
        if (this.state.username !== "") {
            return (
                <React.Fragment>
                    <h1>Welcome to the Slot Machine Game {this.state.username}</h1>

                    <Slots slots={this.state.slots}></Slots>
                    <BetPanel betHandler={this.betHandler} coins={this.state.coins}></BetPanel>
                    <Coins amount={this.state.coins}></Coins>
                </React.Fragment>
            )
        } else {
            return (
                <React.Fragment>
                    <h1>Welcome to the Slot Machine Game</h1>
                    <h2>Select a username to continue</h2>
                    <TextField
                        id="standard-basic"
                        label="Your username"
                        margin="normal"
                        onChange={(ev) => this.onUsernameChange(ev)}
                    />
                    <div>
                        <Button variant="contained" color="secondary" onClick={(ev) => this.onSelectedUsername()}>
                            Submit
                        </Button>
                    </div>
                </React.Fragment>
            )
        }
    }
}