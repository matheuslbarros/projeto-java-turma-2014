# projeto-java-turma-2014
Integrantes:
mvdfreitas

rodrigodellinghausen - Rodrigo Dellinghausen dellinghausen@gmail.com

-> viniciuskonig - Vinícius König Ferreira - vinicius.konfer@gmail.com

cnicolaidis

msoaresinfor


### 28/04/2015 - rodrigo 
**Implementei os serviços**:
- **listCountries**: 
  classes CountryDAO, CountryService e alterei o método ClassificadosWS.listCountries(). Acho que não precisa criar o serviço de cadastro de país, então criei uns inserts e coloquei no arquivo Scripts.sql.
- **createRegion**: 
  Alterei a classe Region para gerar o ID corretamente

#

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="REGION_ID")
    private Long id;

isto diz para o jpa que o banco é quem vai gerar o id. Sempre que uma classe/dominio tem operações de insert no banco, a classe dever ter o @Id e o @GeneratedValue(strategy=GenerationType.IDENTITY).

- **listRegionsByCountry**: parecido com o listCountries, porém tem um parâmetro na consulta (id do país).

