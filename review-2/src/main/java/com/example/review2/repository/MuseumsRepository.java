package com.example.review2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.review2.model.MuseumsModel;

public interface MuseumsRepository extends JpaRepository<MuseumsModel, Integer> {

}
