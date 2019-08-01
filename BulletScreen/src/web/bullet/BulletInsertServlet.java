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
import java.util.Map;

/**
 * @author yihang
 */
@WebServlet("/bullet/insert")
public class BulletInsertServlet extends HttpServlet {

    private BulletService bulletService = new BulletServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        int videoId = Integer.parseInt(req.getParameter("videoId"));
        int time = Integer.parseInt(req.getParameter("time"));
        String content = req.getParameter("content");
        int skinId = Integer.parseInt(req.getParameter("skinId"));
        String username = req.getParameter("username");

        Bullet bullet = new Bullet();
        bullet.setVideoId(videoId);
        bullet.setTime(time);
        bullet.setContent(content);
        bullet.setSkinId(skinId);
        bullet.setUsername(username);

        bulletService.insert(bullet);

        Map<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("msg", "添加成功");

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getWriter(), result);
    }
}
