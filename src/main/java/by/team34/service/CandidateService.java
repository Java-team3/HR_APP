package by.team34.service;

import by.team34.dao.IGenericDao;
import by.team34.entity.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CandidateService implements IGenericService<Candidate, Long> {
    @Autowired
    private IGenericDao<Candidate, Long> candidateDao;

    @Override
    public List<Candidate> findAll() {
        return candidateDao.findAll();
    }

    @Override
    public List<Candidate> sort(String type) {
        return candidateDao.sort(type);
    }

    @Override
    public Candidate findBy(Long parameter) {
        return candidateDao.findBy(parameter);
    }

    @Override
    public void insert(Candidate object) {
        candidateDao.insert(object);
    }

    @Override
    public void update(Candidate object) {
        candidateDao.update(object);
    }

    @Override
    public void delete(Long parameter) {
        candidateDao.delete(parameter);
    }
}
