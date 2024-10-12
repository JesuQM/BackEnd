package com.BackEnd.Backend.service.service;

import com.BackEnd.Backend.model.HistorialEquipo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface HistorialEquipoService {
    HistorialEquipo newHistorialEquipo(HistorialEquipo historialEquipo);
    Iterable<HistorialEquipo>getAllHistorialEquipo();
    HistorialEquipo modificarHistorialEquipo(HistorialEquipo historialEquipo);
    Boolean deleteHistorialEquipo(Integer id);
    Optional<HistorialEquipo> getId(Integer id);


}
