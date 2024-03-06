package pokemon;

public class PokemonElectrico extends Pokemon implements IElectrico{
	private static final String TIPO = "Electrico";
	
	public PokemonElectrico(int numeroEnPokedex, String nombre, Double peso, Character genero, int temporadaEnLaQueAparece) {
		super(numeroEnPokedex, nombre, peso, genero, temporadaEnLaQueAparece, TIPO);
	}

	@Override
	public void atacarImpactrueno() {
		System.out.println(this.getNombre()+" ha atacado con impactrueno!");
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println(this.getNombre()+" ha atacado con pinio trueno!");
	}

	@Override
	public void atacarRayo() {
		System.out.println(this.getNombre()+" ha atacado con rayo!");
	}

	@Override
	public void atacarRayoCarga() {
		System.out.println(this.getNombre()+" ha atacado con rayo carga!");
	}

}
