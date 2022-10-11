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



