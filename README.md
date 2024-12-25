<h1>Systém pro správu knihovny</h1>

<p>Tento projekt je ukázkou mých zkušeností v OOP a zkušenosti v jazyce Java. Aplikace umožňuje uživateli sprvoat sbírku knih - přidávat knihy, půjčovat je, vracet a zobrazovat jejich stav</p>

<h2>Funkce</h2>
<ul>
  <li><strong>Přidání knihy:</strong> Možnost přidat knihu do knihovny.</li>
  <li><strong>Půjčení knihy:</strong> Umožňuje půjčit si knihu podle zadaného jména v knihovně, pokud je dostupná.</li>
  <li><strong>Vrácení knihy:</strong> Vrácení knihy podle zadaného jména do knihovny.</li>
  <li><strong>Zobrazení knih:</strong> Zobrazuje všechny knihy s informacemi (název, jméno autora, rok vydání, dostupnost)</li>
</ul>

<h2>Struktura projektu</h2>
<ul>
  <li><strong>Book.java</strong> Reprezentuje knihu a obsahuje její atributy (název, jméno autora, rok vydání a dostupnost).</li>
  <li><strong>BookService.java</strong>  Definuje základní operace pro správu knih, jako je půjčení a vrácení knihy.</li>
  <li><strong>BookTest.java</strong> Testuje metody pro půjčení a vrácení knih v třídě <strong>Book</strong>.</li>
  <br>
  <li><strong>Library.java</strong> Spravuje seznam knih, nabízí metody pro přidání půjčování, vracení a zobrazení knih.</li>
  <li><strong>LibraryService.java</strong> Poskytuje metody pro správu knihovny, jako je přidání nové knihy, půjčování a vracení knih podle názvu, nebo zobrazení všech knih v knihovně.</li>
  <li><strong>LibraryTest.java</strong> Testuje metody pro přidávání knih, půjčování a vracení knih podle názvu v třídě <strong>Library</strong>.</li>
  <br>
  <li><strong>Command.java</strong> Třída zajišťující komunikaci s uživatelem prostřednictvím konzole. Využívá metody definované v knihovní logice pro správu knih.</li>
  <li><strong>Main.java</strong> Hlavní třída programu, která zajišťuje běh aplikace a zobrazuje menu s volbami.</li>
</ul>
