package by.team34.service;

import by.team34.dao.IGenericDao;
import by.team34.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class UserService implements IGenericService<User, Integer> {

    @Autowired
    private IGenericDao<User, Integer> userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public List<User> sort(String type) {
        return userDao.sort(type);
    }

    @Override
    public User findBy(Integer parameter) {
        return userDao.findBy(parameter);
    }

    @Override
    public void insert(User object) {
        userDao.insert(object);
    }

    @Override
    public void update(User object) {
        userDao.update(object);
    }

    @Override
    public void delete(Integer parameter) {
        userDao.delete(parameter);
    }
}
