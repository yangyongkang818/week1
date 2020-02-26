package com.yyk.dao;

import java.util.List;

import com.yyk.entity.Goods;
import com.yyk.entity.Goods_brand;
import com.yyk.entity.Goods_type;
import com.yyk.vo.GoodsVO;

public interface GoodsDao {

	List<Goods> list(GoodsVO vo);
	List<Goods_type> findByTid(Integer tid);
	List<Goods_brand> findByBid(Integer bid);
}
