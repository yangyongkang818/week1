package com.yyk.service;

import java.util.List;

import com.yyk.entity.Goods;
import com.yyk.vo.GoodsVO;

public interface GoodsService {

	List<Goods> list(GoodsVO vo);

}
