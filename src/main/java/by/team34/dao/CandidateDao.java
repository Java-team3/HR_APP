package by.team34.dao;

import by.team34.entity.Candidate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CandidateDao implements IGenericDao<Candidate, Long> {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Candidate> findAll() {
        List<Candidate> list = sessionFactory.getCurrentSession().createQuery("select distinct candidate"
                + " from Candidate candidate"
                + " left join fetch candidate.candidateState"
                + " left join fetch candidate.candidateFeedbacks"
                + " left join fetch candidate.attachments"
                + " left join fetch candidate.experiences"
                + " left join fetch candidate.contactDetails"
                + " left join fetch candidate.interviews"
                + " left join fetch candidate.skills"
                + " left join fetch candidate.vacancyCandidates").list();
        for(Candidate c: list)
            System.out.println(c.getContactDetails().size());
        return list;
    }

    @Override
    public List<Candidate> sort(String type) {
       List<Candidate> list =  sessionFactory.getCurrentSession().createQuery("select distinct candidate"
                + " from Candidate candidate"
                + " left join fetch candidate.candidateState"
                + " left join fetch candidate.candidateFeedbacks"
                + " left join fetch candidate.attachments"
                + " left join fetch candidate.experiences"
                + " left join fetch candidate.contactDetails"
                + " left join fetch candidate.interviews"
                + " left join fetch candidate.skills"
                + " left join fetch candidate.vacancyCandidates order by candidate." + type).list();
       for(Candidate c: list)
           System.out.println(c.getContactDetails().size());
       return list;
    }

    @Override
    public Candidate findBy(Long parameter) {
        return (Candidate)sessionFactory.getCurrentSession().createQuery("select candidate"
                + " from Candidate candidate"
                + " left join fetch candidate.candidateState"
                + " left join fetch candidate.candidateFeedbacks"
                + " left join fetch candidate.attachments"
                + " left join fetch candidate.experiences"
                + " left join fetch candidate.contactDetails"
                + " left join fetch candidate.interviews"
                + " left join fetch candidate.skills"
                + " left join fetch candidate.vacancyCandidates where candidate.id=" + parameter).getSingleResult();
    }

    @Override
    public void insert(Candidate object) {
        sessionFactory.getCurrentSession().save(object);
    }

    @Override
    public void update(Candidate object) {
        sessionFactory.getCurrentSession().update(object);
    }

    @Override
    public void delete(Long parameter) {
        Candidate candidate = (Candidate) sessionFactory.getCurrentSession().load(Candidate.class, parameter);
        if (candidate != null) {
            sessionFactory.getCurrentSession().delete(candidate);
        }
    }
}
