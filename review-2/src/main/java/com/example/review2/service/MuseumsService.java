package com.example.review2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.review2.model.MuseumsModel;
import com.example.review2.repository.MuseumsRepository;

@Service
public class MuseumsService {
@Autowired
public MuseumsRepository repobj;
   //post
   public MuseumsModel saveInfo(MuseumsModel obj1)
   {
	   return repobj.save(obj1);
   }
   //Get
   public List<MuseumsModel> getInfo()
   {
	   return repobj.findAll();
   }
   //put
   public MuseumsModel UpdateInfo(MuseumsModel in)
   {
	   return repobj.saveAndFlush(in);
   }
   //delete
   public void deleteById(int m_id)
   {
	   repobj.deleteById(m_id);
   }

}
