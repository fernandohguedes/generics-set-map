<h1 align="center">Estudos sobre Generics, Set e Map.</h1>

* Objetivo deste repositório:
  - projeto destinado a estudos de Generics, Set e Map e exemplos básicos de aplicação;

- Técnlogias utilizadas para o estudo
    - Linguagem: JAVA
    - Versão: 11;


----------

##Generics
- Generics permitem que classes, interface, e métodos possam ser parametrizados por tipo. Seus beneficios são:
  - Reuso;
  - Type safety;
  - Performance;

* Uso Comum: coleções
~~~~java
List<String> list = new ArrayList<>();
list.add("Teste");
String name = list.get(0);
~~~~

----------
<h2>Set</h2>
- Representa um conjunto de elementos (similar ao da Àlgebra)
  - Não admite repetições;
  - Elementos não possuem posição;
  - Acessp, inserção e remoção de elementos são rápidos;
  - Oferece operações eficients de conjunto: interseção, unição, diferença;
  - Principais implementações:
    - **HashSet** - mais rápido (operações **0(1)** em tabela hash) e não ordenado;
    - **TreeSet** - mais lento (operações **0(log(n)**) em árvore rubro-negra) e ordenação pelo **compareTo** do objeto (ou **Comparator**);
    - **LinkedHashSet** - velocidade intermediária e elementos na ordem em que são adicionados;

####Alguns métodos importantes
~~~~~java 
add(obj);
remove(obj);
contains(obj);
~~~~~

  - Os métodos acima são Baseados em equals e hashCode;
  - Se não existir uma implementação personalizada do equals e hashCode, é usada comparação de ponteiros;

~~~~java 
clear();
size();
removeIf(predicate)
~~~~

~~~~java 
addAll(other); 
~~~~
- **união**: adiciona no conjunto os elementos do outro conjunto, sem repetição;

~~~~java 
retainAll(other); 
~~~~
- **interseção**: remove do conjunto os elementos não contidos em other;

~~~~java 
removeAll(other); 
~~~~
- **diferença**: remove do conjunto os elementos contidos em other;