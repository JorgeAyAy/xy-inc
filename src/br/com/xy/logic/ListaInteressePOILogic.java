package br.com.xy.logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.xy.DAO.PoiDao;
import br.com.xy.modelo.POI;

@WebServlet("/listaInteressePOI")
public class ListaInteressePOILogic extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();

		try {
			
			int coordenadaX = Integer.parseInt(request
					.getParameter("coordenadaX"));
			int coordenadaY = Integer.parseInt(request
					.getParameter("coordenadaY"));
			

			POI poi = new POI();

			poi.setCoordenadaX(coordenadaX);
			poi.setCoordenadaY(coordenadaY);

			PoiDao dao;
			dao = new PoiDao();
			
			if(poi.getCoordenadaX() >= 0 && poi.getCoordenadaY() >= 0){
				dao.pesquisarProximidade(poi.getCoordenadaX(), poi.getCoordenadaY());
				
				out.println("<html>");
				out.println("<body>");
				RequestDispatcher rd = request.getRequestDispatcher("/jsp/resultado-proximidade.jsp");
				rd.forward(request, response);
				out.println("</body>");
				out.println("</html>");
			}else{
				request.setAttribute("variavelRequestMsgErro", "Suas coordenadas devem ser inteiras positivas"); 
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException err) {
			out.println("<h5> Adicione apenas inteiros positivos nos campos das coordenadas </h5>");
		}

	}

}
