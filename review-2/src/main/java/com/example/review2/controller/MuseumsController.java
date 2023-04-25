package com.example.review2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.review2.model.MuseumsModel;
import com.example.review2.service.MuseumsService;

@RestController
public class MuseumsController {
@Autowired
 public MuseumsService serobj;
    
@PostMapping("/postmap")
public MuseumsModel addDetails(@RequestBody MuseumsModel obj2)
{
	return serobj.saveInfo(obj2);
}

@GetMapping("/getmap")
public List<MuseumsModel> getDetails()
{
	return serobj.getInfo();
}

@PutMapping("/putmap")
public MuseumsModel display(@RequestBody MuseumsModel obj3)
{
	return serobj.UpdateInfo(obj3);
}
@DeleteMapping("/delete/{m_id}")
public String delete(@PathVariable("m_id") int m_id)
{
	serobj.deleteById(m_id);
	return "deleted";
}
}
