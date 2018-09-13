"# course-api" 

To run this as a docker image

sudo docker run -d -p 8181:8181 sivaraja/course-api-data

To test the spring boot app,

download postman chrome plugin and 
try  
1.GET request on http://localhost:8181/hello

2. POST request  with content type json  on http://localhost:8181/topics  

    {
        "id": "java-awt",
        "name": "java-awt updated Framework",
        "description": "java-awt updated framework description..."
    }
IT will be stored on the embedded derby database.

3. Now GET request on http://localhost:8181/topics
 you will get the java-awt topic back as json...
