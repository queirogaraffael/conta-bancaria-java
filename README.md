# Conta Bancária - Java

Este projeto é uma simulação simples de uma conta bancária desenvolvida em Java, utilizando o console como interface. O sistema permite a criação de uma conta com ou sem depósito inicial, além de operações básicas de depósito e saque.

## Funcionalidades

- Criação de conta com número e titular.
- Depósito inicial opcional.
- Realização de depósitos e saques.
- Exibição dos dados da conta atualizados após cada operação.

## Regras de Negócio

- Cada saque possui uma taxa fixa de R$ 5,00.
- O saldo é atualizado automaticamente após cada operação.

## Estrutura do Projeto

- **Pacote `application`**  
  Contém a classe `Program`, responsável pela lógica principal da aplicação e interação com o usuário via terminal.

- **Pacote `entities`**  
  Contém a classe `Account`, que representa uma conta bancária com número, nome do titular e saldo.

## Tecnologias

- Java SE
- Programação Orientada a Objetos
- `Scanner` para entrada de dados via terminal

## Exemplo de Uso

1. O usuário informa os dados da conta.
2. O sistema pergunta se há depósito inicial.
3. Em seguida, é possível fazer depósitos e saques.
4. A cada etapa, os dados da conta são exibidos atualizados.

---

Projeto com fins educacionais para prática de conceitos básicos de POO em Java.
