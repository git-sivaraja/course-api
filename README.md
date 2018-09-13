"# course-api" 

To run this as a docker image

sudo docker run -d -p 8181:8181 sivaraja/course-api-data

To test the spring boot app,

download postman chrome plugin and following steps on it.  

1.To test the docker container runs the application correctly, issue a GET request from Postman plugin on url http://localhost:8181/hello .

2.To add a new  topic, to the database, issue a POST request  with content type json  on http://localhost:8181/topics .

JSON Body of the request:
=========================

    {
        "id": "java-awt",
        "name": "java-awt updated Framework",
        "description": "java-awt updated framework description..."
    }
    
IT will be stored on the embedded derby database.

3.Now to verify, whether its stored in the database, issue the GET request on http://localhost:8181/topics
 you will get the java-awt topic back as json...
