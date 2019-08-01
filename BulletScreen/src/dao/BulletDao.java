package dao;

import domain.Bullet;

import java.util.List;

/**
 * @author yihang
 */
public interface BulletDao {

    /**
     * 添加弹幕
     * @param bullet 弹幕对象
     */
    void insert(Bullet bullet);

    /**
     * 按视频编号查询弹幕
     * @param videoId 视频编号
     * @return 弹幕集合
     */
    List<Bullet> findByVideoId(int videoId);
}
