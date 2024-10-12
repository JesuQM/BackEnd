package com.BackEnd.Backend.controller;

import com.BackEnd.Backend.model.Equipo;
import com.BackEnd.Backend.service.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipo")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"})
public class EquipoController {
    private EquipoService equipoService;
    @Autowired
    public EquipoController(EquipoService equipoService) {
        this.equipoService = equipoService;
    }
    @GetMapping("/listarEquipo")
    public Iterable<Equipo> getAllProducto(){

        return equipoService.getAllEquiposById();
    }

}
