<h1 align="center">
  Api Microsserviço de envio de email
</h1>


<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#Config">Config</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
</p>


<br>


## 🚀 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- [Spring](https://spring.io/)
- [Jpa](https://spring.io/projects/spring-data-redis)
- [Spring Boot Starter Mail](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-mail)
- [RabbitMQ](https://www.rabbitmq.com/)
- [Postgresql](https://www.postgresql.org/)
- [lombok](https://projectlombok.org/)


## 💻 Projeto

Esse projeto tem como objetivo desmotar um microsserviço de envio de email via smtp,
utilizando servidor de mensageria RabbitMQ.


## Config
Guia para gerar código de 16 dígitos para 
configurar o smtp do gmail:https://support.google.com/accounts/answer/185833

## :hammer: Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

## Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto com eureka:

```
http://localhost:8080
```



## 📝 Licença

Este projeto esta sobe a licença MIT. Veja a [LICENÇA](https://opensource.org/licenses/MIT) para saber mais.


