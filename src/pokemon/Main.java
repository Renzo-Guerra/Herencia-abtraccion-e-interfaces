package pokemon;

public class Main {
	public static void main(String[] args) {
		PokemonPlanta pokemonPlanta1 = new PokemonPlanta(1, "Bulbasaur", 6.9, 'M', 1);
		PokemonPlanta pokemonPlanta2 = new PokemonPlanta(10, "Caterpie", 2.9, 'F', 1);
		PokemonFuego pokemonFuego = new PokemonFuego(4, "Charmander", 8.5, 'M', 1);
		PokemonElectrico pokemonElectrico = new PokemonElectrico(25, "Pikachu", 6.0, 'M', 1);
		PokemonAgua pokemonAgua = new PokemonAgua(7, "Squirtle", 9.0, 'M', 1);
		
		System.out.println(pokemonPlanta1+"\n");
		System.out.println(pokemonPlanta2+"\n");
		System.out.println(pokemonFuego+"\n");
		System.out.println(pokemonElectrico+"\n");
		System.out.println(pokemonAgua+"\n");
		
		pokemonPlanta1.atacarDrenaje();
		pokemonPlanta2.atacarLatigoCepa();
		pokemonFuego.atacarLanzallamas();
		pokemonPlanta1.atacarMordisco();
		pokemonElectrico.atacarImpactrueno();
		pokemonFuego.atacarAraniaso();
		pokemonAgua.atacarHidropulso();
	}
}
