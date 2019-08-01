package web.bullet;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Bullet;
import service.BulletService;
import service.impl.BulletServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yihang
 */
@WebServlet("/bullet/findByVideoId")
public class BulletFindByVideoIdServlet extends HttpServlet {


    private BulletService bulletService = new BulletServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        int videoId = Integer.parseInt(req.getParameter("videoId"));
        List<Bullet> list = bulletService.findByVideoId(videoId);

        Map<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("msg", "查询成功");
        result.put("list", list);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getWriter(), result);
    }
}
