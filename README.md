<h1>Systém pro správu knihovny</h1>

<p>Tento projekt je ukázkou mých zkušeností v OOP a zkušeností v jazyce Java. Aplikace umožňuje uživateli 
spravovat sbírku knih – přidávat nové knihy, půjčovat je, vracet a zobrazovat jejich stav.</p>

<h2>Funkce</h2>
<ul>
    <li><strong>Přidání nové knihy:</strong> Možnost přidat knihu do knihovny.</li>
    <li><strong>Půjčení knihy:</strong> Umožňuje půjčit knihu, pokud je dostupná.</li>
    <li><strong>Vrácení knihy:</strong> Vrácení knihy zpět do knihovny.</li>
    <li><strong>Zobrazení knih:</strong> Zobrazuje všechny knihy s informací o jejich aktuálním stavu (půjčená/dostupná).</li>
</ul>

<h2>Struktura projektu</h2>
<ul>
    <li><strong>Book.java:</strong> Reprezentuje knihu a obsahuje její atributy (název, autor, rok vydání a stav).</li>
    <li><strong>Library.java:</strong> Spravuje seznam knih, nabízí metody pro přidání, půjčování, vracení a zobrazení knih.</li>
    <li><strong>Manager.java:</strong> Zpracovává uživatelské vstupy a komunikuje s knihovnou.</li>
    <li><strong>Main.java:</strong> Hlavní třída programu, která zajišťuje běh aplikace a zobrazuje menu s volbami.</li>
</ul>
