package com.BackEnd.Backend.controller;

import com.BackEnd.Backend.model.HistorialEquipo;
import com.BackEnd.Backend.service.service.HistorialEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/historial")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"})
public class HistorialEquipoController {
    private HistorialEquipoService historialEquipoService;

    @Autowired
    public HistorialEquipoController(HistorialEquipoService historialEquipoService) {
        this.historialEquipoService=historialEquipoService;
    }
    @PostMapping("/nuevoHistorial")
    public HistorialEquipo newHistorial(@RequestBody HistorialEquipo historialEquipo) {
        return this.historialEquipoService.newHistorialEquipo(historialEquipo);
    }
    @GetMapping("/listarHistorial")
    public Iterable<HistorialEquipo> listarHistorial() {
        return historialEquipoService.getAllHistorialEquipo();
    }

    @PostMapping("/modificarHistorial")
    public HistorialEquipo modificarHistorial(@RequestBody HistorialEquipo historialEquipo) {
        return this.historialEquipoService.modificarHistorialEquipo(historialEquipo);
    }
    @PostMapping(value = "/{id}")
    public Boolean elimninarHistorial(@PathVariable(value = "id")Integer id) {
        return this.historialEquipoService.deleteHistorialEquipo(id);
    }

}

