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

 
Containers
Use docker container my_command
	create — Create a container from an image.
	start — Start an existing container.
	run — Create a new container and start it.
	ls — List running containers.
	inspect — See lots of info about a container.
	logs — Print logs.
	stop — Gracefully stop running container.
	kill —Stop main process in container abruptly.
	rm— Delete a stopped container.
	
Images
Use docker image my_command
	build — Build an image.
	push — Push an image to a remote registry.
	ls — List images.
	history — See intermediate image info.
	inspect — See lots of info about an image, including the layers.
	rm — Delete an image.	
-----------------------------------------------------------------------	
docker version — List info about your Docker Client and Server versions.
docker login — Log in to a Docker registry.
docker system prune — Delete all unused containers, unused networks, and dangling images.
-----------------------------------------------------------
docker container ls
docker image ls
docker container rm <container_id>
docker image rm <image_id>

