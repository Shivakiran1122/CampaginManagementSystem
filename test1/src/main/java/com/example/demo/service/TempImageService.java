package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.TempImages;
import com.example.demo.repository.TempImageRepository;

@Service
public class TempImageService {
	
	@Autowired
	TempImageRepository tempimagerepo;
	public Optional<TempImages> gettempimage(Integer id) {
		   
		
		return tempimagerepo.findById(id);
	}
	
	public TempImages savetempimage(TempImages img)
	{
		return tempimagerepo.save(img);
	}

	public TempImages tempfind(TempImages img) {
		
		return tempimagerepo.save(img);
	}
}
