package com.xworks.spring.repository;

import com.xworks.spring.enitiy.StudentEntity;
import org.springframework.stereotype.Repository;


public interface RepositoryInterface {
    StudentEntity save(StudentEntity entity);
}
