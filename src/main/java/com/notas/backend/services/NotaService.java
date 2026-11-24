package com.notas.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.notas.backend.models.Nota;
import com.notas.backend.repository.NotaRepository;

@Service
public class NotaService {

    private final NotaRepository notaRepository;

    public NotaService(NotaRepository notaRepository) {
        this.notaRepository = notaRepository;
    }

    public Nota crearNota(Nota nota) {
        return this.notaRepository.save(nota);
    }

    public List<Nota> listarNotas() {
        return this.notaRepository.findAll();
    }

    public Nota editarNota(int notaId, Nota nota) {
        Optional<Nota> o = this.notaRepository.findById(notaId);

        if (o.isPresent()) {
            Nota notaDB = o.get();
            notaDB.setTitulo(nota.getTitulo());
            notaDB.setDescripcion(nota.getDescripcion());
            notaDB.setCategoria(nota.getCategoria());
            return this.notaRepository.save(notaDB);
        } else {
            return null;
        }
    }

    public Nota eliminarNota(int notaId) {
        Optional<Nota> o = this.notaRepository.findById(notaId);
        if (o.isPresent()) {
            Nota notaDelete = o.get();
            this.notaRepository.deleteById(notaDelete.getNotaId());
        }
        return null;
    }
}
