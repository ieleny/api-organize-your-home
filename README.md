# api-organize-your-home
Api para salvar os dados do projeto 'app-organize-your-home' 

# Tecnologies
- Java 17
- Java Spring boot
- Redis
- MySql (MariaDb)
- Lombok ( Tecnologia para códigos repetitivos com anotações)
- Maven (Gerenciador de dependências, build da aplicação)
- JDBC-JdbcTemplate (Persistência de banco de dados)

# Env file
Para que o projeto funcione, é preciso criar o arquivo .env com essas informações
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
Acesse a pasta api-java-docker e execute o comando:

``` docker compose up --build```

Obs: O nome do docker container irá ficar 'api-java-docker'

# Acessar a tela do phpMyAdmin - GUI banco de dados
```http://localhost:8000```

# Acessar a api via container
```http://localhost:8080/api/v1/material```

# Acessar o banco redis
``` docker exec -it redis redis-cli```
``` AUTH [PASSWORD] ```

# Todo
- Verbos da api
    - [Post] Add material
        - id (AUTO INCREMENT)
        - product-name (String)
        - quantity-bought (Float)
        - price-und (INTEGER)
    - [GET] GET material

- Versionamento de api
- Testes
- Docker
- Postman

# Regras de negocio

[X] Gerar o projeto Spring boot </br>
[X] Criar o aquivo docker-compose (PhpMyAdmin, MySql, Redis ) </br>
[X] Criar o deploy da aplicação em java e adicionar no docker </br>
[X] Criar um serviço que se conecte a um banco de dados relacional, utilize o JdbcTemplate do Spring para essa conexão o banco será Mysql(MariaDb). </br>
[X] Criar conexão para o servidor Redis. </br>
[X] Implementar uma API que retorne um objeto simples e utilize o Redis como cache. </br>
[X] O cache deve ter um TTL de 10 segundos. </br>
[X] O serviço deve ir ao banco de dados apenas na primeira requisição dentro desse intervalo de tempo, caso a resposta não seja nula. </br>
[] Colocar ao menos um teste de integração que valide a API. </br>
[X] É importante fornecer uma visibilidade do tempo gasto na construção. </br>
[x] O serviço deverá ser executado usando docker e subindo todas as suas sub-dependências. </br>
[X] Adicionar validação nos campos; </br>

Extras: </br>
[X] Add CORS </br>
[ ] Add Hateoas </br>
[ ] Add Validação de erro (Inserir, editar, atualizar e remover) </br>
[ ] Fazer com que o arquivo .env seja chamada dentro do arquivo application.properties</br>

# Tempo gasto na construção

[16/09/2023] - Criar arquivo Docker do Mysql,Redis,PhpMyAdmin. </br>
             - Estudar sobre o redis e testar como funciona. [3 horas]</br>
[17/09/2023] - Começo do estudo para entender como funciona o spring boot. [5 horas]</br>
[18/09/2023] - Criado a conexão com o banco MySql(Jdbc), </br>
             - Criado a migration com FlyWay</br>
             - A entidade Material </br>
             - Servico para conectar com o banco de dados </br>
             - Aplicar arquitetura Hexagonal </br>
             - Criado a inserção no banco de dados </br>
             - Criado a camada de persistencia de dados </br>
             - Interface padrão do IMaterialRepository(Interface segretation) [5 horas] </br>
[19/09/2020] - Criado a conexão com o redis </br>
             - Inserir no banco redis </br>
             - Listar no banco redis [5 horas] </br>
[21/09/2020] - Readme </br>
             - Ajustes </br>
             - TTL [5 horas] </br>
[22/09/2020] - Add Cors  </br>
             - Aplicação dos testes [2 horas]  </br>
 
# Links utilizados

Criar projeto spring boot: https://start.spring.io/
Documentação spring boot: https://spring.io/projects
Docker: https://www.docker.com/blog/kickstart-your-spring-boot-application-development/