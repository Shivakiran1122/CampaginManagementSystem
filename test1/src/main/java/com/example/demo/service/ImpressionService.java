package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Impressions;
import com.example.demo.repository.ImpressionRepository;
@Service
public class ImpressionService {
	
	@Autowired
	ImpressionRepository impressionrepo;
	
	public Impressions updateCount(Impressions img)
	{
		return impressionrepo.save(img);
	}
	

}
