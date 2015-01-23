package br.com.xy.logic;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.xy.DAO.PoiDao;
import br.com.xy.modelo.POI;


public class RemovePOILogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		long id = Long.parseLong(req.getParameter("id"));
		POI poi = new POI();
		poi.setId(id);
		Connection connection = (Connection) req.getAttribute("conexao");
		PoiDao dao = new PoiDao(connection);
		dao.remove(poi);
		System.out.println("Excluindo ponto de interesse... ");
		return "?logic=ListaPOILogic";
	}

}
