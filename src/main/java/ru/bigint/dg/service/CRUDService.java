package ru.bigint.dg.service;

public interface CRUDService<T> {
    T add(T object);
    T get(long id);
}
