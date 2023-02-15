package com.example.demo.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.FinalData;
//import com.example.demo.dto.FinalData;
//import com.example.demo.entity.Data;
import com.example.demo.entity.Images;


@Repository
public interface ImageRepository extends JpaRepository<Images,Integer> {
	
	@Query(nativeQuery =true)
	public List<FinalData> getInfo();
	
}




