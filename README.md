# Codex das Criaturas Épicas 🐉✨

> Um bestiário digital inspirado em D&D e Terra Média, para você explorar criaturas mágicas, seus poderes e histórias, tudo com uma interface temática medieval.

---

## 🚀 Sobre o Projeto

O **Codex das Criaturas Épicas** é uma aplicação full-stack que traz um catálogo interativo de criaturas fantásticas. Ideal para fãs de RPG, fantasia e quem quer aprender a desenvolver uma aplicação moderna com Java Spring Boot, Angular e MySQL.

Você poderá navegar pelos cards das criaturas, filtrá-las por tipo, visualizar detalhes, e futuramente adicionar e editar essas criaturas mágicas.

---

## 📚 Funcionalidades

- Listagem de criaturas mágicas com cards estilo "grimório"
- Filtros por tipo (Dragão, Orc, Fada, etc.)
- Página/modal com detalhes completos da criatura
- Cadastro, edição e exclusão de criaturas (inicialmente interno)
- Interface temática com visual medieval (cores sépia e fontes antigas)

---

## 🛠 Tecnologias Utilizadas

| Camada         | Tecnologia                    |
| -------------- | ---------------------------- |
| Backend        | Java 17 + Spring Boot        |
| Persistência   | MySQL                       |
| Frontend       | Angular                      |
| Build          | Maven (backend)              |
| Estilo Visual  | CSS customizado com tema medieval |

---

## ⚙️ Estrutura do Projeto

- `/backend` — API REST em Spring Boot
- `/frontend` — SPA em Angular consumindo a API
- Banco de dados MySQL para armazenar as criaturas

---

## 🔧 Como Rodar o Projeto

### Backend

1. Configure o MySQL e crie o banco `codex_epico`
2. Atualize as credenciais no arquivo `application.properties` (backend/src/main/resources)
3. Rode o backend:  
   ```bash
   ./mvnw spring-boot:run

### Frontend

> npm install

### Rodar front end
> ng serve

