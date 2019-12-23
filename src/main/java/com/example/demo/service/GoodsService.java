package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Goods;
import com.example.demo.mapper.GoodsMapper;

@Service
public class GoodsService {
	@Autowired//自动注入
	GoodsMapper goodsMapper;
	
	
		
		public List<Goods> getAllGoodsname() {
			
			return goodsMapper.goodsname();

}
		public List<Goods> getAllGoodstype() {
			
			return goodsMapper.goodstype();

}
		public List<Goods> getAllGoodsprice() {
			
			return goodsMapper.goodsprice();

}


	
}
 