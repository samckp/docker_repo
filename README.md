# docker_repo

Docker Commands 

1. docker --version 
2. docker login -u "userid" -p "password"
3. docker image ls  -> display the list of images
4. docker image rm "image name"  -> remove the image

## Steps to delete a image.
Docker ps -a               # Lists containers (and tells you which images they are spun from)
Docker images              # Lists images  
Docker rm "container_id"   # Removes a container

Docker rmi "image_id"      # Removes an image 
                           # Will fail if there is a running instance of that image i.e. container

## Docker rmi -f "image_id"
<br /> 
## Containers<br />
Use docker container my_command<br />
	create — Create a container from an image.<br />
	start — Start an existing container.<br />
	run — Create a new container and start it.<br />
	ls — List running containers.<br />
	inspect — See lots of info about a container.<br />
	logs — Print logs.<br />
	stop — Gracefully stop running container.<br />
	kill —Stop main process in container abruptly.<br />
	rm— Delete a stopped container.<br />

Images<br />
Use docker image my_command<br />
	build — Build an image.<br />
	push — Push an image to a remote registry.<br />
	ls — List images.<br />
	history — See intermediate image info.<br />
	inspect — See lots of info about an image, including the layers.<br />
	rm — Delete an image.	<br />


docker version — List info about your Docker Client and Server versions.<br />
docker login — Log in to a Docker registry.<br />
docker system prune — Delete all unused containers, unused networks, and dangling images.<br />

<br />
docker container ls<br />
docker image ls<br />
docker container rm <container_id><br />
docker image rm <image_id><br />

