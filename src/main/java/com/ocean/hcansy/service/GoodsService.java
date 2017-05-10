package com.ocean.hcansy.service;

import java.util.List;

import com.ocean.hcansy.entity.Goods;

public interface GoodsService {

	/**
     * 商品查询
     * @return List<Goods>
     */
    List<Goods> findAll();
    
    /**
     * 根据商品Id查询单个商品信息
     * @param id 商品ID
     * @return
     */
    Goods findOne(Long id);
    
    /**
     * 添加商品
     * @param goods
     * @return
     */
    int insert(Goods goods);
    
    /**
     * 修改商品信息
     * @param goods
     * @return
     */
    int update(Goods goods);
    
    /**
     * 下架商品(下架后不查询)
     * @param id
     * @param flag
     * @return
     */
    int updateFlag(Long id, Integer flag);
    
    /**
     * 删除商品
     * @param id
     * @return
     */
    int delete(Long id);
}
