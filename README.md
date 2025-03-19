# ♨️ Web Service com Spring Boot e JPA/Hibernate

## 📌 Descrição  
Este projeto é um serviço web desenvolvido com **Spring Boot**, utilizando **JPA/Hibernate** para persistência de dados. Ele implementa um **CRUD completo** para gerenciamento de **usuários, pedidos e produtos**, seguindo a arquitetura **RESTful**.

---

## 🛠 **Tecnologias Utilizadas**  
✅ **Java 17**  
✅ **Spring Boot** (Spring Web, Spring Data JPA)  
✅ **Hibernate**  
✅ **Banco de Dados H2** (ambiente de testes)  
✅ **Maven**  
✅ **Postman** (para testes da API) 

<img src="https://skillicons.dev/icons?i=java,spring,hibernate,maven,postman," />

---

## 🏛 **Arquitetura do Projeto**  

### 📌 Camadas Lógicas  


![Logical Layers](https://github.com/user-attachments/assets/d1187d6e-af65-41e4-be29-3d7c4610c729)


- **Resource Layer**: Controladores REST  
- **Service Layer**: Lógica de negócio  
- **Data Access Layer**: Repositórios JPA  
- **Entities**: Modelos de domínio  

### 📌 Modelo de Domínio  
![Domain Model](https://github.com/user-attachments/assets/4f7308bb-7c53-4773-8fd4-07107fb78f44)

---

## 🔧 **Configuração do Projeto**  

### 🔹 **Criando o Projeto**  
O projeto foi gerado com o **Spring Initializr**, utilizando as seguintes dependências:  
📌 **Spring Web**  
📌 **Spring Boot Starter Data JPA**  
📌 **H2 Database**  

### 🔹 **Configuração do Banco de Dados**  

📄 `application.properties`:
```properties
spring.profiles.active=test
spring.jpa.open-in-view=true
```

## **🔥 Funcionalidades Implementadas**

### **📍 Gerenciamento de Usuários**

- Criar, buscar, atualizar e deletar usuários.
- Exemplo de requisição **POST**:

```json
json

{
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755",
  "password": "123456"
}

```

### **📍 Gerenciamento de Pedidos e Pagamentos**

- Associação de pedidos com usuários.
- Implementação de status (`WAITING_PAYMENT`, `PAID`, `SHIPPED`, etc.).

### **📍 Produtos e Categorias**

- Relacionamento **Many-to-Many** entre produtos e categorias.

### **📍 Tratamento de Exceções**

- `ResourceNotFoundException` para buscas inválidas.
- `DatabaseException` para falhas no banco de dados.

---

## ▶️ **Como Executar o Projeto**

### 🔹 **Clonar o Repositório**

```bash
bash

git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio

```

### 🔹 **Executar a Aplicação**

```bash
bash

./mvnw spring-boot:run

```

### 🔹 **Acessar o Banco de Dados H2**

- 🌍 **URL**: http://localhost:8080/h2-console
- 🔗 **JDBC URL**: `jdbc:h2:mem:testdb`

---

## 📬 **Endpoints da API**

| Método | Endpoint | Descrição |
| --- | --- | --- |
| `GET` | `/users` | Lista todos os usuários |
| `GET` | `/users/{id}` | Busca usuário por ID |
| `POST` | `/users` | Adiciona novo usuário |
| `PUT` | `/users/{id}` | Atualiza usuário |
| `DELETE` | `/users/{id}` | Remove usuário |

---

## 📜 **Licença** | [![NPM](https://img.shields.io/npm/l/react)](https://github.com/sidneigoes/projetocurso-springboot3.4.3-jpa/blob/main/LICENSE)

Este projeto está sob a **MIT License**. 


