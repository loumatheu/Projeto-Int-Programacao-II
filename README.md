# Projeto Farmácia
Sistema - Farmácia

## Integrantes do grupo 
 * Daniel Oliveira Carneiro Leão - danielsestudos@gmail.com
 * Luiz Henrique de Menezes Carvalho - lhmc0321@gmail.com
 * Luiz Matheus dos Santos Silva - luiz.matheus.77985@gmail.com
 * Nycolle Nailde de Oliveira Bezerra - nycknailde@gmail.com
 * Tom Jones Silva Gomes Ramos - didinho200291@gmail.com


## Descrição geral do projeto 
O programa deve ser capaz de permitir o gerenciamento de funcionários, clientes, produtos e vendas em uma farmácia, permitindo que sejam registrados e excluídos funcionários por administradores (checados por login e senha), enquanto produtos, clientes e vendas podem ser gerenciados por qualquer funcionário.


## Requisitos do projeto
 * **REQ1** - O sistema deve controlar o acesso através de login e senha. Os usuários do sistema serão do tipo administrador e funcionário.

 * **REQ2** - O sistema deve permitir a venda de produtos cadastrados, e cada venda estará associada a um único cliente.
 
 * **REQ3** - Ao realizar uma venda, o sistema deve salvá-la em um histórico de vendas associado ao cliente. O sistema também deve permitir acesso ao histórico de compras do cliente.

 * **REQ4** - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de clientes e produtos, e algumas dessas ações podem ser realizadas por funcionários comuns, entretanto, para realizar criação de produtos, alteração e exclusão de produtos, o usuário deve ser um administrador.
 
 * **REQ5** - O sistema deve permitir o gerenciamento (CRUD) de funcionários da empresa e essa ação somente poderá ser executada por usuários administradores. Usuários administradores também podem executar todas as funcionalidades que um funcionário comum pode executar.
 
 * **REQ6** - O sistema deve alertar quando um produto estiver próximo do vencimento.
  
 * **REQ7** - O sistema deve alertar quando um produto atingir estoque mínimo.
  
 * **REQ8** - O sistema deve permitir gerar relatório de vendas: por produto e por data.


