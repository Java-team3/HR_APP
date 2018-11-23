package by.team34.dao;

import by.team34.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao implements IGenericDao<User, Long> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> findAll() {
        //return sessionFactory.getCurrentSession().createQuery("from User").list();
        return sessionFactory.getCurrentSession().createQuery("select u.id, u.email, u.name,"
                + " u.surname, u.userSate from User u"
                + " left join fetch u.candidateFeedbacks"
                + "left join fetch  u.vacancies"
                + "left join fetch u.roles").list();
    }

    @Override
    public List<User> sort(String type) {
        return sessionFactory.getCurrentSession().createQuery("order by" + type).list();
    }

    @Override
    public User findBy(Long parameter) {
        return sessionFactory.getCurrentSession().get(User.class, parameter);
    }

    @Override
    public void insert(User object) {
        sessionFactory.getCurrentSession().save(object);
    }

    @Override
    public void update(User object) {
        sessionFactory.getCurrentSession().update(object);
    }

    @Override
    public void delete(Long parameter) {
        User user = (User) sessionFactory.getCurrentSession().load(User.class, parameter);
        if (user != null) {
            sessionFactory.getCurrentSession().delete(user);
        }
    }
}
