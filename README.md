# api-organize-your-home
Api to save the data the project organize your home

# Tecnologies
- Java Spring boot
- Redis
- MySql (MariaDb)

# Env file
For project work, you need create a file .env with data:
```` 
    #----------------------#
    # MysSql Maria db      #
    #----------------------#
    MYSQL_ROOT_PASSWORD=
    MYSQL_PORT=3306
    MYSQL_PASSWORD=
    MYSQL_USER=

    #----------------------#
    # PhpMyAdmin           #
    #----------------------#
    PHPMYADMIN_PORT=8000

    #----------------------#
    # Redis Maria db       #
    #----------------------#
    REDIS_PORT=6379
    REDIS_PASSWORD=
````

# Database MariaDb
Root name is: 'Root'

# Execute commands docker
Access docker folder and up the command to up the container  

``` docker compose up ```

Obs: The name of the container docker is 'api-java-docker'

# Todo
- Verbs api
    - [Post] Add material
        - id (AUTO INCREMENT)
        - product-name (String)
        - quantity-bought (Float)
        - price-und (INTEGER)

    - [GET] GET material
    - [GET] GET material by id
    - [PATCH] UPDATE material  
    - [DELETE] Delete material

- Testes
- Docker
- Postman



