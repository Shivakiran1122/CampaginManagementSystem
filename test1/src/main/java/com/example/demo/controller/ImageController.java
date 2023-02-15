package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.ImageRepository;
//import com.example.demo.repository.ImpressionRepository;
import com.example.demo.service.ImageService;
import com.example.demo.service.ImpressionService;
//import com.example.demo.service.ImpressionService;
import com.example.demo.service.TempImageService;

import java.sql.*;
import java.util.*;

import com.example.demo.dto.FinalData;
//import com.example.demo.entity.Data;
import com.example.demo.entity.Images;
import com.example.demo.entity.Impressions;
import com.example.demo.entity.TempImages;
//import com.example.demo.entity.Impressions;

@CrossOrigin()
@RestController
@RequestMapping("image")
public class ImageController {
	
	@Autowired
	ImageService imageService;
	@Autowired
	ImpressionService impressionservice;
	@Autowired
	TempImageService tempimageService;
	
	
	@GetMapping("/{id}")
	public Optional<Images> fromDatabaseAsResEntity(@PathVariable Integer id) {
   
			
		return imageService.getimage(id);
	}
	
	@PostMapping(path="/data")
	public Images saveimage( @RequestBody Images img)
	{
		return imageService.saveimag(img);
	}
   
	
	@PostMapping(path="/datacount")
	public Impressions updatedCount(@RequestBody Impressions img)
	{
		return impressionservice.updateCount(img);
	}
	
	
	
	@GetMapping("temp/{id}")
	public Optional<TempImages> temptable(@PathVariable Integer id) {
   
			
		return tempimageService.gettempimage(id);
	}
	
	@PostMapping(path="/tempdata")
	public TempImages tempimage( @RequestBody TempImages img)
	{
		return tempimageService.savetempimage(img);
	}
	

	@PutMapping("/puttemp")
	public TempImages tempfindby(@RequestBody TempImages img) {
   
			
		System.out.print(img);
		return tempimageService.tempfind(img);
	}
	
	@GetMapping("/finaldata")
	public List<FinalData> getInfo()
	{
		return imageService.getInfo();
	}

	

	
}
