package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TempImages;

public interface TempImageRepository extends JpaRepository<TempImages,Integer> {

}
