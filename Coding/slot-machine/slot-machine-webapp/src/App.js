import React from 'react';
import Bar from './components/Bar'
import CssBaseline from '@material-ui/core/CssBaseline'
import './App.css';
import Body from './components/Body'

function App() {
  return (
    <React.Fragment>
      <CssBaseline />
      <Bar />
      <Body />
    </React.Fragment>
  );
}

export default App;
