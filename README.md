# Product Catalog API

![Java](https://img.shields.io/badge/Java-21-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.4-brightgreen) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-blue) ![Postman](https://img.shields.io/badge/Postman-API%20Testing-red)

Bem-vindo ao **Product Catalog API**, um projeto de backend desenvolvido para gerenciar um catálogo de produtos de forma eficiente e moderna. Esta API RESTful foi criada como parte do meu portfólio para demonstrar habilidades em desenvolvimento backend com Java e Spring Boot, integração com banco de dados relacional e deploy em ambiente de produção.

## 📋 Descrição do Projeto

O **Product Catalog API** é uma aplicação backend que permite criar, listar, buscar, atualizar e deletar produtos em um catálogo. O projeto foi estruturado seguindo boas práticas de arquitetura em camadas e testado com Postman para garantir funcionalidade e robustez.

### Funcionalidades
- **GET /products**: Lista todos os produtos cadastrados.
- **GET /products/{id}**: Busca um produto específico por ID.
- **POST /products**: Cria um novo produto.
- **PUT /products/{id}**: Atualiza um produto existente.
- **DELETE /products/{id}**: Remove um produto do catálogo.

## 🛠️ Tecnologias Utilizadas
- **Java 21**: Linguagem principal do projeto.
- **Spring Boot 3.4.4**: Framework para construção da API REST.
- **PostgreSQL**: Banco de dados relacional para persistência.
- **Postman**: Ferramenta para testes das rotas da API.
- **Maven**: Gerenciamento de dependências.
- **IntelliJ IDEA**: IDE utilizada no desenvolvimento.

## 🚀 Como Rodar o Projeto Localmente

### Pré-requisitos
- Java 21 JDK instalado
- Maven instalado
- PostgreSQL instalado e configurado
- Postman (opcional, para testes)

### Passos
1. **Clone o repositório:**
   ```bash
   git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git
   cd SEU_REPOSITORIO
   ```

# Configuração e Execução do Projeto

## 📂 Configure o banco de dados
1. Crie um banco no PostgreSQL chamado `product_catalog`.
2. Atualize o arquivo `src/main/resources/application.properties` com suas credenciais:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/product_catalog
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.jpa.hibernate.ddl-auto=update
```

## ▶️ Execute a aplicação
No terminal, utilize o comando:

```
mvn spring-boot:run
```
A aplicação estará disponível em: http://localhost:8080

# 📬 Testando com Postman
Uma coleção do Postman foi exportada e está disponível no repositório como Product Catalog API.postman_collection.json. Siga os passos abaixo para utilizá-la:

Abra o Postman.
1. Clique em Import (no canto superior esquerdo).
2. Arraste ou selecione o arquivo Product Catalog API.postman_collection.json do repositório.
3. Configure a variável de ambiente baseUrl no Postman:
4. Valor padrão: http://localhost:8080 (ou a URL do deploy, quando disponível).
5. Execute as requisições da coleção para testar todas as funcionalidades.

# 🏗️ Estrutura do Projeto
O projeto segue a arquitetura em camadas padrão do Spring Boot:

- Controller: Camada de entrada que gerencia as requisições HTTP.
- Service: Lógica de negócios e regras da aplicação.
- Repository: Integração com o banco de dados via Spring Data JPA.
- DTO: Objetos de transferência de dados para padronizar a comunicação.
- Model: Entidades mapeadas para o banco de dados.

Exemplo de Estrutura:

```
src/main/java/com/example/productcatalog
├── controller
│   └── ProductController.java
├── service
│   └── ProductService.java
├── repository
│   └── ProductRepository.java
├── dto
│   └── ProductDTO.java
├── model
│   └── Product.java
```
# 🌐 Deploy em Produção
A API foi implantada em [Render/Railway] e estará disponível em:

🔗  (em breve, após conclusão do deploy)

# 📸 Demonstração
(Adicione capturas de tela ou GIFs dos testes no Postman aqui após gerá-los)

# 📌 Próximos Passos
Adicionar autenticação com Spring Security.

Implementar paginação na listagem de produtos.

Criar testes unitários com JUnit e Mockito.

# 👤 Desenvolvido por
[SEU_NOME] 📧 [SEU_EMAIL] | [SEU_LINKEDIN]