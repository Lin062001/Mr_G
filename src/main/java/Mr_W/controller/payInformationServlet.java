package Mr_W.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Mr_W.model.expense;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class ReservationServlet
 */
@WebServlet("/payInformation")
public class payInformationServlet extends HttpServlet {
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    	String id=request.getParameter("id");
    	if(id==null)
    		id="";
    	expense expense=new expense();
    	expense.setId("001");
    	expense.SetCost(30);
    	expense.setGoal("就诊");
    	expense.setPayID("00001");
    	expense.setSign("未支付");
    	expense expense1=new expense();
    	expense1.setId("002");
    	expense1.SetCost(100);
    	expense1.setGoal("取药");
    	expense1.setPayID("30001");
    	expense1.setSign("已支付");
    	List<expense> list=new ArrayList<expense>();
    	list.add(expense);
    	list.add(expense1);
    	request.setAttribute("expense",list);
    	
        request.getRequestDispatcher("/payInformation.jsp?id="+id).forward(request, response);
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
