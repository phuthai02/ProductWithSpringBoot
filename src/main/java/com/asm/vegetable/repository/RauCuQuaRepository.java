package com.asm.vegetable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asm.vegetable.entity.RauCuQua;

@Repository
public interface RauCuQuaRepository extends JpaRepository<RauCuQua, Long>{

}
