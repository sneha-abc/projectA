package com.xworks.spring.service;

import com.xworks.spring.dto.StudentDto;
import com.xworks.spring.entity.StudentEntity;
import com.xworks.spring.repository.RepositoryInterface;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
public class ServiceImpl implements ServiceInterface{
    @Autowired
    RepositoryInterface repositoryInterface;

    @Override
    public void addData(StudentDto dto) {
        System.out.println(dto);
        StudentEntity entity=new StudentEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        repositoryInterface.saveData(entity);
    }

    @Override
    public List<StudentDto> fetchData() {
        List studentDtos=new ArrayList();
        System.out.println("this will fetch the data from repository");
        List<StudentEntity> result = repositoryInterface.fetchData();
        result.stream().forEach(entity->{
            StudentDto studentDto=new StudentDto();
            BeanUtils.copyProperties(entity,studentDto);
            studentDtos.add(studentDto);

        });
        System.out.println(studentDtos);
        return studentDtos;
    }

    @Override
    public StudentDto findDataById(Integer id) {
        System.out.println(id);
        StudentEntity entity = repositoryInterface.findDataById(id);
        StudentDto dto = new StudentDto();
        BeanUtils.copyProperties(entity,dto);
        System.out.println(dto);
        return dto;
    }

    @Override
    public void updateDta(StudentDto dto) {
            System.out.println(dto);
            StudentEntity entity = new StudentEntity();
            BeanUtils.copyProperties(dto, entity);
            System.out.println(entity);
            repositoryInterface.updateData(entity);
        }

    @Override
    public boolean deleteDataService(Integer id) {
        System.out.println(id);
        StudentDto entity = findDataById(id);
        if (entity != null) {
            boolean isdeleted = repositoryInterface.deleteDataRepo(id);
            if (isdeleted) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

