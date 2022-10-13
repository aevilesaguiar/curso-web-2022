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
