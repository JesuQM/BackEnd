package com.BackEnd.Backend.service.implementation;

import com.BackEnd.Backend.model.TipoEquipo;
import com.BackEnd.Backend.repository.TipoEquipoRepository;
import com.BackEnd.Backend.service.service.TipoEquipoService;
import org.springframework.stereotype.Service;

@Service
public class TipoEquipoServiceImpl implements TipoEquipoService {
    private final TipoEquipoRepository tipoEquipoRepository;

    public TipoEquipoServiceImpl(TipoEquipoRepository tipoEquipoRepository) {
        this.tipoEquipoRepository = tipoEquipoRepository;
    }

    @Override
    public Iterable<TipoEquipo> listarTipoEquipo() {
        return tipoEquipoRepository.findAll();
    }
}
