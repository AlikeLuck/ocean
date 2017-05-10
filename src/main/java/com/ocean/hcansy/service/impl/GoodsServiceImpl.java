package com.ocean.hcansy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ocean.hcansy.dao.GoodsMapper;
import com.ocean.hcansy.entity.Goods;
import com.ocean.hcansy.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public List<Goods> findAll() {
		return goodsMapper.findAll();
	}

	@Override
	public Goods findOne(Long id) {
		return goodsMapper.findOne(id);
	}

	@Override
	public int insert(Goods goods) {
		return goodsMapper.insert(goods);
	}

	@Override
	public int update(Goods goods) {
		return goodsMapper.update(goods);
	}

	@Override
	public int updateFlag(Long id, Integer flag) {
		return goodsMapper.updateFlag(id, flag);
	}

	@Override
	public int delete(Long id) {
		return goodsMapper.delete(id);
	}

}
