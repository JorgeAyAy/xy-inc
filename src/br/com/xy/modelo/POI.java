package br.com.xy.modelo;


public class POI {
	
	private Long id;
	private String nomePOI;
	private int coordenadaX;
	private int coordenadaY;
	
	public POI(){
		
	}
	
	public POI(Long id, String nomePOI, int coordenadaX, int coordenadaY){
		this.id = id;
		this.nomePOI = nomePOI;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		
	}
	
	public POI(String nomePOI, int coordenadaX, int coordenadaY){
		this.nomePOI = nomePOI;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		
	}
	
	public long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}

	public String getNomePOI() {
		return nomePOI;
	}

	public void setNomePOI(String nomePOI) {
		this.nomePOI = nomePOI;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

}
