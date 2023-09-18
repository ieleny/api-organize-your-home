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

``` docker compose up ```

Obs: O nome do docker container irá ficar 'api-java-docker'

# Execute Java spring boot
I terminal 
``` mvn spring-boot:run ```

# Todo
- Verbos da api
    - [Post] Add material
        - id (AUTO INCREMENT)
        - product-name (String)
        - quantity-bought (Float)
        - price-und (INTEGER)
    - [GET] GET material
    - [GET] GET material by id
    - [PATCH] UPDATE material  
    - [DELETE] Delete material

- Versionamento de api
- Testes
- Docker
- Postman

# Regras de negocio

[X] Gerar o projeto Spring boot
[X] Criar o aquivo docker-compose (PhpMyAdmin, MySql, Redis )
[ ] Criar o deploy da aplicação em java e adicionar no docker 
[X] Criar um serviço que se conecte a um banco de dados relacional, utilize o JdbcTemplate do Spring para essa conexão o banco será Mysql(MariaDb). 
[] Criar conexão para o servidor Redis.
[] Implementar uma API que retorne um objeto simples e utilize o Redis como cache.
[] O cache deve ter um TTL de 10 segundos.
[] O serviço deve ir ao banco de dados apenas na primeira requisição dentro desse intervalo de tempo, caso a resposta não seja nula.
[] Colocar ao menos um teste de integração que valide a API.
[X] É importante fornecer uma visibilidade do tempo gasto na construção.
[] O serviço deverá ser executado usando docker e subindo todas as suas sub-dependências.
[ ] Add validação ao (Inserir, editar, atualizar e remover)
[ ] Fazer com que o arquivo .env seja chamada dentro do arquivo application.properties

Extras:
[ ] Add CORS


# Tempo gasto na construção

[16/09/2023] - Criar arquivo Docker do Mysql,Redis,PhpMyAdmin. 
             - Estudar sobre o redis e testar como funciona. [3 horas]
[17/09/2023] - Começo do estudo para entender como funciona o spring boot. [5 horas]
[18/09/2023] - Criado a conexão com o banco MySql(Jdbc), 
             - Criado a migration com FlyWay
             - A entidade Material 
             - Servico para conectar com o banco de dados
             - Aplicar arquitetura Hexagonal
             - Criado a inserção no banco de dados
             - Criado a camada de persistencia de dados
             - Interface padrão do IMaterialRepository(Interface segretation) [5 horas]

# Links utilizados

Criar projeto spring boot: https://start.spring.io/
Documentação spring boot: https://spring.io/projects
