import React from 'react';
import { Button } from '@material-ui/core';

const BET_VALUES = [5, 10, 15]

export default class BetPanel extends React.Component {
    
    bet = (value) => {
        this.props.betHandler(value)
    }

    render() {
        return (
            <div style={{textAlign: "left"}}>
                {
                    
                    BET_VALUES.map((v) =>  
                    <Button key={v} style={{ margin: "1rem" }} variant="contained" color="secondary"
                    disabled={v > this.props.coins}  onClick={() => this.bet(v)}>
                        Bet {v}
                    </Button>
                    )
                }
               
            </div>
        )
    }
}