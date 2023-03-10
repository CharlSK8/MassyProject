package com.massy.project.repository;

import com.massy.project.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Empleado, Integer> {
}
