Execute a classe:

Launcher.java

  Login do Sistema

Usuário padrão para testes:

Usuário: admin

Senha: 123

  Como Usar o Sistema

1. Cadastrar Produto

Informe o nome do produto


Informe a quantidade inicial

Clique em Cadastrar

2. Adicionar Unidades

Selecione um produto na tabela

Digite a quantidade

Clique em Adicionar Unidades

  3. Retirar Unidades

Selecione um produto

Digite a quantidade

Clique em Retirar Unidades

  4. Excluir Produto

Selecione um produto

Clique em Excluir

  5. Visualizar Gráfico

Clique no botão Gráfico para ver a representação visual do estoque.

  Salvamento em JSON

Os dados do estoque são automaticamente salvos no arquivo:

estoque.json

Toda alteração reflete diretamente no arquivo.




  Testes Unitários
Para rodar os testes:
mvn test
Testes existentes:
ProdutoTest
LoginServiceTest

  Tecnologias Utilizadas
Java 17
JavaFX
Maven
Gson (JSON)
JUnit 5
Git & GitHub

  Observações
Projeto desenvolvido para fins acadêmicos
Estrutura organizada em MVC + DAO
