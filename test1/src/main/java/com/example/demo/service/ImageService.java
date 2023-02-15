package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.FinalData;
//import com.example.demo.entity.Data;
import com.example.demo.entity.Images;
//import com.example.demo.entity.TempImages;
//import com.example.demo.entity.Impressions;
import com.example.demo.repository.ImageRepository;
//import com.example.demo.repository.TempImageRepository;
//import com.example.demo.repository.ImpressionRepository;
//import java.util.HashMap;
@Service
public class ImageService {
	
	@Autowired
	ImageRepository imagerepo;
	
	
	public Optional<Images> getimage(Integer id){
		
		return imagerepo.findById(id);
		
	}
	public Images saveimag(Images img)
	{
	
		return imagerepo.save(img);
	}
	
	public List<FinalData> getInfo()
	{
		return imagerepo.getInfo();
	}

	

	
}
