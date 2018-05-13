# solo-in-docker
Make solo running in docker , also included mysql .

## how to use

* mkdir 

    * /Users/docker/mysql/data
    
    * /Users/docker/mysql/conf
    
    and make sure , they have write permission .     
    
* cp ./mysqld.conf to /Users/docker/mysql/conf

* use 

        docker-compose up -d mysql
        
    to start mysql 
    
* connect to mysql , and create solo database  , than move your frm files into it . 

    
                 
