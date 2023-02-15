package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Impressions;

@Repository
public interface ImpressionRepository extends JpaRepository<Impressions, Integer> {

}
