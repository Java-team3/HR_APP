package by.team34.service;

import java.util.List;

public interface IGenericService<T, M> {
    List<T> findAll();

    List<T> sort(String type);

    T findBy(M parameter);

    void insert(T object);

    void update(T object);

    void delete(M parameter);
}
