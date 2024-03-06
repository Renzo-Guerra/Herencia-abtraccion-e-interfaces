package pokemon;

public class PokemonPlanta extends Pokemon implements IPlanta{
	private static final String TIPO = "Planta";

	public PokemonPlanta(int numeroEnPokedex, String nombre, Double peso, Character genero, int temporadaEnLaQueAparece) {
		super(numeroEnPokedex, nombre, peso, genero, temporadaEnLaQueAparece, TIPO);
	}

	@Override
	public void atacarParalizar() {
		System.out.println(this.getNombre()+" ha atacado con paralizar!");
	}

	@Override
	public void atacarDrenaje() {
		System.out.println(this.getNombre()+" ha atacado con drenaje!");
	}

	@Override
	public void atacarHojaAfilada() {
		System.out.println(this.getNombre()+" ha atacado con hoja afilada!");
	}

	@Override
	public void atacarLatigoCepa() {
		System.out.println(this.getNombre()+" ha atacado con latigo cepa!");
	}

}
