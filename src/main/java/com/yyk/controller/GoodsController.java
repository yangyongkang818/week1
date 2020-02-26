package com.yyk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yyk.entity.Goods;
import com.yyk.service.GoodsService;
import com.yyk.vo.GoodsVO;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService service;
	
	@RequestMapping("list")
	public String list(Model m,Integer pageNum,GoodsVO vo){
		if(pageNum==null){
			pageNum=1;
		}
		
		PageHelper.startPage(pageNum, 3);
		
		List<Goods> list=service.list(vo);
		
		PageInfo<Goods> page=new PageInfo<Goods>(list);
		
		m.addAttribute("page", page);
		m.addAttribute("vo", vo);
		
		return "list";
	}

}
