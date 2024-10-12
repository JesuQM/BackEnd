package com.BackEnd.Backend.service.implementation;

import com.BackEnd.Backend.model.Equipo;
import com.BackEnd.Backend.repository.EquipoRepository;
import com.BackEnd.Backend.service.service.EquipoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoServiceImpl implements EquipoService {
    private final EquipoRepository equipoRepository;

    public EquipoServiceImpl(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    @Override
    public Iterable<Equipo> getAllEquiposById() {
        return this.equipoRepository.findAll();
    }
}
