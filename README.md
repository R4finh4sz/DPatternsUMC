===========================================
Sistema de Pedidos de Lanche - Java (Entrada Interativa via Console)
===========================================

📌 Objetivo
-----------
Este projeto foi desenvolvido como parte da atividade avaliativa de Padrões de Projeto da disciplina DPatterns, com o objetivo de aplicar os seguintes padrões de projeto em Java:

- Factory Method
- Strategy
- State
- Adapter
- Singleton

💻 Tecnologias Utilizadas
--------------------------
- Java 11+ 
- Scanner para entrada interativa via console
- Nenhuma biblioteca externa (somente Java SE)

📂 Estrutura de Pastas (sugestão)
----------------------------------
- `main.java` → Arquivo principal com a lógica do console
- `factory/` → Implementação do padrão Factory Method para criação dos lanches
- `strategy/` → Estratégias de desconto (10%, nenhum, etc.)
- `state/` → Representação dos estados do pedido (Novo, Preparando, Pronto)
- `adapter/` → Adaptador para integrar um lanche legado
- `singleton/` → Gerenciador único de pedidos (Singleton)

▶️ Como Executar
------------------
1. Certifique-se de ter o Java instalado e configurado.
2. Compile os arquivos `.java`:
3. Execute o programa:
4. Siga as instruções interativas no console para:
- Escolher o tipo de lanche
- Aplicar ou não desconto
- Acompanhar os estados do pedido

🧩 Padrões de Projeto Aplicados
-------------------------------
✅ **Factory Method**:
Usado para instanciar diferentes tipos de lanches (ex: Hambúrguer, Lanche Antigo), promovendo desacoplamento entre o sistema e a criação dos objetos.

✅ **Strategy**:
Permite a aplicação de diferentes estratégias de desconto ao pedido, selecionadas dinamicamente pelo usuário.

✅ **State**:
Representa as mudanças de estado do pedido, como "Novo", "Preparando" e "Pronto", simulando o ciclo de vida real de um pedido.

✅ **Adapter**:
Utilizado para integrar um tipo de lanche legado (por exemplo, um "LancheAntigo") que não seguia a interface padrão dos novos lanches.

✅ **Singleton**:
Garante que o sistema tenha uma única instância responsável por gerenciar todos os pedidos.

📚 Créditos
-----------
Atividade Avaliativa - DPatterns
Data de entrega: 27 de maio de 2025
Instituição: Universidade de Mogi das Cruzes
Disciplina: Padrões de Projeto em Java
Professor: José Felipe
Aluno: Rafael Souza Santana



