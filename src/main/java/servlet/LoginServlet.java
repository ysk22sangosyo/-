package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abc.Product;
import service.ProductService;
import util.ParamUtil;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		// TODO Auto-generated method stub
	    // 文字化け対策
        request.setCharacterEncoding("UTF-8");
        
        // ログインID、パスワードを取得
        String id = request.getParameter("product_id");
        
        
      

        
        
     // 入力値のチェック
        if (ParamUtil.isNullOrEmpty(id)) {
            // メッセージ設定
            request.setAttribute("msg", "product_idを入力してください");

            // 次画面指定
            request.getRequestDispatcher("top.jsp").forward(request, response);
            return;
        }
        // ログインチェック
        ProductService productService = new ProductService();
        Product product = productService.findById(id);
        // 表示メッセージの受け渡し
         if (product != null) {
            // メッセージ設定
        	
        	 
             request.setAttribute("product", product);

            // 次画面指定
            request.getRequestDispatcher("searchResult.jsp").forward(request, response);
        } else {
        	List<Product> list = productService.find();
        	String msg = list.get(0).getProductName();
            // メッセージ設定
        	 request.setAttribute("msg", msg);
            request.setAttribute("msg", "対象のデータはありません。 ");

            // 次画面指定
            request.getRequestDispatcher("top.jsp").forward(request, response);
        } 
	} 

}
