package com.SchoolApp.Controller;

import com.SchoolApp.Entity.School;
import com.SchoolApp.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {


    @Autowired
    private SchoolService service;


    @PostMapping
    public School addSchool(@RequestBody School school){
        return service.addSchool(school);
    }

    @GetMapping
    public List<School> getSchools(){
        return service.getSchools();
    }

    @GetMapping("/{id}")
    public School getSchool(@PathVariable int id){
        return service.getSchool(id);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteSchool(@PathVariable int id){
        return service.deleteSchool(id);
    }





}
