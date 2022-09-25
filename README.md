# Projeto RU v.1.2
RU

## Integrantes do grupo 
 * Daniel Oliveira Carneiro Leão - danielsestudos@gmail.com
 * Luiz Henrique de Menezes Carvalho - lhmc0321@gmail.com
 * Luiz Matheus dos Santos Silva - luiz.matheus.77985@gmail.com
 * Nycolle Nailde de Oliveira Bezerra - nycknailde@gmail.com
 * Tom Jones Silva Gomes Ramos - didinho200291@gmail.com


## Descrição geral do projeto 
O programa deve ser capaz de permitir o gerenciamento de funcionários, clientes, produtos e vendas do RU, permitindo que sejam registrados e excluídos funcionários por administradores (checados por login e senha), enquanto produtos, clientes e vendas podem ser gerenciados por qualquer funcionário.


## Requisitos do projeto
 * **REQ1** - O sistema deve controlar o acesso através de login e senha. Os usuários do sistema serão do tipo funcionário e estudante.

 * **REQ2** - O sistema deve permitir a venda das fichas para o almoço e jantar no RU, e cada venda estará associada a um único usuário.
 
 * **REQ3** - Ao realizar uma venda, o sistema deve salvá-la em um histórico de vendas associado ao usuário. O sistema também deve permitir acesso ao histórico de compras do usuário.

 * **REQ4** - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de funcionário, e Create, Recover e Delete de estudantes. Essas ações podem ser realizadas por funcionários.

 * **REQ5** - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de fichas de almoço/jantar, e essas ações podem ser realizadas por um administrador.
 
 * **REQ6** - Ao consumir um ticket de refeição, o sistema apresenta um código para o usuário. 
 
 * **REQ7** - O sistema deve mostrar qual o prato da semana e quantas fichas o discente ainda tem disponível para o almoço e jantar.
  
 * **REQ8** - O sistema deve permitir gerar relatório de vendas e consumo: por refeição e por data. Sendo assim, haverá a possibilidade de quantas refeições foram vendidas/consumidas em uma certa data.

## Modelo Navegacional
![Modelo navegacional](https://user-images.githubusercontent.com/82189594/190940843-a5520a85-a377-428e-b04b-b17a0d144116.jpg)

## Diagrama de Classes UML
![Diagrama Projeto RU](https://user-images.githubusercontent.com/82189594/190940841-f8a1e5d8-a4d1-4b1b-9478-c981e4f3dc87.jpg)
