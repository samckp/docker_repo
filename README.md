# docker_repo

Docker Commands 

1. docker --version 
2. docker login -u "userid" -p "password"
3. docker image ls  -> display the list of images
4. docker image rm "image name"  -> remove the image

# Steps to delete a image.
Docker ps -a               # Lists containers (and tells you which images they are spun from)
Docker images              # Lists images  
Docker rm "container_id"   # Removes a container

Docker rmi "image_id"      # Removes an image 
                           # Will fail if there is a running instance of that image i.e. container

Docker rmi -f "image_id" 
