package by.team34.service;

import by.team34.dao.IGenericDao;
import by.team34.entity.Interview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class InterviewService implements IGenericService<Interview, Long> {

    @Autowired
    private IGenericDao<Interview,Long> interviewDao;

    @Transactional
    @Override
    public List<Interview> findAll() {
        return interviewDao.findAll();
    }

    @Transactional
    @Override
    public List<Interview> sort(String type) {
        return interviewDao.sort(type);
    }

    @Transactional
    @Override
    public Interview findBy(Long parameter) {
        return interviewDao.findBy(parameter);
    }

    @Transactional
    @Override
    public void insert(Interview object) {
        interviewDao.insert(object);
    }

    @Transactional
    @Override
    public void update(Interview object) {
        interviewDao.update(object);
    }

    @Transactional
    @Override
    public void delete(Long parameter) {
        interviewDao.delete(parameter);
    }
}
