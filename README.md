## QuarkTask
Aplicação Web de tarefas
✅ QuarkTask - Aplicativo de Gerenciamento de Tarefas
quarkTask é uma aplicação web simples para gerenciamento de tarefas diárias. O projeto foi desenvolvido com Java e Spring Boot no backend, permitindo criar, listar, atualizar e excluir tarefas com facilidade.

## 🚀 Tecnologias utilizadas
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Lombok

## 🧩 Funcionalidades
- ✅ Criar nova tarefa
- 📝 Editar tarefa existente
- 📋 Listar todas as tarefas
- 🗑️ Excluir tarefa
- 🔁 Marcar como concluída / pendente
- 🔍 Filtrar tarefas por status (concluída/pendente)
- Funcionalida implemntadas do email(a, b, c, d, e) 

## 📦 Como executar o projeto
- 🛠️ Pré-requisitos
- Java 21+
- JDK
- Maven
- prostgres


## ☕ Backend (Spring Boot)
# Clone o repositório
git clone [https://github.com/seu-usuario/taskmanager.git](https://github.com/Cpimentel/QuarkTask.git)

## 📌 Organização do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com.example.taskmanager/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       └── service/
│   └── resources/
│       └── application.properties
```


## 🗃️ Banco de Dados
Postgres Sql ( Alterar os codigos abaixo no application.properties e cria uma tabela newBank no postgres)
spring.datasource.url=jdbc:postgresql://localhost:5432/newbank
spring.datasource.username=user
spring.datasource.password=senha do banco

OBS: o flymigration cuidará da estrutura e primeira inserção de dados na tabela

📌 Carregue o Maven e suas dependencias e Execute o QuarkTasksApplication

## 📡 Endpoints da API

Abaixo estão os principais endpoints da aplicação divididos por funcionalidade:

### 🔐 Segurança

- `POST /login` - Realiza o login e retorna o token JWT.                           -  http://localhost:8080/auth/login
- `POST /register` - Registra um novo usuário no sistema.                          -  http://localhost:8080/auth/register

#### JSON do reister e login
 `{
  "login": "CLEITON",
  "password": "123456789",
  "role": "USER"
}
`
 
 `{
  "login": "CLEITON",
  "password": "123456789"
}
`

### 👤 Responsável

- `GET /responsible` - Lista todos os responsáveis cadastrados.                    -  http://localhost:8080/responsible
- `POST /responsible` - Cria um novo responsável.                                  -  http://localhost:8080/responsible

#### JSON do Responsible
 `{
        "name": "Quark"
}
`

### ✅ Tarefa

- `GET /task` - Retorna todas as tarefas.                                          -  http://localhost:8080/api/v2/task
- `GET /task/{id}` - Retorna os detalhes de uma tarefa específica.                 -  http://localhost:8080/api/v2/task/1
- `POST /task` - Cria uma nova tarefa.                                             -  http://localhost:8080/api/v2/task
- `PUT /task` - Atualiza uma tarefa existente.                                     -  http://localhost:8080/api/v2/task/2
- `DELETE /task` - Remove uma tarefa.                                              -  http://localhost:8080/api/v2/task/1
- `PATCH /task/conclude` - Marca uma tarefa como concluída.                        -  http://localhost:8080/tasks/1/concluir

#### JSON do Task
 `{
  "title": "Finalizar API",
  "description": "Documentar todos os endpoints da aplicação",
  "responsible_id": 1,
  "priority": "Alta",
  "deadline": "2025-06-10",
  "concluded": false
}
`
## ▶️ Como executar o Angular

### 🔧 Pré-requisitos

- Node.js instalado: https://nodejs.org/
- Angular CLI instalado globalmente:

###  1. Comando
```bash
npm install -g @angular/cli
```
###  2. Instale as dependências

```bash
npm install
```

### 🚀 3. Inicie o servidor de desenvolvimento

```bash
ng serve
```

Acesse em: `http://localhost:4200`

Ou use o comando abaixo para abrir automaticamente no navegador:

```bash
ng serve --open
```
