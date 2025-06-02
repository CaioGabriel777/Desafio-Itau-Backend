# 💼 Desafio Técnico – Banco Itaú

Este repositório contém a solução para um **desafio técnico proposto pelo Banco Itaú**, com o intuito de avaliar habilidades fundamentais no desenvolvimento de aplicações backend utilizando a linguagem Java.

## 🧠 Objetivo

Desenvolver uma API REST capaz de processar e analisar transações financeiras em tempo real, seguindo boas práticas de desenvolvimento e utilizando tecnologias modernas. O sistema foi projetado para ser simples, eficiente e organizado, atendendo a critérios como legibilidade, separação de responsabilidades e precisão no tratamento de dados financeiros.

## ⚙️ Funcionalidades

- Registro de transações com valores e data/hora de criação;
- Cálculo estatístico em tempo real (últimos 60 segundos) com informações como:
    - Quantidade total de transações (`count`);
    - Soma dos valores (`sum`);
    - Valor médio (`avg`);
    - Valor mínimo (`min`);
    - Valor máximo (`max`);
- Retorno automático de estatísticas zeradas quando não houver transações no intervalo recente.

## 🛠️ Tecnologias 

- **Java 21**
- Manipulação de datas com `OffsetDateTime`;
- Uso de `BigDecimal` para garantir precisão em valores monetários;
- API de `Streams` do Java para filtragem e agregações eficientes;
- Código limpo, com organização em camadas (`controller`, `service`, `repository`);
- Tratamento adequado de ausência de dados, evitando erros ou retornos inconsistentes.

## 🚀 Considerações

Este desafio foi realizado por um **estagiário em desenvolvimento backend Java**, com o objetivo de consolidar conhecimentos e demonstrar domínio sobre os fundamentos essenciais da linguagem e do ecossistema Java moderno.


---

🔗 **Link para o desafio original:**  
[https://github.com/feltex/desafio-itau-backend](https://github.com/feltex/desafio-itau-backend?tab=readme-ov-file)
