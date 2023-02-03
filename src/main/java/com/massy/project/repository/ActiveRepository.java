package com.massy.project.repository;

import com.massy.project.Activo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiveRepository extends JpaRepository<Activo, String> {
}
