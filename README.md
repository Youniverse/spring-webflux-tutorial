# Spring Webflux Tutorial - Reactive Programming with Kotlin and R2DBC

This repository contains the source code for the [Spring Webflux Tutorial - Reactive Programming with Kotlin and R2DBC](https://youniverse.com/blog-entry-1.html) on [Youniverse](https://youniverse.com).

## How to start the database
Use the docker compose file in the root directory to start the database. There is also a init script, that will create a message table and some test data.
```bash
docker-compose up -d
```

## How to run the application
You can run the application with the following command:
```bash
./gradlew bootRun
```
## How to test the application
In order to check if the application is working, you can use the http client file [messages.http](./http/messages.http)


## Questions or suggestions?
If you have any questions or suggestions, feel free to create an issue or contact us on [info@youniverse.com](mailto:info@youniverse.com?subject=Question%20about%20Spring%20Webflux%20Tutorial)


![](https://youniverse.com/images/logo.png)