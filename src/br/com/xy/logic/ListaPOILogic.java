package br.com.xy.logic;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.xy.DAO.PoiDao;
import br.com.xy.modelo.POI;


public class ListaPOILogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		List<POI> poi = new PoiDao().getLista();
		req.setAttribute("poi", poi);
		return "/jsp/lista-poi.jsp";
	}

}
