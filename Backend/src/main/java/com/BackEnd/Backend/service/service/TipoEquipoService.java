package com.BackEnd.Backend.service.service;

import com.BackEnd.Backend.model.TipoEquipo;
import org.springframework.stereotype.Service;

@Service
public interface TipoEquipoService {

    Iterable <TipoEquipo> listarTipoEquipo();

}
