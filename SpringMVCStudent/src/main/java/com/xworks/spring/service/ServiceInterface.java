package com.xworks.spring.service;

import com.xworks.spring.dto.StudentDto;

import java.util.List;

public interface ServiceInterface {
    void addData(StudentDto dto);

    List<StudentDto> fetchData();

    StudentDto findDataById(Integer id);

    void updateDta(StudentDto dto);

    boolean deleteDataService(Integer id);
}
