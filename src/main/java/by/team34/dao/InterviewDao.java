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
        return sessionFactory.getCurrentSession()
                .createQuery("select distinct i" +
                        " from Interview i" +
                        " left join fetch i.candidateFeedbacks" + // candidateFeedbacks left join fetch candidateFeedbacks.feedbackDetails" +
  //                                                                          " left join fetch candidateFeedbacks.feedbackState " +
  //                                                                          " left join fetch candidateFeedbacks.user user left join fetch user.roles" +
                        " left join fetch i.candidate " +
                        " left join fetch i.vacancy")
                .list();
    }

    @Override
    public List<Interview> sort(String type) {
        return null;
    }

    @Override
    public Interview findBy(Long parameter) {
        return null;
    }

    @Override
    public void insert(Interview object) {

    }

    @Override
    public void update(Interview object) {

    }

    @Override
    public void delete(Long parameter) {

    }
}
