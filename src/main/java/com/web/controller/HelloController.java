package com.web.controller;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.dao.PriceDao;
import com.web.model.Price;


@Controller
public class HelloController {
	@Autowired PriceDao priceDao;
	
	@Autowired
	private DataSource ds;

	@RequestMapping("/")
	public String index(Model model){
		try{
			List<Price> priceList = priceDao.findAll();
			model.addAttribute("priceList", priceList);
			System.out.println("model :: "+model);
			
			if(priceList != null && priceList.size() > 0){
				for(Price price : priceList){
					System.out.println(price.toString());
				}
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return "hello";
	}
	
	@RequestMapping("/add")
	public String setPrice(Price price){
		price.setRegdate(new Date());
		Price priceData = priceDao.save(price);
		return "redirect:/";


	}
	
}
