# solo-in-docker
Using docker-compose to make solo running in docker with nginx, tomcat and mysql .

## how to use

* run "./build-image.sh" to pull mysql , nginx and tomcat image from hub.docker . 

* enter solo folder , config your project(maybe you do not need) . 

    than use "mvn clean install -Dmaven.test.skip=true" to generate a war file .
    
    mv the war file into ./webapps   
    
* run "docker-compose up -d" to start up    

* connect to mysql and create schema named solo .

* open your browser , and visit http://localhost/solo
    

    
                 
