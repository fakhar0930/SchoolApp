package com.SchoolApp.Service;


import com.SchoolApp.Entity.School;
import com.SchoolApp.Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository repository;

    public School addSchool(School school){
        return repository.save(school);
    }

    public List<School> getSchools(){
        return repository.findAll();
    }

    public School getSchool(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteSchool(int id){
        repository.deleteById(id);
        return "School No.:"+ id + " Deleted Successfully";
    }




}
