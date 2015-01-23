package br.com.xy.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.xy.config.ConnectionFactory;
import br.com.xy.modelo.POI;


public class PoiDao {
	
	private Connection connection;

	public PoiDao() throws ClassNotFoundException {

		this.connection = new ConnectionFactory().getConnection();

	}

	public PoiDao(Connection connection) {
		
		this.connection = connection;
	}
	
	public void adiciona(POI poi) {
		
		

		String sql = "insert into poi "
				+ "(nomePOI,coordenadaX,coordenadaY)" + " values (?,?,?)";

		try {

			PreparedStatement stmt = this.connection.prepareStatement(sql);

			stmt.setString(1, poi.getNomePOI());
			stmt.setInt(2, poi.getCoordenadaX());
			stmt.setInt(3, poi.getCoordenadaY());

			stmt.execute();

			stmt.close();

		} catch (SQLException e) {
			throw new DAOException(e.getMessage());

		}

	}

	public List<POI> getLista() {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("select * from poi");

			ResultSet rs = stmt.executeQuery();

			List<POI> pois = new ArrayList<POI>();

			while (rs.next()) {

				POI poi = new POI();

				poi.setId(rs.getLong("id"));
				poi.setNomePOI(rs.getString("nomePOI"));
				poi.setCoordenadaX(rs.getInt("coordenadaX"));
				poi.setCoordenadaY(rs.getInt("coordenadaY"));
				
				pois.add(poi);

			}

			rs.close();
			stmt.close();

			return pois;

		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

	public List<POI> pesquisarProximidade(int x, int y) {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("select * from poi where coordenadaX <= "+x+" and coordenadaY <= "+ y);

			ResultSet rs = stmt.executeQuery();

			List<POI> pois = new ArrayList<POI>();

			POI poi = new POI();

			while (rs.next()) {

				poi.setId(rs.getLong("id"));
				poi.setNomePOI(rs.getString("nomePOI"));
				poi.setCoordenadaX(rs.getInt("coordenadaX"));
				poi.setCoordenadaY(rs.getInt("coordenadaY"));


				pois.add(poi);
			}
			rs.close();
			stmt.close();

			return pois;

		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

	public void altera(POI poi) {
		String sql = "update poi set nomePOI=?, coordenadaX=?, coordenadaY=?,"
				+ " where id=?";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, poi.getNomePOI());
			stmt.setInt(2, poi.getCoordenadaX());
			stmt.setInt(3, poi.getCoordenadaY());
			stmt.setLong(5, poi.getId());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

	public void remove(POI contato) {
		try {
			PreparedStatement stmt = connection
					.prepareStatement("delete from poi where id=?");
			stmt.setLong(1, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new DAOException(e.getMessage());
		}
	}

}
