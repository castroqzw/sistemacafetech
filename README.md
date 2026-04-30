# ☕ Café Tech - Sistema de Pedidos em Java

## 📌 Descrição

O **Café Tech** é um sistema simples desenvolvido em **Java** como estudo, com a proposta de simular um atendimento de pedidos em uma cafeteria.
O programa permite que um cliente selecione produtos, informe quantidades, receba descontos automáticos e até faça doações para uma ONG.

Ao final da execução, o sistema gera um **relatório geral** com o total arrecadado, quantidade de pedidos e outras informações importantes.

---

## 🎯 Funcionalidades

* Cadastro do **nome do cliente**
* Menu com produtos disponíveis
* Cálculo automático do **valor total**
* Aplicação de **descontos automáticos**
* Opção de **doação para ONG**
* Contagem de **Capuccinos vendidos**
* Relatório final com:

  * Total arrecadado no dia
  * Quantidade de pedidos
  * Média de doações

---

## 🧾 Produtos Disponíveis

| Código | Produto             | Preço                                                        |
| ------ | ------------------- | ------------------------------------------------------------ |
| 1      | Café Expresso       | R$ 6,00                                                      |
| 2      | Capuccino           | R$ 9,00                                                      |
| 3      | Pão de queijo       | R$ 5,00                                                      |
| 4      | Cookie de chocolate | R$ 12,00 (até 3 unidades) <br> R$ 10,00 (mais de 3 unidades) |

---

## 💸 Regras de Desconto

O sistema aplica descontos automaticamente com base no valor do pedido:

* **5% de desconto** → para pedidos **a partir de R$ 50**
* **10% de desconto** → para pedidos **acima de R$ 150**

---

## 🤝 Doação para ONG

O cliente pode escolher ajudar uma ONG.

Se escolher **Sim**:

* Será adicionado **2% do valor do pedido** como doação.
* O valor da doação é registrado para cálculo da média final.

---

## 📊 Relatório Final

Ao encerrar o sistema, são exibidas as seguintes informações:

* 💰 Total arrecadado no dia
* 📦 Quantidade total de pedidos
* ☕ Quantidade de Capuccinos vendidos
* 🤝 Média de doações realizadas

---

## ▶️ Como Executar o Programa

```bash
java Main
```

---

## 📌 Exemplo de Execução

```
Digite o nome do cliente: João

===========================
Bem vindo(a) a Café Tech!
===========================
1 - Café Expresso
2 - Capuccino
3 - Pão de queijo
4 - Cookie de chocolate
0 - Encerrar pedido
===========================
Selecione seu produto: 2

Digite quantos você irá comprar: 3

Deseja ajudar a ONG? (1-Sim / 2-Não)

Cliente: João
Total do pedido: R$ 27.54
```

---

## 📚 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de praticar:

* Lógica de programação
---
* Estruturas condicionais
* Estruturas de repetição
* Entrada e saída de dados em Java
* Organização de código

---
