import React from 'react'
import BlogBaseInstance from '../http-client/BlogBaseInstance'
import Post from './Post'



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
            <div>
                {this.state.posts.map( (post) => <Post data={post}/> )}

            </div>
        )
    }
}