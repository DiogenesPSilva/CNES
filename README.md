# Desafio API REST

Criar uma aplicação para ler e apresentar dados do Cadastro Nacional de Estabelecimentos de Saúde (CNES).

Para mais detalhes: https://app-desafiocnes.herokuapp.com/swagger-ui.html

# Requisitos Mínimos:
O Sistema deve conter três visões:

- Lista de CNES;
- CNES por tipos;
- CNES por Estado;

# Sobre a aplicação

A [aplicação] foi desenvolvida com as seguintes ferramentas:

Ferramenta | Descrição
 ------ | ------
 Java 1.8 | Desenvolvimento
 Spring | Framework API REST 
 PostgreSQL | Banco de dados 
 PostMan/Swagger | Testar as requisições 
 JUnit | Testes 
 Github | Versionamento 
 Swagger | Documentação de API 
 Heroku | Plataforma de aplicação 
 [Vue JS] | Front-End
 
### Observação:
O front-end tem limitações que precisam de correção.

### O que melhorar:
* Performance das consultas
* Desenvolver com técinas de TDD e SOLID.
* Configuração do ambiente utilizando [Docker].
* O front-end da aplicação (é algo que já estou estudando mas preciso dar mais atenção)
* Criação de filtros e gráficos para apresentar de forma mais agradável os resultados das consultas

### Observações:

Devido ao Heroku limitar a quantidade de registros na base de dados, existem apenas 9200 registros no nele.

### Como testar:

- Baixar a aplicação do github;
- exportar para uma IDE java;
- Alterar application.properties para um banco de dados;
- Alterar se necessário o arquivo pom.xml;
- Executar o arquivo pom.xml
- Executar o servidor;
- Preencher a base com dados do arquivo.
- Executar teste via navegador

[aplicação]: <https://app-desafiocnes.herokuapp.com/swagger-ui.html>
[Docker]: <https://www.docker.com/>
[Vue JS]: <https://vuejs.org/>
