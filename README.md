# Spring Boot RESTful Web Service

Este projeto é um exemplo de serviço web RESTful simples usando Spring Boot. Ele inclui um controlador que responde a solicitações HTTP GET e retorna uma saudação personalizada.

## Requisitos

- Java 8 ou superior
- Maven 3.2+ ou Gradle 4+

## Estrutura do Projeto

```bash
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── restservice
│   │   │               ├── GreetingController.java
│   │   │               └── Greeting.java
│   └── resources
│       └── application.properties
└── pom.xml
```

## Descrição

### GreetingController.java

Esta classe define um controlador REST que lida com solicitações HTTP GET na rota `/greeting`.

- **@RestController**: Marca a classe como um controlador REST.
- **@GetMapping("/greeting")**: Mapeia requisições HTTP GET para o método `greeting()`.
- **@RequestParam**: Vincula o valor do parâmetro de consulta "name" ao parâmetro do método. Se ausente, usa "World" como padrão.
- **AtomicLong**: Garante operações atômicas e seguras entre múltiplas threads.

### Greeting.java

Esta classe é um simples objeto de domínio que representa uma saudação com `id` e `content`.

## Executando o Projeto

1. Clone o repositório:
    ```bash
    git clone https://github.com/tiagomend/restservice.git
    cd seu-repositorio
    ```

2. Compile e execute a aplicação:
    ```bash
    ./mvnw spring-boot:run
    ```

3. Acesse a aplicação:
    [http://localhost:8080/greeting](http://localhost:8080/greeting)

    Para uma saudação personalizada, adicione o parâmetro `name` na URL:
    ```bash
    http://localhost:8080/greeting?name=Fulano
    ```

## Licença

Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Este README fornece uma visão geral concisa e orientações básicas para executar o projeto.