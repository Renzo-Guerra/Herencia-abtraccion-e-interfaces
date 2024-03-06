package pokemon;

public abstract class Pokemon {
	private int numeroEnPokedex;
	private String nombre;
	private Double peso;
	private Character genero;
	private int temporadaEnLaQueAparece;
	private String tipo;
	
	public Pokemon(int numeroEnPokedex, String nombre, Double peso, Character genero, int temporadaEnLaQueAparece, String tipo) {
		this.numeroEnPokedex = numeroEnPokedex;
		this.nombre = nombre; 
		this.peso = peso;
		this.genero = genero;
		this.temporadaEnLaQueAparece = temporadaEnLaQueAparece; 
		this.tipo = tipo; 
	}
	
	public void atacarPlacaje() {
		System.out.println(this.getNombre() +" atacó con placaje!");
	}
	
	public void atacarAraniaso() {
		System.out.println(this.getNombre() +" atacó con araniaso!");
	}
	
	public void atacarMordisco() {
		System.out.println(this.getNombre() +" atacó con mordisco!");
	}
	
	protected String getNombre() {
		return this.nombre;
	}

	protected int getNumeroEnPokedex() {
		return this.numeroEnPokedex;
	}

	protected Double getPeso() {
		return this.peso;
	}

	protected Character getGenero() {
		return this.genero;
	}

	protected int getTemporadaEnLaQueAparece() {
		return this.temporadaEnLaQueAparece;
	}

	protected String getTipo() {
		return this.tipo;
	}

	@Override
	public String toString() {
		return "{Nombre=" + this.getNombre() + ", Numero En Pokedex=" + this.getNumeroEnPokedex() + ", Peso="
				+ this.getPeso() + ", Genero=" + this.getGenero() + ", TemporadaEnLaQueAparece="
				+ this.getTemporadaEnLaQueAparece() + ", Tipo=" + this.getTipo() + "}";
	}
	
	
}
