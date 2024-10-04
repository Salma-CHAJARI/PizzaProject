package com.example.projectpizza.service;

import com.example.projectpizza.Dao.IDao;
import com.example.projectpizza.bean.Produit;

import java.util.ArrayList;
import java.util.List;

public class PizzaService implements IDao<Produit> {
    private List<Produit> produits;

    public PizzaService() {
        produits=new ArrayList<Produit>();
    }

    @Override
    public boolean create(Produit o) {
        produits.add(o);
        return true;
    }

    @Override
    public boolean update(Produit o) {
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }

    @Override
    public Produit findById(int id) {
        for(Produit p:produits){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }
}
