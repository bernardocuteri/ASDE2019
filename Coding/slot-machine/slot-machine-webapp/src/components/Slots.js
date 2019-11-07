import React from 'react';
import Grid from '@material-ui/core/Grid'
import { Card, CardContent } from '@material-ui/core';


export default class Slots extends React.Component {

    render() {
        return (
            <div>
                <Grid container spacing={2}>
                    <Grid item xs={4}>
                        <Card>
                            <CardContent>{this.props.slots[0]}</CardContent>
                        </Card>
                    </Grid>
                    <Grid item xs={4}>
                        <Card>
                            <CardContent>{this.props.slots[1]}</CardContent>
                        </Card>
                    </Grid>
                    <Grid item xs={4}>
                        <Card>
                            <CardContent>{this.props.slots[2]}</CardContent>
                        </Card>
                    </Grid>
                </Grid>
                
            </div>
        )
    }
}