package br.com.xy.DAO;

public class DAOException extends RuntimeException{
	
	private String msg;
	
	public DAOException(String msg){
		
		super(msg);
		this.msg = msg;
		
	}
	

}