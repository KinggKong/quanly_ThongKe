package org.example.service;

import java.util.List;

public interface IBaseService<T, U> {
    List<T> getAll();

    T getById(long id);

    void add(T t);

    void update(U id, T t);

    void delete(U id);
}
