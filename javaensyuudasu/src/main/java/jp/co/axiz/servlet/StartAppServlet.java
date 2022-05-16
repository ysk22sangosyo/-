package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;
/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")
public class StartAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartAppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    request.setCharacterEncoding("UTF-8");
	    String name = request.getParameter("name");
	    String app = request.getParameter("app");
	    String result = "";
	    App a = null;
	   
	    if(name != null && !name.isEmpty()) {
	    	if(app.equals("others")){
	    		result = "アプリの実行に失敗しました。"; 
	    	} else {
	    		switch(app) {
	    		case "tranp": 
	    			a =new CardGameApp ("トランプ");
	    			break;
	    		case "darts":
	    			a = new DartsGameApp("ダーツ");
	    			break;
	    		case "clock" :
	    			a = new ClockApp ();
	    			break;
	    		}
	         result = a.start(name);
	    	}
	    	 if(a instanceof GameApp) {
	    		 GameApp gameApp = (GameApp)a;
	    		 request.setAttribute("playTime", gameApp.getplayTime());
	 	    }
	    }
	    
	    request.setAttribute("result", result);
  	    request.getRequestDispatcher("/appStart.jsp").forward(request, response);
	}
	
	    
}
