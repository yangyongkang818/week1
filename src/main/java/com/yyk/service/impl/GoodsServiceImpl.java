package com.yyk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyk.dao.GoodsDao;
import com.yyk.entity.Goods;
import com.yyk.service.GoodsService;
import com.yyk.vo.GoodsVO;
@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsDao dao;

	@Override
	public List<Goods> list(GoodsVO vo) {
		// TODO Auto-generated method stub
		return dao.list(vo);
	}

}
