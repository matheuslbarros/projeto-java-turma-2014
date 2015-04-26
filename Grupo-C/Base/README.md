# README #

This README would normally document whatever steps are necessary to get your application up and running.

### Como start o Derby

* Entre na pasta do Glassfish
* Ao entrar na pasta execute o seguinte comando
* bin/asadmin start-database
* Se o SO for Windows acredito que barra seja '\'.

### Como pausar o Derby

* Entre na pasta do Glassfish
* Ao entrar na pasta execute o seguinte comando
* bin/asadmin stop-database
* Se o SO foi Windows acredito que barra seja '\'.

### Como utilizar o banco pelo Eclipse

* Dentro do Eclipse vá em Window --> Show View

* Escolha 'Data Source Explorer'.

* Com esta aba você poderá criar conexãos e utilizar através do eclipse um banco de dados configurado.

* Antes de criar uma nova conexão é necessário que o Derby tenha sido startado utilizando os passo anteriores apresentados em '### Como start o Derby'

* Crie uma nova conexão, os dados utilizados para criar esta conexão estão no arquivo 'Banco.txt' que se encontra dentro do projeto.

* Lá é disponibilizada a URL, user e password.

* Se tudo ocorrer bem, será possivel conectar ao banco.

* Clique com o botão direito em cima da nova conexão criada e escolha 'Open SQL Scrapbook'.

* Nesta tela você poderá rodar comando sql.

* Não esqueça que as tabelas não estão criadas, para criar as mesmas é necessário abrir o arquivo 'Script.sql', neste arquivo encontram-se os comando para gerar as tabela. 

* Se for realizar testes não esqueça de incluir dados nas tabelas.

### What is this repository for? ###

* Quick summary
* Version
* [Learn Markdown](https://bitbucket.org/tutorials/markdowndemo)

### How do I get set up? ###

* Summary of set up
* Configuration
* Dependencies
* Database configuration
* How to run tests
* Deployment instructions

### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines

### Who do I talk to? ###

* Repo owner or admin
* Other community or team contact



