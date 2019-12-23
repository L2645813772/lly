package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;

@RestController
@RequestMapping("/goods")//映射路径
public class GoodsController {
	@Autowired
    private GoodsService goodsService;
	
	@RequestMapping(value = "/infogoodsname",method = RequestMethod.POST)
	
	public List<Goods> getAllGoodsname(){
		return goodsService.getAllGoodsname();


	}
	@RequestMapping(value = "/infotype",method = RequestMethod.POST)
	public List<Goods> getAllGoodstype(){
		return goodsService.getAllGoodstype();


	}
	@RequestMapping(value = "/infoprice",method = RequestMethod.POST)
	public List<Goods> getAllGoodsprice(){
		return goodsService.getAllGoodsprice();


	}
}
