Simple-Scala-Dropwizard-Service
===============================

This is the dropwizard example service ( http://dropwizard.codahale.com/getting-started/ ) using Scala.

Running it with maven:
---------------------

> $ mvn scala:run

Packaging and running the from the jar:

> $ mvn package

> $ java -jar ./target/dropwizard-scala-service-1.0-SNAPSHOT.jar server

Running it with sbt
-------------------

> $ sbt

> run server


Endpoints
---------

The service only contains the resource HelloWorld, therefore the endpoints available are:

http://localhost:8080/hello-world

http://localhost:8080/hello-world?q=victor

(admin page) -> http://localhost:8081/

(run gc) -> http://localhost:8080/tasks/gc

