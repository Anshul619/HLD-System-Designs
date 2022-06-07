
# YouTube - Video Streaming

## Important Points
- This is the READ heavy system ( 200 to 1: read/write ratio )

## Various Components

### Processing Queue
- Each uploaded video will be pushed to a processing queue to be de-queued later for encoding, thumbnail generation, and storage.

### Encoder
- To encode each uploaded video into multiple formats.

#### Why Would You Want to Encode Your Video?
- Different devices require different video formats.
- H.264 is the most common form of video codec. (It is also known as MPEG-4/AVC). It is compatible with a variety of platforms, including HDTV, Blu-Ray/DVD players, mobile devices, and portable gaming consoles.
- By converting digital video to the H.264 format, you can reduce file size by 80% while maintaining a high image quality. This is Bold Content’s go-to codec when exporting for a client.
- Reference - https://boldcontentvideo.com/2018/02/13/the-importance-of-video-encoding/

### Thumbnails generator
- To generate a few thumbnails for each video.

### Video and Thumbnail storage
- To store video and thumbnail files in some distributed file storage ( like HDFS )

### User Database
- To store user’s information, e.g., name, email, address, etc.

### Video metadata storage
- A metadata database to store all the information about videos like title, file path in the system, uploading user, total views, likes, dislikes, etc. 
- It will also be used to store all the video comments.

## DB Schema

### Video metadata storage
- VideoID
- Title
- Description
- Size
- Thumbnail
- Uploader/User
- Total number of likes
- Total number of dislikes
- Total number of views

### Video Comment
- CommentID
- VideoID
- UserID
- Comment
- TimeOfCreation

## MetaData Sharding - Based on VideoID
- Our hash function will map each VideoID to a random server where we will store that Video’s metadata. 
- To find videos of a user, we will query all servers, and each server will return a set of videos. 
- A centralized server will aggregate and rank these results before returning them to the user.
- This approach solves our problem of popular users but shifts it to popular videos.

## References
- Link - https://www.educative.io/courses/grokking-the-system-design-interview/xV26VjZ7yMl