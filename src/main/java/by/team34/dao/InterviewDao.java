package by.team34.dao;

import by.team34.entity.Interview;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InterviewDao implements IGenericDao<Interview,Long>{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Interview> findAll() {
        return sessionFactory.getCurrentSession().createQuery("select distinct i"
        		+ " from Interview i"
        		+ " left join fetch i.candidate c"
        		+ " left join fetch c.candidateState"
        		+ " left join fetch c.attachments"
        		+ " left join fetch i.vacancy v"
        		+ " left join fetch v.requirements").list();
    }

    @Override
    public List<Interview> sort(String type) {
        return sessionFactory.getCurrentSession().createQuery("select distinct i"
        		+ " from Interview i"
        		+ " left join fetch i.candidate c"
        		+ " left join fetch c.candidateState"
        		+ " left join fetch c.attachments"
        		+ " left join fetch i.vacancy v"
        		+ " left join fetch v.requirements"
        		+ " order by i." + type).list();
    }

    @Override
    public Interview findBy(Long parameter) {
        return (Interview) sessionFactory.getCurrentSession().createQuery("select distinct i"
        		+ " from Interview i"
        		+ " left join fetch i.candidate c"
        		+ " left join fetch c.candidateState"
        		+ " left join fetch c.attachments"
        		+ " left join fetch i.vacancy v"
        		+ " left join fetch v.requirements"
        		+ " where i.id = " + parameter).list();
    }

    @Override
    public void insert(Interview object) {
    	sessionFactory.getCurrentSession().saveOrUpdate(object);
    }

    @Override
    public void update(Interview object) {
    	sessionFactory.getCurrentSession().saveOrUpdate(object);
    }

    @Override
    public void delete(Long parameter) {
    	Interview interview  = sessionFactory.getCurrentSession().load(Interview.class, parameter);
    	if (interview != null) {
    		sessionFactory.getCurrentSession().delete(interview);
    	}
    }
}
