package com.sidneigoes.project.services;

import com.sidneigoes.project.entities.Category;
import com.sidneigoes.project.entities.User;
import com.sidneigoes.project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

    public Category insert(Category obj){
        return repository.save(obj);
    }

}
