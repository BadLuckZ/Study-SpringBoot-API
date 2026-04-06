# Study Spring Boot

Resource: [Spring Boot](https://www.jetbrains.com/help/idea/spring-support.html)

- Database Connection (PostgreSQL)
    1. Resources
       - https://www.jetbrains.com/help/idea/relational-databases.html#first-steps
       - https://www.jetbrains.com/help/idea/data-sources-and-drivers-dialog.html#overview
  
    2. In `src/main/resources/application.properties`, add...
        ```
        spring.datasource.url=jdbc:<driver>://<path>:<port>/<dbname>
        spring.datasource.username=<username>
        spring.datasource.password=<password
       ```
  
    3. In `pom.xml`, add this and restart Maven
          ```
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-data-jpa</artifactId>
            </dependency>
        
            <dependency>
                <groupId>org.postgresql</groupId>
                <artifactId>postgresql</artifactId>
            </dependency>
          ```
