import React from 'react'
import Bar from './Bar'
import Posts from './Posts'
import { CssBaseline } from '@material-ui/core'

export default class App extends React.Component {

    render() {
        return (
            <div>
                <CssBaseline/>
                <Bar/>
                <Posts/>
            </div>
        )
    }
}

