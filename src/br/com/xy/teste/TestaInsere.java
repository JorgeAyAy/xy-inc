package br.com.xy.teste;


import br.com.xy.DAO.PoiDao;
import br.com.xy.modelo.POI;

public class TestaInsere {
	
	
	public static void main (String [] args) throws ClassNotFoundException{
	POI poi = new POI(); 
	
	//pronto para gravar
	poi.setNomePOI("Lanchonete");
	poi.setCoordenadaX(10);
	poi.setCoordenadaY(15);
	
	//Grave nessa conex�o
	PoiDao db = new PoiDao();
	
	//m�todo elegante
	db.adiciona(poi);
	
	System.out.println("Gravado!");
	
	
	}

}
