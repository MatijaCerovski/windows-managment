# windows-managment

#DOCKER BUILD
$ docker build -t spring-boot-windows-managment-app .


#RUN
$ docker run -d -p 5000:8080 spring-boot-windows-managment-app

#SHUTDOWN
GET /shutdown

#COMMANDER
POST /commander
Request Body
{
    "command": "calc"
}