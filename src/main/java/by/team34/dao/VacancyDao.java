package by.team34.dao;

import by.team34.entity.Vacancy;
import com.mycom.dao.VacancyDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class VacancyDao implements IGenericDao<Vacancy, Integer> {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Vacancy> findAll() {
        return sessionFactory.getCurrentSession().createQuery(
                "select distinct vacancy from Vacancy vacancy"
                        + " left join fetch vacancy.user"
                        + " left join fetch vacancy.skills")
                .list();
    }

    @Override
    public List<Vacancy> sort(String type) {
        return sessionFactory.getCurrentSession().createQuery(
                "select distinct vacancy from Vacancy vacancy"
                        + " left join fetch vacancy.user"
                        + " left join fetch vacancy.skills order by vacancy." + type).list();
    }

    @Override
    public Vacancy findBy(Integer parameter) {
        return null;
    }

    @Override
    public void insert(Vacancy object) {

    }

    @Override
    public void update(Vacancy object) {

    }

    @Override
    public void delete(Integer parameter) {

    }
}