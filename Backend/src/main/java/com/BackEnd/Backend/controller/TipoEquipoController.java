package com.BackEnd.Backend.controller;

import com.BackEnd.Backend.model.TipoEquipo;
import com.BackEnd.Backend.service.service.TipoEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipoEquipo")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"})
public class TipoEquipoController {
    private TipoEquipoService tipoEquipoService;
    @Autowired
    public TipoEquipoController(TipoEquipoService tipoEquipoService) {
        this.tipoEquipoService = tipoEquipoService;
    }
    @GetMapping("/listEquipo")
    public Iterable<TipoEquipo> getTipoEquipos() {
        return this.tipoEquipoService.listarTipoEquipo();
    }
}
