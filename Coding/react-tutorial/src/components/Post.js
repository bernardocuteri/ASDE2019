import React from 'react'
import { Card, CardActionArea, CardContent, Typography, Button, CardActions, CardMedia } from '@material-ui/core'

export default class Post extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            data: props.data
        }
    }

    render() {
        return (
            <div>
                <Card>
                    <CardActionArea>
                        <CardMedia
                            image="/static/images/cards/contemplative-reptile.jpg"
                            title="Contemplative Reptile"
                        />
                        <CardContent>
                            <Typography gutterBottom variant="h5" component="h2">
                            {this.state.data.title}
                            </Typography>
                            <Typography variant="body2" color="textSecondary" component="p">
                            {this.state.data.message}
                             </Typography>
                             <Typography variant="body2" color="textSecondary" component="p">
                            Posted by {this.state.data.author}
                             </Typography>
                        </CardContent>
                    </CardActionArea>
                    <CardActions>
                        <Button size="small" color="primary">
                            Share
                        </Button>
                        <Button size="small" color="primary">
                            Learn More
                        </Button>
                    </CardActions>
                </Card>
            </div>
        )
    }

}