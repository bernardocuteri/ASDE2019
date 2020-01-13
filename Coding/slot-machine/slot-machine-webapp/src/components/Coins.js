import React from 'react';

export default class Coins extends React.Component {

    render() {
        return (
            <div style={{textAlign:"left"}}>
                <h2>You have {this.props.amount} coins left</h2>
            </div>
        )
    }
}