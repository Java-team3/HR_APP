package by.team34.dao;

import java.util.List;

public interface IGenericDao<T, M> {

    List<T> findAll();

    List<T> sort(String type);

    T findBy(M parameter);

    void insert(T object);

    void update(T object);

    void delete(M parameter);

}

