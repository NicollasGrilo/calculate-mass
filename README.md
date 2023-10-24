# Calculate Mass
API RESTful calcula o volume de massa

## Requisitos
* Java JDK 17
* Maven 3.9.1

## **Running local**

1. Building: execute o comando Maven abaixo.
```sh
$ mvn clean package
```
2. Running: execute o service java com o comando abaixo:

```sh
$ java -jar target/calculate-mass-0.0.1-SNAPSHOT.jar
```

3. EndPoints
```sh
$ curl -X GET "http://localhost:8080/api/v1/calculate/mass" -H "accept: */*" 
```

