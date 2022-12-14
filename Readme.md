## Arrays e Collections

Estruturas que agrupam dados dentro de uma única estrutura. A partir de uma única variável ou constante você pode ter um conjunto de informações.

## Array
- Estático (tamanho fixo)
- Homogêneo(mesmo tipo)
- Indexado acesssamos em []
- O array é um objeto(possui atributos e comportamentos)


## Equals e HashCode

Equals é um método que está disponível em todos os Objetos java.

O Equals é a função que vai definir a igualdade entre dois objetos, e por padrão ele vai ter o mesmo comportamento de comparar
com == , pois eles observam o endereço de memória.

O equals vem sempre junto  com o método HashCode.

Equals retorna : true ou false(boolean);
hashCode: retorna um int;

Em java primeiro ele passa rapidamente o hashCode e já faz uma eliminação
e depois o equals que é mais lento.

== : compara memória
equals : por padrão compara memória
Apenas depois que você define e implementa o equals é que você define um critério, sempre você implementar equals tem que implementar
o hashCode , prinicipalmente no uso de conjuntos.

## Collections

Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade, estes 
elementos precisão ser Objetos, pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções heterogêneas 
de um tipo especifico.

Collections diferente do array elas tem tamanho variável, elas podem crescer com o tempo.
Podemos ter collections com tipos diferentes, mas as boas práticas pedem que sejam homogêneos.
As collections não permitem tipos primitivos, nós utilizamos a classe Wrapper, Integer, Double, Float, Character... ou criamos um array

Temos quatro grandes tipos de coleções: Set (conjunto), List (lista), Queue (fila) e Map (mapa), a partir dessas 
interfaces, temos muitas subclasses concretas que implementam varias formas diferentes de se trabalhar com cada coleção.

Todas as interfaces e classes são encontradas dentro do pacote (package) java.util, embora a interface Map não ser filha 
direta da interface Collection ela também é considerada uma coleção devido a sua função.

Alguns dos métodos que devem ser implementados por todas as subclasses de Collection:

add(Object e) – Adiciona um Objeto dentro da coleção.
addAll(Collection c) – Adiciona uma coleção de Objetos dentro da coleção.
contains(Object o) – Verifica se um Objeto está dentro da coleção.
clear() - Remove todos os Objetos da coleção.
isEmpty() - Retorna um boolean informando se a coleção está vazia ou não.
remove(Object o) – Remove um Objeto da coleção.
size() - Retorna o tamanho da coleção.
toArray() - Converte uma coleção em um vetor.



Seguem as Collections:

- Set(conjunto):  - não ordenado (por padrão)
                  - não indexado (não é possivel acessar a partir de um set um conjunto pelo o indice, por que ele não é ordenado por padrão);
                  - Não aceita repetição;
                  - Pode ser heterogeneo (não é indicado)
                  - Pode ser homogêneo
                  - Pode ser ordenado( mas temos o sorted set que é o conjunto ordenado)
                  - HashSet é uma é um dos tipos possiveis de ter conjuntos em java

- List: - Indexada;
        - Aceita repetição;
        - Pode ser heterogeneo (não é indicado)
        - Pode ser homogêneo
        - Aceita Objetos duplicados
        - é ordenado
        - é possivel acessar pelo o indice              

- Map: - chave/valor(é como se fossem duas colunas)
       - chave não aceita repetição;
       - valor aceita repetição;

- Queue:  - implementa fila;
          - first in/first out(fifo)

- Stack: - implementa pilha(stack)
         - last in/ first out(lifo)

## POO

Reuso via composição : podemos criar várias , podemos por exemplo tem um objeto chamado Carro que um relacioamento com o motor;
Quando pensamos em coleções(collections) podemos usar set, array, list, map
Quanto mais relacionamento você tem em um sistema mais efeitos colaterais nós teremos.
Tem que ter um relacionamento entre as classes o que não pode ter é acoplamento.

Podemos ter relacioanmento: unidirecional 1:1
                            bidirecional 1:n
                            multidirecional n:n

## Pilares POO

- Encapsulamento (Se trata de um dos elementos que adicionam segurança à aplicação em uma programação orientada a objetos 
pelo fato de esconder as propriedades, criando uma espécie de caixa preta.). O Objeto é a capsula e esse objeto é um 
agrupador, que agrupa atributos e métodos.

Modificadores de acesso:

public (todos podem acessar)

protected: vai depender da herança, ou seja ele pode acessar um atributo em outro pacote desde que ele seja herdado, ele é visivel 
no proprio pacote, ele é visivel na própria classe, e ele é tranferido por herança para outra classe

package(default)(apenas podem acessar quando estão dentro do mesmo pacote), por padrão o nível de visibilidade é pacote, ele é visível
na própria classe e no pacote;

private (o mais restrito)

- Herança (O reuso de código é uma das grandes vantagens da programação orientada a objetos.)
- Polimorfismo( Em outras palavras, o polimorfismo consiste na alteração do funcionamento interno de um método herdado de um objeto pai. Ex- Animal: mamifero: reptil...)
- abstração (quando vc desenvolver um sistema um objeto não precisa necessariamente ter todas as suas caracteríticas modeladas no sistema, e sim apenas o que realmente faz sentido para o sistema)


## Reuso de código

Composição e herança.

No mundo real nós temos mais composição que herança.

Herança você vai herdar comportamentos da classe pai.
Ex: =e um animal-> é um mamifero-> é um anfibio-> é um mamifero aquatico-> é um mamifero terrestre -> é um sapo-> é um carro...
Todos os atributos que estão na classe pai , o filho recebe no caso de herança. Quanto mais especifico você vai ficando
mais atributos você terá.

Nem toda Hierarquia gera herança.

## Polimorfismo

Existem dois tipos:

- Estático (sobrecarga), podemos criar métodos com o mesmo nome, mas os parametrso diferentes isso é sobrecarga;
Ele é estatico por que eu posso usar as multiplas formas  diferentes de usar o mesmo método, ou seja não ocorre de
forma dinâmica, ou seja polimorfismo estatico é == a sobrecarga

- Para se ter um polimorfismo Dinâmico, é necessário ter Herança, e da herança é que temos o polimorfismo dinâmico;
Ex: Civic c = new Civic();
Carro c=new Ferrari()
consigo criar uma classe generica e atribuir outras variaveis
c= new Fusca();

Ocorre sempre do tipo mais especifico para o generico


## Abstração

Pegar um conceito do mundo real e simplificar para dentro do seu software.
Nem tudo que está no mundo real será mapeado no software e nem tudo que
está mapeado no mundo real está no software. 


Aluno -> aluno Bolsista


## Enum

An enum é uma "classe" especial que representa um grupo de constantes (variáveis ​​imutáveis, como finalvariáveis).
As enumerações servem ao propósito de representar um grupo de constantes nomeadas em uma linguagem de programação. 
Por exemplo, os 4 naipes em um baralho de cartas podem ser 4 enumeradores chamados Paus, Ouros, Copas e Espadas, 
pertencentes a um tipo enumerado chamado Naipe. Outros exemplos incluem tipos naturais enumerados (como os planetas, 
dias da semana, cores, direções, etc.). 

Declaração de enum em Java: A declaração de enum pode ser feita fora de uma classe ou dentro de uma classe, mas não dentro de um método.

Pontos importantes do enum:

Cada enum é implementado internamente usando Class.
/* internamente acima do enum A cor é convertida para
classe Cor
{
public static final Color RED = new Color();
public static final Color AZUL = new Color();
public static final Color GREEN = new Color();
}*/
Cada constante enum representa um objeto do tipo enum.
tipo enum pode ser passado como um argumento para instruções switch .

/ A Java program to demonstrate working on enum
// in switch case (Filename Test. Java)

import java.util.Scanner;

// An Enum class
enum Day {
SUNDAY,
MONDAY,
TUESDAY,
WEDNESDAY,
THURSDAY,
FRIDAY,
SATURDAY;
}

// Driver class that contains an object of "day" and
// main().
public class Test {
Day day;

    // Constructor
    public Test(Day day) { this.day = day; }
 
    // Prints a line about Day using switch
    public void dayIsLike()
    {
        switch (day) {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }
 
    // Driver method
    public static void main(String[] args)
    {
        String str = "MONDAY";
        Test t1 = new Test(Day.valueOf(str));
        t1.dayIsLike();
    }
}

Cada constante enum é sempre implicitamente public static final . Como é estático , podemos acessá-lo usando o enum Name. Como é final , não podemos criar enums filhos.
Podemos declarar o método main() dentro do enum. Portanto, podemos invocar enum diretamente do prompt de comando.

Enum e Herança:

Todos os enums estendem implicitamente a classe java.lang.Enum . Como uma classe só pode estender um pai em Java, um enum não pode estender mais nada.
O método toString() é substituído em java.lang.Enum class , que retorna o nome da constante enum.
enum pode implementar muitas interfaces.

métodos values(), ordinal() e valueOf():

Esses métodos estão presentes em java.lang.Enum .
O método values() pode ser usado para retornar todos os valores presentes dentro do enum.
A ordem é importante em enums. Usando o método ordinal() , cada índice de constante enum pode ser encontrado, assim como um índice de array.
valueOf() retorna a constante enum do valor de string especificado, se existir.

enum e construtor:

enum pode conter um construtor e é executado separadamente para cada constante enum no momento do carregamento da classe enum.
Não podemos criar objetos enum explicitamente e, portanto, não podemos invocar o construtor enum diretamente.


## Herança

o this palavra-chave aponta para uma referência da classe atual, enquanto a super palavra-chave aponta para uma referência 
da classe pai. this pode ser usado para acessar variáveis e métodos da classe atual, e super pode ser usado para acessar 
variáveis e métodos da classe pai da subclasse.

Chamar o construtor da classe atual você usa o this.
Chamar o construtor da classe pai você usa o super();


## Interface

Interface tem métodos que não possuem corpos.
Ela define apenas a necessidade de você implementar algo quando uma classe herda de uma interface.

Uma classe herda de apenas uma classe. Já uma classe em relação a uma interface pode herdar várias interfaces.
métodos em interface é public por padrão, mesmo que eu não coloque a palavra public. 
E todos os métodos dentro da interface são abastract mesmo que não esteja explicito, significa que não tem corpo(par de chaves).
Dentro de interface os modificadores abstract e public são implicitos

usamos implements para herdar uma interface
usamos extendes para herdar outra classe;


## Classe abstrata

- Classe concreta é onde 100% dos métodos estão implementados. Ou seja os métodos tem corpo, ou seja ele tem um par de 
chaves e colocamos a implementação. Se o método retorna String obrigatoriamente ele tem que ter um return retornando uma String

- Interface: é uma estrutura que tem os métodos , mas os métodos não tem corpo, tem apenas a definição de método, mas dentro da
interface não se sabe como implementar aquele método. E toda classe que implenta uma interface precisa determinar esses métodos;
Interface tem 0% dos métodos implementados.

- Classe abstrata: é a classe que pode tanto ter todos os métodos abstratos, quanto parte dos métodos abstratos, como ela pode ser
completamente com todos os métodos definidos. A primeira consequencia de se ter uma classe abstrata é que ela não pode ser instanciada.

public abstract class Pessoa{

//Você não pode mais instanciar
//Pessoa p = new Pessoa();

}

Para que eu quero criar uma classe abstract ? quando eu tenho herança , quando eu quero criar uma classe pai que quero que seja herdada.
Ou seja eu vou ter acesso aos atributos e métodos quando eu herdar para outras classes.  (Extends)

## Funções Lambdas

O que são funções lambda Java?
Simplificando um pouco a definição, uma função lambda é uma função sem declaração, isto é, não é necessário colocar um 
nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado.

Dentro de lambda existe um conceitto de interface funcional. Existe uma interface chamada @FunctionalInterface ela força você ter
um único método  abstract dentro de cada interface. E podemos criar métodos defaults Através das interfaces funcionais 
podemos definir as lambdas.

Package java.util.function


Processo automatico autoboxing

--------------> boxing (primitivo para Classe)
double -> Double
<--------------unboxing(Classe para primitivo)


## Banco de Dados Relacional

SGBD: Sistema de gerenciamento de Banco de Dados. MySQL , Oracle

Linguagem SQL;

## Modelo Entidade/ Relacionamento E/R

Modelo entidade/relacionamento é o paradigma que se baseia o BD.
Ou seja para construir o BD/Modelar os dados você se baseia no modelo Entidade/Relacionamento.

Entidade = tabela  [Classe]
linha = tupla (registro)  
coluna = atributos

Um BD relacional é um banco que tem SCHEMA, o Schema do BD é a definição de como os dados serão armazenados, as restrições, as regras;


## Chave Primária (PK)

- única;
- Não aceita valor vazio;
- Não muda;
- é uma coluna
- ela serve para gerar relacionamento

A coluna de PK pode ser gerada através de surrogate Key(chave sintetica ou artificial), ou seja foi gerado uma tabela com valores
que não tem nenhum significado propriamente dito para o usuario, é simplismente um valor gerado para que ele possa ser único
dentro de uma tabela.

Outra forma de gerar a PK é através do Natural Key, EXEMPLO CPG, RG . Não é muito indicado.

Caso queiramos que uma coluna não aceite valores duplicados, podemos criar restrições(constrains) e indicá-la como "unica"
não aceita repetição nessa coluna. 

## Relacionamentos

FK(FOREIGN KEY)

A forma com que um BD relaciona os dados é apartir de uma chave primária indo para outra tabela, e há uma restrição/ligação de os dados
de uma tabela pertencem a outra tabela.

Podemos ter uma FK com uma chave unique(única), [NÃO PODE TER REPETIÇÃO] e através disso eu posso ter uma relação de 1 para 1 || 1 para muitos

Muitos para muitos é gerado uma tabela intermediaria com duas FK e através das duas FKS é gerada a PK

## SQL (Structure query language-Linguagem de consultas Estruturadas ) Visão geral

DML(DATA MANIPULATION LANGUAGE): SELECT, UPDATE, INSERT , DELETE(CRUD) -> AQUI TRABALHAMOS COM OS DADOS
DDL (DATA DEFINITION LANGUAGE): CRETE, ALTER, DROP -> AQUI TRABALHAMOS COM OS SCHEMAS, CRIAÇÃO DE TABELAS, ALTERAÇÕES DE TABELAS, ACRESCENTAR TABELAS, DROPAR TABELAS...
DCL(DATA CONTROL LANGUAGE): GRANT, DENY, REVOKE ->PERMISSÕES DENTRO DO BD O QUE O USUARIO PODE FAZER OU NÃO
TCL(TRANSACTION CONTROL LANGUAGE):BEGIN, TRANSACTION, COMMIT, ROLLBACK, LINGUAGEM RELACIONADA COM O CONTROLE DE TRANSAÇÕES

## Criando schemas

create schema wm;
create database wm;

Use wm;

Comentários em SQL: (-- ...)

-- Criando a tabela estado!

_________________________________________
UNSIGNED: sem sinal(portanto armazena somente numeros positivos)
NOT NULL: não aceita nulo, é um campo obrigatório
AUTO_INCREMENT: auto incrementado ( no caso mysql se você não passar o valor dese ID ele vai gerar um valor inteiro e 
vai incrementando para cada nova inserção, que é uma chave surrogate key, que é uma chave sintética e algo que foi gerado
de forma artificial dentro da tabela para que você pudesse ter uma chave primária unica), esse uso vai depender do BD alguns
bancos trabalham com o conceito de SEQUENCE(A Sequence é um objeto do Database que possibilita a geração de valores, 
normalmente com características de valores únicos.).
PRIMARY KEY - chave primaria  (RESTRIÇÕES)
UNIQUE KEY: chave unica; (RESTRIÇÕES)
O usual é usar DECIMAL( tamanho, casas ),
Tipo DECIMAL(7,2) A forma mais rápida e fácil.
O 2 indica casas decimais.
O 7 indica quantidade numérica máxima antes da virgula.


Criamos a tabela usando DDL

create table estados(
id INT unsigned NOT NULL AUTO_INCREMENT,
nome VARCHAR(45) NOT NULL,
sigla VARCHAR(2) NOT NULL,
regiao ENUM('Norte','Nordeste','Centro-Oeste','Sul', 'Sudeste') NOT NULL,
populacao DECIMAL(5,2) NOT NULL,
PRIMARY KEY (id),
UNIQUE KEY (nome),
UNIQUE KEY (sigla)
);


## Inserir registros

INSERT INTO estados (nome,sigla,regiao,populacao)
VALUES('Acre','AC','Norte',0.83)


INSERT INTO estados
(nome, sigla, regiao, populacao)
VALUES
('Bahia', 'BA', 'Nordeste', 15.34),
('Ceará', 'CE', 'Nordeste', 9.02),
('Distrito Federal', 'DF', 'Centro-Oeste', 3.04),
('Espírito Santo', 'ES', 'Sudeste', 4.02),
('Goiás', 'GO', 'Centro-Oeste', 6.78),
('Maranhao', 'MA', 'Nordeste', 7.00),
('Mato Grosso', 'MT', 'Centro-Oeste', 3.34),
('Mato Grosso do Sul', 'MS', 'Centro-Oeste', 2.71),
('Minas Gerais', 'MG', 'Sudeste', 21.12),
('Pará', 'PA', 'Norte', 8.36),
('Paraíba', 'PB', 'Nordeste', 4.03),
('Parana', 'PR', 'Sul', 11.22),
('Pernambuco', 'PE', 'Nordeste', 9.47),
('Piauí', 'PI', 'Nordeste', 3.22),
('Rio de Janeiro', 'RJ', 'Sudeste', 16.72),
('Rio Grande do Norte', 'RN', 'Nordeste', 3.51),
('Rio Grande do Sul', 'RS', 'Sul', 11.32),
('Rondônia', 'RO', 'Norte', 1.81),
('Roraima', 'RR', 'Norte', 0.52),
('Santa Catarina', 'SC', 'Sul', 7.01),
('São Paulo', 'SP', 'Sudeste', 45.10),
('Sergipe', 'SE', 'Nordeste', 2.29),
('Tocantins', 'TO', 'Norte', 1.55);


## Consultar dados

- consulta toda a tabela ( não foi filtrado por nada)
SELECT * FROM estados;

- filtrar por colunas
  SELECT nome, sigla from estados;
  SELECT nome, sigla from estados;
  SELECT nome from estados;
  SELECT regiao from estados;
  SELECT populacao from estados;
  SELECT regiao,nome from estados;
  SELECT sigla, regiao from estados;

Podemos incluir um label

    SELECT  nome as 'nome do Estado', sigla , populacao as 'populacao' from estados;
    SELECT id as 'Identificador', nome as 'Estado', populacao as 'População', sigla as 'Siglas dos estados' from estados;
    SELECT nome as 'Estado' , sigla as 'Sigla Estado' from estados;

Além de consultar eu posso filtrar os dados:

    -- Tras os estados que pertencem a região Sul
    SELECT nome as 'Estado' , sigla as 'Sigla Estado' , regiao from estados
    WHERE regiao ='sul';

    -- Tras os estados que pertencem a região Norte
    SELECT nome as 'Estado' , sigla as 'Sigla Estado' , regiao from estados
    WHERE regiao ='norte';

    -- populacao maior ou igual a 10
    SELECT nome, regiao from estados
    WHERE populacao >=10;

    SELECT nome, regiao, populacao from estados
    WHERE populacao >=10;

    --Ordenar para quem tem a populacao menor dentro do range >=10

    SELECT nome, regiao, populacao from estados
    WHERE populacao >=10
    ORDER BY populacao;

    --se incluir a palavra desc ele ordena de forme decrescente
    SELECT nome, regiao, populacao from estados
    WHERE populacao >=10
    ORDER BY populacao desc;
    
## Atualizar dados

O INSERT NÃO TEM O COMANDO WHERE você vai simplesmente inserir um novo dado.
O SELECT pode ou não ter WHERE se você quiser filtrar.
UPDATE é rara as exceções que você não utiliza WHERE, significa se você fizer um UPDATE sem WHERE você vai atualizar a tabela inteira.
Por exemplo se você vai atualizar um acento na palavra Maranhão , se vc não utilizar WHERE você vai atualizar todos as linhas da tabela para Maranhão.
Para excluir dados também é necessário usar WHERE.

    update ESTADOS
	SET nome='Maranhão'
	WHERE sigla='MA';
    
conferindo a atualização:

    select nome, sigla from estados
    WHERE sigla ='MA';

Atualizando duas colunas

    UPDATE estados
    SET nome='Paraná' , populacao=11.32
    WHERE sigla ='PR';

conferindo a atualização:
	SELECT nome, sigla, populacao from estados
    WHERE sigla='PR';


UPDATE pessoas set nome = "ANA Pinheiro" WHERE codigo = 2;

UPDATE pessoas set nome = ? WHERE codigo = ?;

##  inserindo dados com ID

    INSERT INTO estados( id, nome, sigla, regiao, populacao)
	VALUES (1000, 'Novo','nv','Sul',2.65);
    
        INSERT INTO estados( nome, sigla, regiao, populacao)
	VALUES ('Mais Novo','MN','Sul',2.65);
    
          select *from estados;

## eXCLUIR DADOS

No delete é essencial o Where está presente para impedir que a tabela seja totalmente excluída.

DELETE from estados 
WHERE id=1001;

ou
DELETE from estados
WHERE sigla='nv';

ou intervalo

DELETE from estados
WHERE id>=1001;

## Consultas com like

select * from pessoas where nome like '%j%';


## consulta agregada

Agrupar os dados por região, somando toda a população para ter uma consulta agregada.

    --selecionar por região  

    SELECT 
        regiao as 'Regiao',
        SUM(populacao) as Total 
    FROM estados
    GROUP BY regiao
    ORDER BY Total desc;

    --selecionar total 
    SELECT
        SUM(populacao) as Total 
    FROM estados;

    --selecionar A MEDIA(AVG) DA POPULAÇÃO POR ESTADOS
        SELECT
    AVG(populacao) as Total 
    FROM estados;

## CRIAR TABELA COM CHAVE ESTRANGEIRA

- CREATE TABLE IF NOT EXISTS: CRIE A TABELA SE ELA NÃO EXISTIR,
-  estado_id: QUANDO O NOME DE UMA COLUNA É FORMADO POR MAIS DE UMA PALAVRA USAMOS UNDERLINA
-  FOREIGN KEY(estado_id) REFERENCES estados(id): a foreign key é a coluna estado_id que referencia a tabela estados e especificamente a coluna id 

CREATE TABLE IF NOT EXISTIS cidades(
    id INT UNSIGNED 
)

## DELETAR A TABELA

DROP TABLE IF EXISTS teste;

SE EU TENTASSE DROPAR UMA TABELA QUE NÃO EXISTE USANDO O COMANDO ABAIXO DARIA UM ERRO POR QUE A TABELA NÃO EXISTE:

DROP TABLE  teste;


## Integrar INSERT COM SELECT

-- Inserindo dados
INSERT INTO cidades (nome, estado_id, area)
VALUES('Campinas',21 ,795.25);

INSERT INTO cidades(nome, estado_id, area)
VALUES('Niteroi',15,133.90);

-- insere um novo registro e associou com o estado de pernambuco
INSERT INTO cidades( nome, estado_id, area)
VALUES ('Caruaru',
(select id from estados WHERE SIGLA='PE'),
920.5);


INSERT INTO cidades( nome, estado_id, area)
VALUES ('Juazeiro do Norte',
(select id from estados WHERE SIGLA='CE'),
248.2);

INSERT INTO cidades (nome, estado_id, area)
VALUES('Brasilia',
(select id from estados WHERE SIGLA= 'DF'),
923.1);

INSERT INTO cidades (nome, estado_id, area)
VALUES ('Recife',
(select id from estados WHERE sigla='PE'),
218.8);

## consultar mÚLTIPLAS TABELAS [JOIN]

Quando formos fazer consultas em mais de uma tabela É importante ter um apelido(um alias) para cada tabela.
Para que você possa referenciar. Não é obrigado e pode usar o nome da tabela completo, mas via de regra agente coloca um apelido.  
Após selecionar e dar um apelido as tabelas é necessário fazer um filtro com WHERE


    SELECT * FROM estados e , cidades c
    WHERE e.id=c.estado_id;

No caso de tabelas que possuem colunas com o mesmo nome é necessario associar o atributo ao apelido/nome da tabela.

    SELECT e.nome,c.nome , e.regiao FROM estados e , cidades c
    WHERE e.id=c.estado_id;

ou a mesma coisa só muda o nome das colunas

    SELECT 
    e.nome as Estado,
    c.nome as Cidade , 
    r.regiao as Regiao 
    FROM estados e , cidades c
    WHERE e.id=c.estado_id;

fizemos a junção usando a claúsula from
e fizemos um filtro no  Where para evitar que se faça um plano cartesiano associando informações que não são referente aos dados
    
Outra forma de se fazer:

            SELECT
                c.nome as Cidade,
                e.nome as Estado,
                regiao as Região
            FROM estados e
            INNER JOIN cidades c ON e.id=c.estado_id;

Posso usar a clausula FROM com uma única tabela e usar o INNER JOIN dizendo a outra tabela que quero juntar
e na clausula ON eu digo quais são as colunas que vão ser iguais

## Tipos de Joins

              intersecção entre os dois conjuntos é o local onde chamamos de 
            | "inner", o inner significa que ele só vai trazer os dados que tenham
            | uma relação de chave primária com chave estrangeira em outra tabela
            | sabemos que a relação entre banco de dados é a chave primária de uma tabela
            | saindo de uma tabela e indo para ourta tabela como chave estrangeira
            |        
     ______ V ______
   /       \ /      \
  / A    /    \     B \
 /      |      |       \ 
|       \inner |        | 
 \outer  \    / outer  /
  \       \  /        /
   \______/  \_______/
 conjuntoA    Conjunto B
   cidades      empresas
   
Inner é os dados que estão relacionados com o conjunto A e B
Outer é o que está fora da intersecção entre as duas tabelas.


         
                    
     ______    ______      LEFT JOIN : Teremos o que é comum ou seja o inner mais o lado esquerdo da relação
    /       \ /      \      ou seja eu trago a intersecção de A com B mas não trago B
   / A    /    \    B \      *AQUI
  /      |      |       \     Seria a mesma coisa que fazer LEFT OUTER JOIN
 |       \inner |        |    OUTER quer dizer fora do Inner
  \ OUTER \    /        /      A relação começa de A para B
   \       \  /        /
    \______/  \_______/   



     ______    ______      RIGHT JOIN : Teremos o que é comum ou seja o inner mais o lado DIREITO da relação
    /       \ /      \      ou seja eu trago a intersecção de A com B mas não trago A
   / A    /    \    B \      *AQUI
  /      |      |      \     Seria a mesma coisa que fazer RIGHT OUTER JOIN
 |       \inner |       |    OUTER quer dizer fora do Inner
 \       \    / OUTER  /      A relação começa de B para A
  \       \  /        /
   \______/  \_______/


NÃO TEMOS FULL JOIN NÃO É SUPORTADO POR MYSQL APENAS POR OUTROS BANCOS

     ______    ______      FULL JOIN (união) : Teremos o inner, o left e o right
    /       \ /      \      ou seja trás o inner,trás também tudo que tem em A mas não tem em B e tudo que tem em B mas não tem em A
   / A    /    \    B \       
  /      |      |      \      PODEMOS FAZER ISSO USANDO O UNIO
 |       \inner |       |     
 \       \    / OUTER  /       
  \       \  /        /
   \______/  \_______/ 
   
## Criando tabela 1:1

    CREATE TABLE IF NOT EXISTS prefeitos(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cidade_id INT UNSIGNED, 
    PRIMARY KEY (id),
    UNIQUE KEY (cidade_id),
    FOREIGN KEY (cidade_id) REFERENCES cidades (id)
    )

UNIQUE KEY (cidade_id): eu só posso ter uma única cidade, não pode haver repetição na coluna cadade_id, isso é o que caracteriza uma relação 1:1
FOREIGN KEY (cidade_id) REFERENCES cidades (id): referencia o id na tabela cidades
cidade_id INT UNSIGNED, : não é not Null, é uma relação 1:1 não obrigatória;


Quando for modelar uma tabela que seja 1:1 é necessário se perguntar se o dado não seria melhor alocada dentro da mesma tabela?
Precisar vem dos requisitos do sistema.

O desempenho da tabela é menor quando fazemos junções.

## Inserir dados na Tabela prefeito


INSERT INTO prefeitos
(nome, cidade_id)
VALUES
('Rodrigo Pinheiro',5),
('Dário Saadi',3),
('Axel Schmidt Grael',4),
('Glêdson Lima Bezerra',6),
( 'João Henrique Campos',8),
('Fernando da Silva Sauro',null);
        

## Explorando os tipos de Joins

SELECT * FROM cidades c  INNER JOIN prefeitos p ON c.id=p.cidade_id; 

SELECT * FROM cidades c  LEFT JOIN prefeitos p ON c.id=p.cidade_id;
OU
SELECT * FROM cidades c  LEFT OUTER JOIN prefeitos p ON c.id=p.cidade_id;

SELECT * FROM cidades c  RIGHT JOIN prefeitos p ON c.id=p.cidade_id;  
OU
SELECT * FROM cidades c  RIGHT OUTER JOIN prefeitos p ON c.id=p.cidade_id; 

-- UNIÃO DE TODAS AS CONSULTAS (SEMELHANTE AO FULL JOIN)
SELECT * FROM cidades c  LEFT JOIN prefeitos p ON c.id=p.cidade_id   
UNION
SELECT * FROM cidades c  RIGHT JOIN prefeitos p ON c.id=p.cidade_id;  

-- UNION ALL TRAS AS DUPLICAÇÕES(NÃO É MUITO LEGAL)
SELECT * FROM cidades c  LEFT JOIN prefeitos p ON c.id=p.cidade_id   
UNION ALL
SELECT * FROM cidades c  RIGHT JOIN prefeitos p ON c.id=p.cidade_id;  

## RELAÇÃO MUITOS PARA MUITOS N:N

O BD não tem uma relação direta n:n aí será necessário criar uma tabela intermediária, para essa tabela intermediária
ter as chaves primárias vindo para elas como chave estrangeiras para poder relacionar essas duas tabelas de forma indireta.

CREATE TABLE IF NOT EXISTS empresas (
id INT UNSIGNED NOT NULL  AUTO_INCREMENT,
nome VARCHAR(255) NOT NULL,
cnpj INT UNSIGNED,
PRIMARY KEY (id),
UNIQUE KEY (cnpj)
);

-> ALTERAR TIPO DE DADO DA TABELA

ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

-> DESCREVE O CONTEUDO DA TABELA

DESC empresa;


criar a tabela intermediária onde ela terá as duas chaves estrangeiras 

CREATE TABLE IF NOT EXISTS empresas_unidades(
empresa_id INT UNSIGNED NOT NULL,
cidade_id INT UNSIGNED NOT NULL,
sede tinyint(1) NOT NULL,
PRIMARY KEY (empresa_id, cidade_id)
);

## Popular tabela Empresas e empresas_unidades


INSERT INTO empresas(nome, cnpj)
VALUES
('Bradesco',68574233232306),
('Itau',    52536984545455),
('BB',      85000296374198);



INSERT INTO empresas_unidades
(empresa_id, cidade_id , sede)
VALUES
(1,1,1),
(1,2,0),
(2,1,0),
(2,2,1);

## Consultar 3 tabelas

SELECT e.nome, c.nome
FROM empresas e, empresas_unidades eu, cidades c
WHERE e.id= eu.empresa_id
AND c.id = eu.cidade_id;

## STREAM API

O que é a Stream API? É um recurso que ajuda a manipular coleções de uma maneira simples e eficiente seguindo os 
princípios da programação funcional. Isso é interessante pois o controle de fluxo e loop ficam por conta da API 
onde temos que nos preocupar somente com a regra do negócio.

Entre as diversas funcionalidades adicionadas à linguagem Java em sua versão 8 está a Streams API, recurso que oferece 
ao desenvolvedor a possibilidade de trabalhar com conjuntos de elementos de forma mais simples e com um número menor de 
linhas de código. Isso se tornou possível graças à incorporação do paradigma funcional, combinado com as expressões lambda, 
o que facilita a manutenção do código e aumenta a eficiência no processamento devido ao uso de paralelismo.


Dentro da API de Streams você tem os Operadores /operações.

Nós temos 3 grandes grupos de Operações:
- Operadores de Construção: * Built Ops;
Operações de built seria a forma de criar um Stream, podemos criar a partir de métodos estáticos, listas e após isso
temos acesso as operações intermediárias. Built é o início da operação
- Operações intermediárias: * Intermidias Ops;
São essas operações intermediárias que vai te ajudar a transformar os dados, passando por várias funções, ou seja a ideia de 
compor uma função atrás da outra. Uma função pequena que tenha poucas responsabilidades, de preferencia uma responsabilidade só.
e você vai encadeando até que no final você enha seu dado. As operações Intermediárias sempre retornam novas stream.
- Operações terminais: * Terminal operator;
A operação terminal pode gerar algo diferente de Stream, Ex: Double. Pode gerar um numero, lista ou nada .
Operação terminal é o final do processo

Podemos ter: Stream Ordenadas , que tem uma sequencia a ser seguida
             Stream Não ordenada 
             Stream de forma sequencia
             Paralel Stream ( várias linhas de execução processadas paralelamente)

## Map

Stream de dados (é uma sequencia de dados, list, array);

Sequencia de numeros e eu quero aplicar uma transformação usando MAP:
Nós passamos uma função para o MAP(UM LAMBDA EXPRESSION OU UMA REFERENCIA PARA O MÉTODO)
e ele vai usar essa função para transformar cada elemento de tal forma que será gerado
um outro Stream com o mesmo tamanho, ou seja o map vai pegar uma Stream de 8 elementos
e vai gerar outra stream de 8 elementos e você vai passar uma função para o map que será responsável por
mapear o elemento original do elemento que você quer gerar na nova Stream.
O map na verdade é uma função que vai ajudar a transformar uma stream de dados emm outra stream de dados
do mesmo tamanho com os dados mapeados(transformados). A regra é a função que você vai usar para transformar
pode ser uma lambda expression, pode ser uma função, método...
Posso usar quantos maps forem necessários para a minha lógica


     __  ___ __  ___  __  ___ __  ___
    | 3 | 1 | 7 | 4 | 6 | 8 | 10 | 9 | uma Stream de dados
     --  --- --  --- --  ---  --  ---
                ||
                ||  MAP( e-> e*2)  lambda expression
                \/
     __  ___ __  ___  __  ___ __  ___
    | 6 | 2 |14 | 8 |12 |16 | 20 |18 | um stream de dados mapeado
     --  --- --  --- --  ---  --  ---
                ||
                ||  MAP( e-> e-2)  lambda expression
                \/
     __  ___ __  ___  __  ___ __  ___
    | 4 | 0 |12 | 6 |10 |14 | 18 |16 | um stream de dados mapeado
     --  --- --  --- --  ---  --  ---


## Filter

No filter precisamos usar um predicado(função), e ele vai informar se é true ou false;
No filter eu posso ter uma quantidade menor de elementos ou até 0 dependendo do filtro
Tudo depende do critério do filtro.

     __  ___ __  ___  __  ___ __  ___
    | 3 | 2 | 4 | 7 | 8 | 7 | 6  | 1 | uma Stream de dados
     --  --- --  --- --  ---  --  ---
                ||
                ||  filter( n-> n % )  lambda expression
                \/
     ___ __  ___  __  
    | 2 | 4 | 8 | 6 |  uma Stream de dados
     --- --  --- --  


Outro exemplo com objetos:

            Produção

     ------ ------ ----- ----
    |  -   |  -   |  -  | -  |
    | 1200 | 2356 | 30  | 97 |  uma Stream de dados
     -----  ------ ----- -----
                ||
                ||  filter( p-> p.preco>=1000 )  lambda expression
                \/
             ______  _____    
            | 1200 | 2356 |   um Stream de dados
             -----  ------  

## Reduce

Transforma uma sequencia de dados/sequencia de objetos armazenad numa stream em algo completamente diferente , não precisa ter uma relação direta
com o tipo;


     __  ___ __  ___  __  ___ __  ___
    | 7 | 3 | 4 | 2 | 8 | 1 | 2  | 8 | uma Stream de dados
     --  --- --  --- --  ---  --  ---
                ||
                ||  reduce(acum, n) -> acum + n
                \/
     ___  ___  ___  ___  ___  ___   ___  ___
    | 7 | 10 | 14 | 16 | 24 | 25 | 27  | 35 | uma Stream de dados
     ---  ---  ---  ---  ---  ---  ---   ---

    o acumulador eu defini como "0"
    (acum, n) -> acum+n
    (0,7) -> 0+7 =7 -
                     |
      _______________|      
     | o acumulador agora é 7
     v
    (7, 3) -> 7+3 =10
    (10,4) -> 10+4=14
    (14,2) -> 14+2 =16
    (16,8) -> 16+8 =24
    (24,1) -> 24+1=25
    (25,2) -> 25+2 =27 
    (27,8) -> 27+8=35
  
O acumulador pode ser um objeto, array, tipo primitivo, lista, set, map...


No reduce nós recebemos dois parametros, o primeiro é o acumulador e o segundo é o "n", o acumulador é um valor que você 
pode dar um valor incial para ele se voc~e quiser, e esse valor pode ser passado para cada uma das iterações caso você queira
esse acumulador passa por cada um dos elementos.

Reduce diferente de map e filter é uma função terminadora semelhante forEach() .
Reduce é uma função terminadora.

## Tratamento de exceções

temos dois tipos de erros que são:

Erros de compilação: erros de compilação impedem o processo natural de você ter um arquivo .java -> com código fonte e gerar o arquivo .class
O compilador não vai executar esse processo .java -> .class quando você tem um erro de compilação. E eles são mais fáceis de serem 
encontrados, devido o java compilar o seu código para uma linguagem intermediária que é interpretada pela máquina virtual(JVM).

Linguagens como PHP, Ruby e JS são linguagens interpretadas , ou seja o interpretador ler diretamente o código que você escreveu, então
você não tem o conceito de erros de compilação, por que não tem processo de compilação. 

Já o Java possui o processo de compilação, ou seja antes de executar um arquivo ele precisa passar pelo o processo de compilação.
Não é o código fonte que é interpretado e sim o arquivo .class que usa uma linguagem intermediária (bytecode)
![](../../Users/aesilva/AppData/Local/Temp/java-bytecode.png)


Erros em tempo de Execução: São os erros que ocorrem quando o seu programa já foi compilado, quando o usuario está acessando o seu programa.
Podem ser erros que foram previstos no momento do desenvolvimento aí você usa o tratamento de exceção.é necessário fazer validações
prevendo erros ou seja lanço exceções.


A mãe de todos os problemas que podem ocorrer em java é chamada de Throwable, então a partir
de Throwable algo que pode ser lançado diferentes de outros mecanismos em java, uma exceção /um erro em java é 
lançado,a sua aplicação interrompe e lança o erro, quando esse erro é lançado acontece uma parada naquele momento
daquela funcionalidade/método(todo algoritmo em java acontece dentro de métodos, e eses métodos podem 
lançar exceções, e também lambdas Expressions podem lançar exceções, sendo que lambda expression nada mais é que um método
implementado a apartir de uma interface funcional então acaba sendo um método também).
Então quando é lançado um erro você interrompe o processo e quem chamou o método é responsável por tratar o erro, ou simplesmente
não fazer nada e esse erro vai propagando , mais em algum momento você vai precisar tratar.

![](../../Users/aesilva/AppData/Local/Temp/b26b36859c1c149262e7e3f87f1d6259.png)

Error e Exception herdam de Throwable.
Error: é algo mais crítico,  o erro normalmente é lançado em algo que não pode ser recuperado.
Ex: OutOfMemoryError: aplicação ficou sem memória

Exception: você acaba tratando, como um desvio de fluxo, mas o programa normalmente continua funcionando

![](../../Users/aesilva/AppData/Local/Temp/exception-hierarchy-in-java.png)


Exceções não checadas (unchecked):

Representam defeitos no programa (bugs).

São subclasses de RuntimeException e são normalmente implementadas usando IllegalArgumentException, NullPointerException ou IllegalStateException.

Um método não é obrigado a estabelecer uma política para as exceções não checadas lançadas por sua execução (e quase sempre nunca o fazem).

int num1 = 10;
int num2 = 0;
int res = 0;

res = num1 / num2; // ArithmeticException: / by zero;

Possível solução:

int num1 = 10;
int num2 = 0;
int res = 0;

try {
res = num1 / num2;
} catch (ArithmeticException ex) {
Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
}


Exceções checadas (checked):
Representam condições inválidas em áreas fora do controle imediato do programa (problemas de entradas inválidas do usuário, banco de dados, falhas de rede, arquivos ausentes).

São subclasses de Exception.

Um método é obrigado a estabelecer uma política para todas as exceções checadas lançadas por sua implementação (ou passar a exceção checada mais acima na pilha, ou manipulá-la de alguma forma).

Organização em classes:
É um pouco confuso, mas note bem que RuntimeException (não checada) é por si só uma subclasse de Exception (checada).

![](.Readme_images/4fa44b53.png)


## Exceção Checada e não Checada

Throwable é a classe que é a raiz de todas as exceções e erros dentro java.
E todas as classes que estiverem abaixo de Throwable pode usar a palavra throw associado a uma classe.
Throw usado para lançar a exceção.

![](../../Users/aesilva/AppData/Local/Temp/exception-hierarchy-in-java.png)
RunTimeException: Toda classe que herda de runtime exception é uma classe não checada , você não é obrigado a definir na 
assinatura do método que você vai lançar uma runtimeException quem chama aquele método não é obrigado a tratar o erro usando try catch.

Quando você lança Exception ou qualquer outra exceção que esteja sendo filho diretamente ou indiretamente você é obrigado a tratar
esse erro. Apenas as exceções que estão em runtimeException que você não tem obrigatoriedade de tratar.

Quando eu lanço uma exceção checada eu tenho que incluir na assinatura do método "throws" ou seja que ele lança uma determinada exceção.

Ex:
static void geraErro2() throws Exception{
try {
throw new Exception("Ocorreu um erro #02 - TRATEI O ERRO");
}catch (Exception e){
System.out.println("UFA passou"+e.getMessage());
}
}

Uma exceção checada não conseguirá passar por todos os métodos despercebida. Ou você já trata ou passa para o outro método tratar.
Já uma exceção não checada(runtime) ela consegue passar depercebida pelo os métodos, por que você trata se quisr e você não precisa declarar esses métodos
diretamente na assinatura do método. Tudo que você herda de runtime o compilador não irá te obrigar a tratar ou declarar.

Exceção checada você força o tratamento.

Exceção não verificada EXTENDS RUNTIME EXCEPTION

package excecao.personalizada;

public class NumeroForaDoIntervaloException extends RuntimeException {

    private String nomeDoAtributo;

    public NumeroForaDoIntervaloException(String nomeDoAtributo){
        this.nomeDoAtributo=nomeDoAtributo;

    }



    public String getMessage() {
        return String.format("O atributo '%s' está fora do Intervalo",nomeDoAtributo);
    }
}


Exceção  verificada EXTENDS  EXCEPTION

package excecao.personalizada;

public class NumeroForaDoIntervaloException extends Exception {

    private String nomeDoAtributo;

    public NumeroForaDoIntervaloException(String nomeDoAtributo){
        this.nomeDoAtributo=nomeDoAtributo;

    }



    public String getMessage() {
        return String.format("O atributo '%s' está fora do Intervalo",nomeDoAtributo);
    }
}


Você pode optar por trablhar com exceções checadas e não checadas. A maioria opta pela não checadas.


## Finally

Usamos o finally quando queremos que algo seja forçado a ser feito, mesmo que exista um erro. Exemplo fexhar a conexão de um BD 
Você fecha a conexão no finally.
Independente de qualquer erro o finally é executado. 


## Generics

O uso de Generics faz-se necessário para evitar casts excessivos e erros que podem ser encontrados em tempo de compilação, 
antes mesmo de ir para a produção.

Permitem criar elementos com tipos parametrizáveis

Fornecem uma maneira de comunicar o tipo de uma coleção ou atributo ao compilador
Verificação em tempo de compilação
Quando o compilador conhece o tipo do elemento, ele pode verificar se o mesmo está sendo usado corretamente e pode inserir casts corretamente
Evitam a escrita de código repetitivo e sujeito a erros de execução resultante do uso excessivo de conversores de tipo (casts)

Como?
Em Java pode-se fazer programação genérica usando-se herança (será visto mais adiante) ou variáveis de tipo

Uma classe genérica terá uma ou mais variáveis de tipo

O uso de variáveis de tipo torna o código mais seguro e simples de ler

Convenção
Usam-se letras maiúsculas individuais para especificar parâmetros de tipo
Nome da variável de tipo	Significado
E	Elemento de uma coleção.
K	Chave de um mapa
V	Valor em um mapa
T	Tipo genérico
S, U	Tipos adicionais
Convenção
Parâmetros de tipo são declarados entre < e > ao lado do nome da classe

Uma vez declarado, um parâmetro de tipo pode ser usado no lugar de qualquer tipo de dado (declaração de variáveis e atributos, parâmetros e valores de retorno)

Instanciação
Como instanciar?

NomeClasseGenerica<Tipo1, Tipo2, ... > n = new NomeClasseGenerica<>();
Java 7: não é necessário repetir os parâmetros de tipo do lado direito da atribuição

Usa-se “<>” (válido para quaisquer quantidade de parâmetros de tipo)
Observação: a ausência do parâmetro de tipo em uma classe genérica implica na utilização do tipo Object como default (será discutido mais adiante)

Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo. Seus beneficios são:
- reuso
- type safety
- Performance

Uso comum de generics em Coleções: Listas


## JDBC (Java Database Connectivity)

O que é JDBC?
Pode-se dizer que é uma API que reúne conjuntos de classes e interfaces escritas na linguagem Java na qual possibilita se conectar através 
de um driver específico do banco de dados desejado. Com esse driver pode-se executar instruções SQL de qualquer tipo de banco de dados relacional.

Para fazer a comunicação entre a aplicação e o SGBDs é necessário possuir um driver para a conexão desejada. Geralmente, as empresas de 
SGBDs oferecem o driver de conexão que seguem a especificação JDBC para caso de algum desenvolvedor querer utilizar.


Conectividade do Bnco de Dados com java.

JDBC define o conjunto de interfaces, ou seja quais os métodos que precisam estar presentes quando você construir por exemplo um driver
para ter conectividade com outros BD.
Várias bibliotecas usam JDBC, e eventualmente você usará o JDBC diretamente, principalmente quando você usa o uso intendivo de banco de dados.

JDBC é uma API muito importante.

Não usaremos Statment e sim o PrepareStament devido o SQLInjection . Ele dá uma forma segura de inserir dados através do ususario.
Nunca concatene strings ela pode levar há uma sqlInjection.

Statement.. ou SQL Statement..., a famosa "Query". É o comando que vai ser interpretado pelo SGBD. Podem ser 4 tipos de statement:

SELECT
INSERT
UPDATE
DELETE

O que é um Driver?
Além de atuar como uma interface entre os SGBDs e as aplicações, também pode ser considerado como um tradutor que ajuda 
na definição das mensagens binárias trocadas com um protocolo de um SGBD.

## Pacote java.sql

Esse pacote oferece a biblioteca Java o acesso e processamento de dados em uma fonte de dado. As classes e interfaces 
mais importantes são:

Classe	         |       Interface
--------------------------------------------
DriverManager	 |       Driver
                 |       Connection
                 |       Statement
                 |       ResultSet
                 |       PreparedStatement


A classe DriverManager

Cada driver que se deseja a usar precisa ser registrado nessa classe, pois oferece métodos estáticos para gerenciar um driver JDBC.

Para a aplicação reconhecer a comunicação com o banco de dados escolhido, é preciso obter um arquivo com a extensão .jar 
que geralmente se consegue através dos sites das empresas que distribuem o SGBD. Esse arquivo tem o objetivo ajudar no 
carregamento do driver JDBC. Na prática de um desenvolvimento voltado a web, é criada a pasta “lib” da pasta “WEB-INF” 
e inserido esse arquivo.

A interface Connection

Representa uma conexão ao banco de dados. Nessa interface são apresentados os métodos mais utilizados.

Método close
Geralmente é inserido dentro do bloco finally para realizar sempre a sua execução, pois esse método serve para fechar e liberar imediatamente um objeto Connection.

Método isClosed
Serve para verificar se o objeto Connection está fechado.

Método createStatement
É usado para criar um objeto Statement que executa instruções SQL ao banco de dados.

Método prepareStatement
É usado para criar um objeto que representa a instrução SQL que será executada, sendo que é invocado através do objeto Connetion.

rollback
Usado para retornar uma transação, sendo muito usado dentro de blocos catch em caso de alguma operação gerar erro.

SUPORTE AO ALUNO
ANOTAÇÕES
FAVORITAR
CONCLUÍDO
46GOSTEI
46


Suporte ao aluno

Anotar

Marcar como concluído
Artigos
Java
Aprendendo Java com JDBC
Hoje, as aplicações são desenvolvidas através de interfaces amigáveis para que os usuários consigam trabalhar e manipular informações no banco de dados de forma facilitada.

Geralmente, muitos programadores estudam o mecanismo do JDBC - Java Database Connectivity que ajudam nas aplicações com bibliotecas de baixo nível e até mesmo servem de base para as de alto nível. Portanto, abaixo serão explicados os conceitos e práticas necessárias para conseguir começar a desenvolver um sistema baseado no JDBC.

O que é JDBC?
Pode-se dizer que é uma API que reúne conjuntos de classes e interfaces escritas na linguagem Java na qual possibilita se conectar através de um driver específico do banco de dados desejado. Com esse driver pode-se executar instruções SQL de qualquer tipo de banco de dados relacional.

Para fazer a comunicação entre a aplicação e o SGBDs é necessário possuir um driver para a conexão desejada. Geralmente, as empresas de SGBDs oferecem o driver de conexão que seguem a especificação JDBC para caso de algum desenvolvedor querer utilizar.

O que é um Driver?
Além de atuar como uma interface entre os SGBDs e as aplicações, também pode ser considerado como um tradutor que ajuda na definição das mensagens binárias trocadas com um protocolo de um SGBD.

Para desenvolver uma aplicação baseada em uma especificação JDBC é preciso entender algumas das principais classes e interfaces apresentadas abaixo.

Existe um ponto de atenção na importação das classes ou interfaces relacionadas ao pacote a ser usado no momento do desenvolvimento. Na Figura 1, é mostrado de forma correta a importação do pacote referente à classe Connection pertencente ao pacote java.sql. Esse é um fator a ser observado com cautela, pois isso é considerado um dos erros mais comuns justamente pelo fato do desenvolvedor pensar muitas vezes em usar o pacote com.mysql.jdbc sendo que está utilizando o driver JDBC do banco MySQL.

Importação da classe Connection
Figura 1: Importação da classe Connection

Pacote java.sql
Esse pacote oferece a biblioteca Java o acesso e processamento de dados em uma fonte de dado. As classes e interfaces mais importantes são:

Classe	Interface
DriverManager	Driver
Connection
Statement
ResultSet
PreparedStatement
A classe DriverManager
Cada driver que se deseja a usar precisa ser registrado nessa classe, pois oferece métodos estáticos para gerenciar um driver JDBC.

Para a aplicação reconhecer a comunicação com o banco de dados escolhido, é preciso obter um arquivo com a extensão .jar que geralmente se consegue através dos sites das empresas que distribuem o SGBD. Esse arquivo tem o objetivo ajudar no carregamento do driver JDBC. Na prática de um desenvolvimento voltado a web, é criada a pasta “lib” da pasta “WEB-INF” e inserido esse arquivo.

No caso apresentado na Figura 2, apenas foi criado à pasta “lib” por ser um projeto Java puro e adicionado a biblioteca copiada para dentro do projeto.

Adicionando a biblioteca MySQL Connector no projeto.
Figura 2: Adicionando a biblioteca MySQL Connector no projeto.

Listagem 1: Carregando o driver MySQL.

try {
//Carrega o driver especificado
Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
System.out.println("Driver não encontrado!"+e);
}
Após o driver estar inicializado, pode-se abrir uma conexão através do método getConection da classe DriverManager. Esse método possui três sobrecargas apresentado na Listagem 2.

Listagem 2: Sobrecarga do método getConnection.

public static Connection getConnection(String url)
public static Connection getConnection(String url, Properties info)
public static Connection getConnection(String url, String user, String password)
A interface Connection
Representa uma conexão ao banco de dados. Nessa interface são apresentados os métodos mais utilizados.

Método close
Geralmente é inserido dentro do bloco finally para realizar sempre a sua execução, pois esse método serve para fechar e liberar imediatamente um objeto Connection.

Método isClosed
Serve para verificar se o objeto Connection está fechado.

Método createStatement
É usado para criar um objeto Statement que executa instruções SQL ao banco de dados.

Listagem 3: Método que cria uma conexão com o banco de dados.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection createConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/loja"; //Nome da base de dados
		String user = "root"; //nome do usuário do MySQL
		String password = "root"; //senha do MySQL

		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);

		return conexao;
	}
}
Método prepareStatement
É usado para criar um objeto que representa a instrução SQL que será executada, sendo que é invocado através do objeto Connetion.

Listagem 4: Exemplo da execução de uma instrução SQL através do prepareStatement

String sql = "INSERT INTO loja (nome,sobrenome,idade,salario) VALUES ('Mario','Corleone','28','2322.39')";
//Prepara a instrução SQL
PreparedStatement ps = conexao.prepareStatement(sql);
//Executa a instrução SQL
ps.execute();
setAutoCommit
Esse método aceita como parâmetro um valor booleano (true ou false), no qual consegue definir se todas as instruções executadas serão gravadas (comitadas). Por padrão, quando finalizada uma instrução de INSERT, UPDATE ou DELETE a operação de gravação (commit) é executada automaticamente sem a necessidade de invocar o método setAutoCommit. Agora, para instruções de SELECT, a gravação dos dados ocorre quando o conjunto de dados associados é fechado, ou seja, quando invocado o método close.

rollback
Usado para retornar uma transação, sendo muito usado dentro de blocos catch em caso de alguma operação gerar erro.

Listagem 5: Exemplos do método setAutoCommit, rollback e commit.

try {
conexao.setAutoCommit(false);
ps = conexao.prepareStatement(sql);
ps.executeUpdate();

	//Grava as informações se caso de problema os dados não são gravados
	conexao.commit();

} catch (SQLException e ) {
if (conexao != null) {
try {
System.err.print("Rollback efetuado na transação");
conexao.rollback();
} catch(SQLException e2) {
System.err.print("Erro na transação!"+e2);
}
}
} finally {
if (ps != null) {
ps.close();
}
conexao.setAutoCommit(true);
}
A interface Statement
Nesta interface são listados os métodos executeQuery e executeUpdate que são considerados os mais importantes referente 
a execução de uma query.

executeQuery - Executa uma instrução SQL que retorna um único objeto ResultSet.
executeUpdate - Executa uma instrução SQL referente a um INSERT, UPDATE e DELETE. Esse método retorna a quantidade 
de registros que são afetados pela execução do comando SQL.

Interface ResultSet
Representa o conjunto de resultados de uma tabela no banco de dados. Esse objeto mantém o cursor apontando para a sua 
linha atual de dados, sendo que seu início fica posicionado na primeira linha.

Além disso, esse objeto fornece métodos getters referentes aos tipos de dados como: getInt, getString, getDouble, 
getFloat, getLong entre outros. Com esses métodos são possíveis recuperar valores usando, por exemplo, o nome da 
coluna ou número do índice.



## NoSql (Not only SQL - Não apenas SQL)


Os BD não relacionais podem eventualmente usar SQL ou variações de SQL na hora de consultar ou persistir os dados.
No caso do MongoDB ele usa uma API própria para consultar/persisrit dados.

Classificação dos BD não Relacionais em 4 grandes grupos:

Nós temos os BD baseados em:
- chave Valor
- documentos
- grafo
- Column Family Data Base

![](.Readme_images/6229c682.png)

Redis: O Redis é um armazenamento de estrutura de dados na memória, usado
como um banco de dados de valor-chave na memória distribuído, cache e agente
de mensagens, com durabilidade opcional. O Redis oferece suporte a diferentes
tipos de estruturas de dados abstratas, como strings, listas, mapas, conjuntos,
conjuntos classificados, HyperLogLogs, bitmaps, fluxos e índices espaciais

MongoDB: é um programa de banco de dados orientado a documentos
multiplataforma disponível na fonte. Classificado como um programa de banco de
dados NoSQL, o MongoDB usa documentos semelhantes a JSON com esquemas
opcionais.

Neo4j: é um sistema de gerenciamento de banco de dados gráfico desenvolvido
pela Neo4j, Inc. Descrito por seus desenvolvedores como um banco de dados
transacional compatível com ACID com armazenamento e processamento gráfico nativo.

O Cassandra: é um sistema de gerenciamento de banco de dados NoSQL gratuito
e de código aberto, distribuído e com colunas amplas, projetado para lidar com
grandes quantidades de dados em muitos servidores comuns, fornecendo alta
disponibilidade sem ponto único de falha.

Bigtable: é um serviço de banco de dados NoSQL de valor-chave e colunas amplas
totalmente gerenciado para grandes cargas de trabalho analíticas e operacionais
como parte do portfólio do Google Cloud.(Armazenamento de Valores-chave e também
de colunas.


**GRAPQL(biblioteca do facebook)) é uma alternativa de APIS webservices do tipo REST,  Você consegue pegar uma API
que não foi modelada como grafo e organizar os dados em grafo. 


## Escalonamento Banco Relacional VS Não relacional

Escalonamento de dados: tornar a nossa base de dados  robusta o suficiente para atender milhares e milhares e até milhões
de requisições simultâneamente.

Temos o Escalonamento Vertical VS Horizontal

 - Scaling up(Escalonamento Vertical)
O escalonamento vertical é colocar mais capacidade de memória (principal e/ou de massa) e processamento. Ou seja, 
é comprar um hardware mais poderoso para dar conta do recado.

Em alguns casos basta criar mais processos/threads que está fazendo o scaling up, desde que o hardware já suporte esse 
aumento. Há casos que separar o banco de dados em vários dispositivos de armazenamento já seja uma escala vertical, 
novamente é escalar na mesma máquina.

O investimento é basicamente em hardware. Comprando mais processador. memória e armazenamento já tem uma capacidade aumentada.

Em alguns casos é mais questão de fazer uma simples configuração para alcançar o que o hardware único já suporta.

Também pode ser otimizar a aplicação para que ela desempenhe melhor e atenda mais do que fazia antes

- Scaling out(Escalonamento Horizontal)
  O escalonamento horizontal é colocar mais computadores para dar conta do recado. Claro que eles adicionam mais 
- capacidade de processamento e memória também, na soma total.

É muito mais complexo fazer um escalonamento horizontal tanto do ponto de vista de gerenciamento quanto do ponto de vista 
de programação, ainda que existam ferramentas para facilitar. Não é só colocar os computadores, eles precisam "se falar" 
de forma consistente e adequada. Na verdade isso é considerado o problemas mais difícil de resolver na computação.

Por incrível que pareça pode ser mais barato que o vertical, pelo menos no custo da aquisição da infraestrutura já 
que é possível adquirir hardware mais simples e mais comum que costuma ser mais barato pela escala de produção. Claro 
que o custo de gerenciamento e desenvolvimento pode mudar o custo total.

Fora os casos que o vertical não comportaria a necessidade, afinal essa estratégia tem um limite que em tese o 
horizontal não tem, o horizontal tem a vantagem de ser mais tolerante a falhas, ou pelo menos ser mais fácil ter 
a operação de volta em caso de alguma falha.

Escalonamento Horizontal você adiciona mais máquinas em seu pool de recursos enquanto escalonamento Vertical significa 
que você adiciona mais poder (CPU, RAM) para uma máquina existente.

Em um banco de dados Horizontal é muitas vezes baseada no particionamento dos dados, ou seja, cada nó contém apenas parte 
dos dados.

No banco de dados Vertical os dados residem em um único nó e o dimensionamento é feito através de multi-core, ou seja, 
espalha a carga entre o CPU e a memória RAM.

No escalonamento horizontal muitas vezes é mais fácil de redimensionar dinamicamente adicionando mais máquinas, já na 
Vertical é muitas vezes limitada à capacidade de uma única máquina escalonar,além de que a capacidade muitas vezes 
envolve o tempo de inatividade e vem com um limite superior.

Exemplo escalonamento horizontal: Cassandra, MongoDB..

Exemplo escalonamento vertical MySQL - Amazon RDS (A versão nuvem de MySQL). Ele fornece uma maneira fácil de escalar 
verticalmente, passando de pequenos para máquinas maiores. Este processo envolve muitas vezes o tempo de inatividade.

In-Memory Dados Grids como GigaSpaces XAP , Coerência etc .. são frequentemente otimizado tanto para escalonamento 
horizontal e vertical, simplesmente porque não é obrigado a disco. Horizontal através de particionamento e vertical 
através de apoio multi-core.

Só para contextualização, o que gera a necessidade de fazer algum tipo de escalonamento é que o crescimento do acesso 
à internet fez com que as grandes redes sociais, sistemas de buscas, entre outros, recebessem uma grande quantidade de 
dados. Devido a esse crescimento, uma grande quantidade de dados é gerada e esses dados são valiosos, visto que são 
utilizados como fonte de informação para tomada de decisões estratégicas e mineração de dados.

Os Bancos de Dados Relacionais são mais fáceis de serem escalados de forma vertical, mas isso não qur dizer que eles não 
podem ser feitos de forma horizontal, mas o desafio é maior .
Já os Bancos de Dados Não relacional você consegue separar os dados em multiplas instancias (várias máquinas diferentes).


## Mongo DB

É um BD baseado em documento, e esse documetno é o JSON, esse é o formato que vamos armazenar dentro do MongoDB.

o MongoDB tem o DataBase que é o BD(SCHEMA em outros bancos tipo mysql).
Dentro de uma única instancia do MongoDB nós podemos ter várias instancias do BD. 
Dentro do Banco de dados nós temos a Collections que são equivalentes a tabelas no BD relacional.
E dentro das collections você tem os documents que são relativos a linhas/tuplas/registros de uma tabela dentro do BD.
O MongoDB é um banco sem schema, ou seja você pode inserir dados numa coleção que nem existe, dentro de um documento
ter vários relacionamentos.
No MongoDB não usamos SQL, usamos uma API

## Comandos Básicos MongoDB






