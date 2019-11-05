import React from 'react'
import BlogBaseInstance from '../http-client/BlogBaseInstance'



export default class Posts extends React.Component {

    constructor(props) {

        super(props)
        this.state = {
            posts: []
        }
        BlogBaseInstance.get("getAllPosts").then((res) => {
            this.setState({
                posts: res.data
            })
        })
    }

    render() {

        
        return (
            <div></div>
        )
    }
}