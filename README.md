# Clases Abstractas e Interfaces

Un fanático de Pókemon desea implementar para el modelado de un videojuego los diferentes ataques de cada una de estas criaturas.  
Para ello, cuenta con una _clase abstracta_ llamada **Pokemon**, la cual posee los atributos:

1. numPokedex 
1. nombrePokemon 
1. pesoPokemon
1. sexo
1. temporadaQueAparece  
1. tipo

E implementa métodos para los ataques comunes que suele tener la mayoría, entre ellos se encuentran:    
* atacarPlacaje()
* atacarArañazo()
* atacarMordisco()

Sin embargo, este fanático también desarrolló una serie de interfaces para contemplar los ataques de Pókemons de cierto tipo:

IElectrico:
* atacarImpactrueno()
* atacarPunioTrueno()
* atacarRayo()
* atacarRayoCarga()


IPlanta:
* atacarParalizar()
* atacarDrenaje()
* atacarHojaAfilada()
* atacarLatigoCepa()


IFuego: 
* atacarPunioFuego()
* atacarAscuas()
* atacarLanzallamas()


IAgua:
* atacarHidrobomba()
* atacarPistolaAgua()
* atacarBurbuja()
* atacarHidropulso()


A partir de estas interfaces, el Pokefanático desea crear las clases que manejen a los personajes principales del videojuego, los cuales son los  pokemons starters de la primera temporada (Charmander, Bulbasaur y Squirtle) y Pikachu.

Para ello tener en cuenta que: 
* Charmander es de tipo fuego
* Bulbasaur es de tipo planta
* Squirtle es de tipo agua 
* Pikachu de tipo eléctrico.

Una vez implementadas la clase abstracta e interfaces, sobrescribir los métodos correspondientes para adaptarlos a cada Pókemon mostrando un mensaje  en pantalla que indique qué pókemon es y qué ataque está realizando.

Por ejemplo: 
* “Soy Charmander y estoy atacando  con  Ascuas” 
* “Soy  Pikachu  y  estoy  atacando  con  placaje”  

Luego de realizar lo mencionado, crear las instancias necesarias y llamar a cada uno de los métodos de cada Pokemon.
