package com.notas.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notas.backend.models.Nota;
import com.notas.backend.services.NotaService;

@RestController
@RequestMapping("/api/notas")
public class NotaController {

    private final NotaService notaService;

    public NotaController(NotaService notaService) {
        this.notaService = notaService;
    }

    @GetMapping("/all")
    public List<Nota> listarNotas() {
        return this.notaService.listarNotas();
    }

}
