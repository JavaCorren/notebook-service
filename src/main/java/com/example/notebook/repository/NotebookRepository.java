package com.example.notebook.repository;

import com.example.notebook.entity.Notebook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface NotebookRepository extends CrudRepository<Notebook, Long> {
    
    List<Notebook> findByName(String name);
    
}
