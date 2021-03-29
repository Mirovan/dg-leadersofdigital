package ru.bigint.dg.service;

import java.util.List;

public interface CRUDService<T> {
    T add(T object);
    T get(long id);
    List<T> list();
}
