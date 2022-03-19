<h1 align="center">Estudos sobre Generics, Set e Map.</h1>

* Objetivo deste repositório:
  - projeto destinado a estudos de Generics, Set e Map e exemplos básicos de aplicação;

- Técnlogias utilizadas para o estudo
    - Linguagem: JAVA
    - Versão: 11;


----------

<h2>Generics</h2>
<p>Generics permitem que classes, interface, e métodos possam ser parametrizados por tipo. Seus beneficios são:</p>
<li>Reuso</li>
<li>Type safety</li>
<li>Performance</li>

* Uso Comum: coleções
~~~~java
List<String> list = new ArrayList<>();
list.add("Teste");
String name = list.get(0);
~~~~