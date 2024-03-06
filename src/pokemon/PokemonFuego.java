package pokemon;

public class PokemonFuego extends Pokemon implements IFuego{
	private static final String TIPO = "Fuego";
	
	public PokemonFuego(int numeroEnPokedex, String nombre, Double peso, Character genero, int temporadaEnLaQueAparece) {
		super(numeroEnPokedex, nombre, peso, genero, temporadaEnLaQueAparece, TIPO);
	}

	@Override
	public void atacarPunioFuego() {
		System.out.println(this.getNombre()+" ha atacado con punio fuego!");
	}

	@Override
	public void atacarAscuas() {
		System.out.println(this.getNombre()+" ha atacado con ascuas!");
	}

	@Override
	public void atacarLanzallamas() {
		System.out.println(this.getNombre()+" ha atacado con lanzallamas!");
	}

}
