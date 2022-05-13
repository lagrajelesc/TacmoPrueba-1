package com.tacmo.tacmoprueba.repository;

import com.tacmo.tacmoprueba.model.Carga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CargaRepository extends JpaRepository<Carga, Integer> {

    @Query(value = "select id, estado from Carga where id = :id", nativeQuery = true)
    Carga despuesCrear(@Param("id") int id);

    @Query(value = "SELECT* FROm carga  WHERE fecha >= :fecha1 and fecha <= :fecha2", nativeQuery = true)
    List<Carga> buscarPorFechas(@Param("fecha1") String fecha1, @Param("fecha2") String fecha2);

    @Query(value = "select * from Carga where id = :id", nativeQuery = true)
    Carga buscarCarga(@Param("id") int id);
}
