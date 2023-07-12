# API Rest em Java com Spring Boot

Este é um exemplo de uma API Rest simples em Java, desenvolvida com o framework Spring Boot e utilizando o sistema de automação de compilação Gradle. A API permite obter uma lista de produtos e seus departamentos associados.

A API estará disponível em http://localhost:8080/products, e você poderá acessá-la por meio de um client HTTP como Postman.

## Pré-requisitos
* Java JDK 8 ou superior instalado no sistema
* Gradle instalado para gerenciar as dependências e compilar o projeto

## Recursos da API
### Listar produtos
* Endpoint: /products
* Método: GET
* Descrição: Retorna uma lista de produtos e seus departamentos associados.

Exemplo de resposta:
```json
[{
        "id": 1,
        "name": "Macbook",
        "price": 4000.0,
        "department": {
            "id": 1,
            "nome": "Tech"
        }
    },
    {
        "id": 2,
        "name": "PC Gamer",
        "price": 5000.0,
        "department": {
            "id": 1,
            "nome": "Tech"
        }
    },
    {
        "id": 3,
        "name": "Pet House",
        "price": 300.0,
        "department": {
            "id": 2,
            "nome": "Pet"
        }
    }
]
```
