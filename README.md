# spring-boot-profiles

# Profiles for DEV and STAGE and PROD Environments project for Spring Boot

## Developed By Rasel Ahmed

[JDK 17]()

[Spring Tools 4 for Eclipse](https://spring.io/tools)

[IntelliJ IDEA](https://www.jetbrains.com/idea/download)

# Application API url:
```
# DEV server 
http://localhost:8080/
# STAGE server 
http://localhost:8082/
# PROD server 
http://localhost:8081/
```

## Spring Boot Profiles for DEV and STAGE and PROD Environments

Build Server CLI Mode:

```bash
# Development
mvn -Pdev clean install

# Staging
mvn -Pstage clean install

# Production
mvn -Pprod clean install
```

Build Server for Eclipse:

```bash
# Development
-Pdev clean install

# Staging
-Pstage clean install

# Production
-Pprod clean install
```

# Run your application with different profiles

```bash
java -jar application-name.jar --spring.profiles.active=dev
```
