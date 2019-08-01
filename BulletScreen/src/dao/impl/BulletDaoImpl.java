package dao.impl;

import dao.BulletDao;
import domain.Bullet;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JdbcUtil;

import java.util.List;

/**
 * @author yihang
 */
public class BulletDaoImpl implements BulletDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getDataSource());

    @Override
    public void insert(Bullet bullet) {
        jdbcTemplate.update("insert into bullet(id, video_id, time, content, skin_id,username) values (null,?,?,?,?,?)",
                bullet.getVideoId(), bullet.getTime(), bullet.getContent(), bullet.getSkinId(), bullet.getUsername());
    }

    @Override
    public List<Bullet> findByVideoId(int videoId) {
        return jdbcTemplate.query("select id, video_id, time, content, skin_id, username from bullet where video_id=?",
                new BeanPropertyRowMapper<>(Bullet.class), videoId);
    }
}
