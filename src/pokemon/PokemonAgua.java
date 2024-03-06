package pokemon;

public class PokemonAgua extends Pokemon implements IAgua{
	private static final String TIPO = "Agua";
	
	public PokemonAgua(int numeroEnPokedex, String nombre, Double peso, Character genero, int temporadaEnLaQueAparece) {
		super(numeroEnPokedex, nombre, peso, genero, temporadaEnLaQueAparece, TIPO);
	}
	
	@Override
	public void atacarHidrobomba() {
		System.out.println(this.getNombre()+" ha atacado con hidrobomba!");
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println(this.getNombre()+" ha atacado con pistola agua!");		
	}

	@Override
	public void atacarBurbuja() {
		System.out.println(this.getNombre()+" ha atacado con burbuja!");
	}

	@Override
	public void atacarHidropulso() {
		System.out.println(this.getNombre()+" ha atacado con hidropulso!");
	}
}
