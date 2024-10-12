package com.BackEnd.Backend.service.implementation;

import com.BackEnd.Backend.model.HistorialEquipo;
import com.BackEnd.Backend.repository.HistorialEquipoRepository;
import com.BackEnd.Backend.service.service.HistorialEquipoService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HistorialEquipoServiceImpl implements HistorialEquipoService {
    private  final HistorialEquipoRepository historialEquipoRepository;

    public HistorialEquipoServiceImpl(HistorialEquipoRepository historialEquipoRepository) {
        this.historialEquipoRepository = historialEquipoRepository;
    }

    @Override
    public HistorialEquipo newHistorialEquipo(HistorialEquipo historialEquipo) {
        return this.historialEquipoRepository.save(historialEquipo);
    }

    @Override
    public Iterable<HistorialEquipo> getAllHistorialEquipo() {
        return this.historialEquipoRepository.findAll();
    }

    @Override
    public HistorialEquipo modificarHistorialEquipo(HistorialEquipo historialEquipo) {
        Optional<HistorialEquipo> historialEquipoEncontrado=this.historialEquipoRepository.findById(historialEquipo.getId());
        if(historialEquipoEncontrado!=null) {
            historialEquipoEncontrado.get().setId(historialEquipo.getId());
            historialEquipoEncontrado.get().setFechaRegistro(historialEquipo.getFechaRegistro());
            historialEquipoEncontrado.get().setTipoEquipo(historialEquipo.getTipoEquipo());
            historialEquipoEncontrado.get().setValorMedido(historialEquipo.getValorMedido());
            historialEquipoEncontrado.get().setDescripcion(historialEquipo.getDescripcion());
            return this.newHistorialEquipo(historialEquipoEncontrado.get());
        }
        return null;
    }

    @Override
    public Boolean deleteHistorialEquipo(Integer id) {
        this.historialEquipoRepository.deleteById(id);
        return true;
    }

    @Override
    public Optional<HistorialEquipo> getId(Integer id) {
        return Optional.empty();
    }
}
