package by.team34.service;

import by.team34.dao.IGenericDao;
import by.team34.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserService implements IGenericService<User, Long> {

    @Autowired
    private IGenericDao<User, Long> userDao;

    @Transactional
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional
    @Override
    public List<User> sort(String type) {
        return userDao.sort(type);
    }

    @Transactional
    @Override
    public User findBy(Long parameter) {
        return userDao.findBy(parameter);
    }

    @Transactional
    @Override
    public void insert(User object) {
        userDao.insert(object);
    }

    @Transactional
    @Override
    public void update(User object) {
        userDao.update(object);
    }

    @Transactional
    @Override
    public void delete(Long parameter) {
        userDao.delete(parameter);
    }
}
