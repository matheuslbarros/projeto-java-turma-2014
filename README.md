# Trabalho projeto-java-turma-2014
## Setup do ambiente

### Instalação do Git
Baixar o cliente do Git em http://git-scm.com/

### Operação do Git
Um guia rápido de como usar o Git pode ser visto em http://rogerdudler.github.io/git-guide/

### Buscar projeto do Git
criar um diretório chamado git e de dentro dele rodar o seguinte comando:
git clone https://github.com/uniritter/projeto-java-turma-2014.git

### Instalação da JDK
Instalar o JDK 8. Baixar do site da Oracle (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
Alguns componentes mais recentes requerem a última versão da JDK.

### Instalar o Eclipse Luna
Alguns problemas ocorrem devido ao fato de usarmos versões mais antigas do eclipse. Recomenda-se sar o Luna.
Baixar de (http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/lunasr2) e descompactar.

### Instalar Glassfish tools
Para que o Glassfish seja devidamente integrado ao Eclipse, é necessário instalar a última versão do Glassfish Tools (plugin do Eclipse).
No Eclipse, selecionar Help -> Eclipse Marketplace
Progurar por "Glassfish Tools for Luna" e instalar. Reiniciar o Eclipse.

### Instalação e config do Glassfish no Eclipse
Baixar o glassfish (http://download.java.net/glassfish/4.1/release/glassfish-4.1.zip).
Descompactar em diretório de sua preferência, a ser chamado de GLASSFISH_HOME.
No Eclipse, selecionar Window -> Show View -> Other... -> Servers
Adicionar um servidor (pode ser Glassfish 4) e quando solicitado indiar o diretório de instalação do Glassfish.

### Banco de dados
Rodar o banco de dados Derby com o comando GLASSFISH_HOME\bin\asadmin start-database.

### Instalação e config do Squirrel
Baixar o SquirrelSQL (http://sourceforge.net/projects/squirrel-sql/files/1-stable/3.6.0-plainzip/squirrelsql-3.6-standard.zip/download).
Descompactar e rodar o arquivo squirrel-sql.bat (ou .sh).
Configurar o driver do Derby. Clicar em Drivers, selecionar a opção "Apache Derby Client" com duplo clique.
Na aba "Extra Class Path", clicar em Add e procurar pelo diretório GLASSFISH_HOME\javadb\lib e adicionar o arquivo derbyclient.jar. Confirmar.
Clicando na aba "Aliases", criar uma conexão com as configurações de acesso ao banco descritas no arquivo Banco.txt

Abrir e rodar o arquivo Script.sql para importar o schema do banco.

### Instalação e config do SoapUI
Baixar o SoapUI em (http://sourceforge.net/projects/soapui/files/soapui/5.1.3/SoapUI-5.1.3-windows-bin.zip/download) e descompactar.
Abrir o projeto do SoapUI em SoapUI-project\Classificados-soapui-project.xml.

### Rodar o projeto no eclipse
Publicar o projeto clicando com o botão direito na instância do Glassfish na aba Servers e selecionando "Add and Remove..."

No browser, deve ser possível ver o WSDL em WSDL em http://localhost:8080/Classificados/ClassificadosWSService?WSDL

## Como resolver os problemas mais comuns

### Erro ao conectar no banco de dados
Verifique se o banco está rodando. Verifique se a string de conexão está configurada corretamente. O usuário e senha são em letras maiúsculas!

### Erro 404 no webservice
Não identificado ainda como resolver. Até onde foi possível encontrar informação, é importante que apareça nos logs algo como a linha abaixo, indicando que o WS foi devidamente reconhecido pelo Glassfish:

```
2015-04-24T21:01:17.935-0300|Informações: Webservice Endpoint deployed ClassificadosWS
 listening at address at http://localhost:8080/Classificados/ClassificadosWSService.
```

### Para resolver problema de compilação
Botão direito no projeto -> Properties -> Targeted Runtimes -> Desmarcar um Glassfish e marcar o outro

  
