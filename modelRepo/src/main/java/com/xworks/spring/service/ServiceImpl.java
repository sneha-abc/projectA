package com.xworks.spring.service;

import com.xworks.spring.dto.StudentDTO;
import com.xworks.spring.enitiy.StudentEntity;
import com.xworks.spring.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceInterface {

    @Autowired
    RepositoryInterface repositoryInterface;

    @Override
    public StudentDTO saveData(StudentDTO dto) {
        System.out.println("It is Service Implementation class");
        System.out.println("dto in service======="+dto);
        System.out.println("converting dto to entity");
        StudentEntity studentEntity=new StudentEntity();
        studentEntity.setStudentName(dto.getStudentName());
        studentEntity.setParentName(dto.getParentName());
        studentEntity.setAge(dto.getAge());
        studentEntity.setPhoneNumber(dto.getContactNumber());
        studentEntity.setBirthDate(dto.getDateOfBirth());
        studentEntity.setEmail(dto.getEmail());
        studentEntity.setAddress(dto.getAddress());
        System.out.println("entity in service========"+studentEntity);
        System.out.println("calling repository");
        repositoryInterface.save(studentEntity);
        return null;
    }
}
