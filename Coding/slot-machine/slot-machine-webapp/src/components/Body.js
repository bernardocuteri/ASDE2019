import React from 'react';
import Grid from '@material-ui/core/Grid';
import SlotMachine from './SlotMachine'


export default function SpacingGrid() {

  return (
    <Grid style={{textAlign: "center"}} container spacing={2}>
      <Grid item md={2} xs={1}>        
      </Grid>
      <Grid item md={8} xs={10}>  
      <SlotMachine></SlotMachine>
      </Grid>
    </Grid>
  );
}