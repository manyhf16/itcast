package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yihang
 */
@WebServlet("/original")
public class OriginalServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String c = req.getParameter("c");
        String name = req.getParameter("name");
        System.out.println("【" + name + "】:" + c);
        req.setAttribute("result", "【" + name + "】:" + c);
        req.getRequestDispatcher("/index_original.jsp").forward(req, resp);
    }
}
