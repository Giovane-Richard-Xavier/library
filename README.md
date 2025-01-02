Descrição do Projeto: Library API

O projeto Library API é uma aplicação desenvolvida em Java utilizando o framework Spring Boot. Ele foi criado com o objetivo de gerenciar um sistema de biblioteca, permitindo o cadastro, consulta, atualização e exclusão de livros, além de funcionalidades relacionadas ao gerenciamento de empréstimos.

Principais Tecnologias Utilizadas
Spring Boot: Framework principal para simplificar o desenvolvimento e configuração da aplicação.
Spring Data JPA: Para abstração e manipulação de dados no banco de dados de forma eficiente.
Maven: Gerenciador de dependências e build do projeto.
Lombok: Redução de código boilerplate, como getters, setters, construtores, etc.
PostgreSQL Driver: Para conexão com o banco de dados relacional PostgreSQL.
Funcionalidades Principais
Gerenciamento de Livros:

Cadastro de livros com título, autor e ISBN.
Consulta de livros por parâmetros como título ou autor.
Atualização de informações de livros.
Exclusão de livros.
Gerenciamento de Empréstimos:

Registro de empréstimos vinculados a livros e usuários.
Devolução de livros com controle de prazos.
Listagem de empréstimos em aberto.
Arquitetura e Design
API RESTful: A aplicação segue os princípios REST para comunicação entre cliente e servidor.
Banco de Dados Relacional: PostgreSQL como banco de dados principal para armazenamento de dados.
Boas Práticas de Código: Utilização de padrões como DTOs, Services e Repositories para manter a separação de responsabilidades.
Como Executar o Projeto
Pré-requisitos:

Java 17+
Maven instalado
Banco de dados PostgreSQL configurado
Configuração:

Configure o arquivo application.properties ou application.yml com as credenciais do banco de dados.
Executando:

No terminal, execute:
bash
Copiar código
mvn spring-boot:run
Acessando a API:

A API estará disponível no endereço padrão: http://localhost:8080.
Endpoints Principais
Livros:

POST /api/books - Cadastrar livro.
GET /api/books - Listar livros.
PUT /api/books/{id} - Atualizar livro.
DELETE /api/books/{id} - Remover livro.
Empréstimos:

POST /api/loans - Registrar empréstimo.
PUT /api/loans/{id} - Finalizar empréstimo.
GET /api/loans - Listar empréstimos.
Este projeto é ideal para estudos e pode ser facilmente adaptado para cenários mais complexos.
