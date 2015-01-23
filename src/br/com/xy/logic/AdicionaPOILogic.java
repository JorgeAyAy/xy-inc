package br.com.xy.logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.istack.internal.NotNull;

import br.com.xy.DAO.PoiDao;
import br.com.xy.modelo.POI;

@WebServlet("/adicionaPOI")
public class AdicionaPOILogic extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();

		try {
			
			// pegando os parâmetros do request
			String nomePOI = request.getParameter("nomePOI");
			int coordenadaX = Integer.parseInt(request.getParameter("coordenadaX"));
			int coordenadaY = Integer.parseInt(request.getParameter("coordenadaY"));

			// monta um objeto poi
			POI poi = new POI();
			poi.setNomePOI(nomePOI);

			poi.setCoordenadaX(coordenadaX);
			poi.setCoordenadaY(coordenadaY);

			// salva o poi
			PoiDao dao;
			dao = new PoiDao();
			
			if(poi.getCoordenadaX() >= 0 && poi.getCoordenadaY() >= 0){
				
				dao.adiciona(poi);
				// imprime o poi que foi adicionado
				out.println("<html>");
				out.println("<body>");
				RequestDispatcher rd = request.getRequestDispatcher("/jsp/poi-adicionado.jsp");
				rd.forward(request, response);
	
				out.println("</body>");
				out.println("</html>");
			}else{
				request.getSession().setAttribute("mensagem", "Suas coordenadas devem ser inteiras positivas"); 
				System.out.println("Suas coordenadas devem ser inteiras positivas");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException err) {
			out.println("<h5> Adicione apenas inteiros positivos nos campos das coordenadas </h5>");
		}

	}

}
