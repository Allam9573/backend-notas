package com.notas.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notas.backend.models.Nota;

public interface NotaRepository extends JpaRepository<Nota, Integer> {

}
