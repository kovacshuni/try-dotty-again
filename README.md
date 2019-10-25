# Simple akka-http running on Dotty compiler

## Usage

```
sbt compile
sbt run

curl -i localhost:8080/hello

HTTP/1.1 200 OK
Server: akka-http/10.1.10
Date: Fri, 25 Oct 2019 11:37:51 GMT
Content-Type: text/plain; charset=UTF-8
Content-Length: 26

I was compiled by dotty :)%
```

References:

* [dotty-example-project](https://github.com/lampepfl/dotty-example-project/blob/master/README.md).
