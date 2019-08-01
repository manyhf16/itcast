package service.impl;

import dao.BulletDao;
import dao.impl.BulletDaoImpl;
import domain.Bullet;
import service.BulletService;

import java.util.List;

/**
 * @author yihang
 */
public class BulletServiceImpl implements BulletService {

    private BulletDao bulletDao = new BulletDaoImpl();

    @Override
    public void insert(Bullet bullet) {
        bulletDao.insert(bullet);
    }

    @Override
    public List<Bullet> findByVideoId(int videoId) {
        return bulletDao.findByVideoId(videoId);
    }
}
