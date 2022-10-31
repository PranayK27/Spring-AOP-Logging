package com.pranay.springbootaoplogging.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pranay.springbootaoplogging.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository < Employee, Long > {

}
