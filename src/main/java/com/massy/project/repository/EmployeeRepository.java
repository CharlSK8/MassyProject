package com.massy.project.repository;

import com.massy.project.Activo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Activo, String> {
}
