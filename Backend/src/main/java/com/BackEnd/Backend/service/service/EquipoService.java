package com.BackEnd.Backend.service.service;

import com.BackEnd.Backend.model.Equipo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EquipoService {
    Iterable<Equipo> getAllEquiposById();

}
