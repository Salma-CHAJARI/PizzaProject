package com.example.projectpizza.Dao;

import java.util.List;

public interface IDao<S>{
    boolean create(S o);
    boolean update(S o);
    boolean delete(S o);
    List<S> findAll();
    S findById(int id);
}
