package by.team34.dao;

import by.team34.entity.Vacancy;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class VacancyDao implements IGenericDao<Vacancy, Integer> {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public final List<Vacancy> findAll() {
        return sessionFactory.getCurrentSession().createQuery(
                "select distinct vacancy from Vacancy vacancy"
                        + " left join fetch vacancy.user"
                        + " left join fetch vacancy.skills")
                .list();
    }

    @Override
    public final List<Vacancy> sort(String type) {
        return sessionFactory.getCurrentSession().createQuery(
                "select distinct vacancy from Vacancy vacancy"
                        + " left join fetch vacancy.user"
                        + " left join fetch vacancy.skills order by vacancy." + type).list();
    }

    @Override
    public final Vacancy findBy(Integer parameter) {
        return sessionFactory.getCurrentSession().get(Vacancy.class, parameter);
    }

    @Override
    public final void insert(Vacancy object) {
        sessionFactory.getCurrentSession().saveOrUpdate(object);
    }

    @Override
    public final void update(Vacancy object) {
        sessionFactory.getCurrentSession().update(object);
    }

    @Override
    public final void delete(Integer parameter) {
        Vacancy vacancy = sessionFactory.getCurrentSession().load(Vacancy.class,
                parameter);
        if (vacancy != null) {
            sessionFactory.getCurrentSession().delete(vacancy);
        }
    }
}