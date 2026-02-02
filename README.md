# Programação Orientada a Objetos em Java ☕

Este repositório contém a resolução da lista de exercícios fundamentais de POO, desenvolvida durante a graduação de **Engenharia de Computação**. O projeto foca na transição do paradigma procedimental para o orientado a objetos, aplicando conceitos de abstração, encapsulamento e lógica de negócio.

## 🛠️ Especificações Técnicas

Ambiente de desenvolvimento configurado para alta fidelidade entre o código-fonte e ambientes de execução Linux (Cloud/Servers).

* **Autor:** Rafael Sampaio Oliveira (Engenheiro de Computação)
* **IDE:** Antigravity (v1.15.8) | Build: 2026-01-24
* **Ambiente:** WSL 2 (Ubuntu 20.04/22.04 LTS)
* **Linguagem:** OpenJDK 11.0.27 (LTS)
* **Hardware:** Lenovo ThinkPad | AMD Ryzen 7 7730U | 16GB RAM | SSD 512GB

---

## 🏗️ Estrutura do Repositório

O projeto está organizado em blocos lógicos que representam a evolução do aprendizado:

### 📂 Bloco_01: Fundamentos e Abstração
Foco na criação de classes como "moldes" para objetos e gerenciamento de memória (Stack vs Heap).
* **Pessoa:** Criação de instâncias independentes.
* **Carro:** Prova de independência de objetos na memória.
* **Conta Bancária (V1):** Manipulação direta de atributos.
* **Lâmpada:** Controle de estado qualitativo (Ligado/Desligado).

### 📂 Bloco_02: Comportamento e Encapsulamento
Introdução de métodos com parâmetros, retornos e proteção de dados.
* **Produto:** Métodos com processamento lógico (cálculo de estoque).
* **Paciente:** Implementação de cálculos matemáticos (IMC) com saída formatada (`printf`).
* **Funcionário:** Métodos com parâmetros para reajuste salarial.
* **Pessoa & Endereço:** Implementação de **Composição de Objetos**.

### 📂 Bloco_03: Lógica Avançada e Interatividade
Integração de estruturas de repetição, coleções e entrada de dados do usuário.
* **Termômetro:** Encapsulamento com validação de dados (Setters customizados).
* **Estudante:** Manipulação de **Arrays de Objetos** e laços `for`.
* **Sistema de Login:** Comparação de Strings (`.equals`) e interatividade com `Scanner`.
* **Agente de Saúde:** Sistema de diagnóstico com múltiplas condicionais e lógica de decisão.

---

## 🚀 Conceitos de Engenharia Aplicados

1.  **Encapsulamento:** Uso de modificadores `private` para garantir a integridade dos dados e o uso de métodos acessores (Getters/Setters).
2.  **Abstração:** Modelagem de entidades do mundo real em classes coesas.
3.  **Responsabilidade Única:** Classes de modelo focadas em dados e comportamento, separadas das classes de teste.
4.  **Higiene de Código:** Gerenciamento de recursos (fechamento de fluxos com `scanner.close()`).

---

## 🔧 Como Executar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/nome-do-repositorio.git](https://github.com/seu-usuario/nome-do-repositorio.git)
   ```

2. Navegue até a pasta do bloco/questão:
   ```bash
   cd Bloco_03/Questao15_AgenteSaude
   ```

3. Compile os arquivos .java:
   ```bash
   javac *.java
   ```

4. Execute a classe de teste:
   ```bash
   java TesteAgenteSaude2
   ```

## 📈 Evolução e Próximos Passos
Este repositório serve como base sólida de Programação Orientada a Objetos. Os próximos passos incluem o estudo de:

* Herança e Polimorfismo.
* Interfaces e Classes Abstratas.
* Tratamento de Exceções customizadas.
* Persistência de dados (Integração com bancos de dados).

## 👨‍💻 Sobre o Autor

**Rafael Sampaio Oliveira**
* Profissional de TI com mais de 10 anos de experiência.
* Graduando em Engenharia de Computação com IA no **UNI-CET**.
