package by.team34.service;

import by.team34.dao.IGenericDao;
import by.team34.entity.Vacancy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class VacancyService implements IGenericService<Vacancy, Integer> {

    @Autowired
    private IGenericDao<Vacancy, Integer> dao;

    @Transactional
    @Override
    public List<Vacancy> findAll() {
        return dao.findAll();
    }

    @Transactional
    @Override
    public List<Vacancy> sort(String type) {
        return dao.sort(type);
    }

    @Transactional
    @Override
    public Vacancy findBy(Integer parameter) {
        return dao.findBy(parameter);
    }

    @Transactional
    @Override
    public void insert(Vacancy object) {
        dao.insert(object);
    }

    @Transactional
    @Override
    public void update(Vacancy object) {
        dao.update(object);
    }

    @Transactional
    @Override
    public void delete(Integer parameter) {
        dao.delete(parameter);
    }
}
