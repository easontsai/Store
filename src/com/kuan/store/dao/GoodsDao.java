package com.kuan.store.dao;

import com.kuan.store.domain.Goods;

import java.util.List;

public interface GoodsDao {

    Goods findByPk(long pk);

    List<Goods> findAll();

    void create(Goods goods);

    void modify(Goods goods);

    void remove(String pk);
}
