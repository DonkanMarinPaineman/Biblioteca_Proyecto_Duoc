package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros(){
        return libroService.getLibros();
    }

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro){
        return libroService.saveLibro(libro);
    }

    @GetMapping("{id}")
    public Libro buscarLibro(@PathVariable int id){
        return libroService.getLibroId(id);
    }

    @PutMapping("{id}")
    public Libro actualizarLibro (@PathVariable int id, @RequestBody Libro libro){
        return libroService.updateLibro(libro);
    }

    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }

    @GetMapping("/total")
    public int totalLibrosV2(){
        return libroService.totalLibrosV2();
    }

    @GetMapping("/autor/{autor}")
    public Libro getLibroAutor(@PathVariable String autor){
        return libroService.getLibroAutor(autor);
    }

    @GetMapping("/cantidad/{año}")
    public int getLibrosPorAño(@PathVariable int año){
        return libroService.getLibrosPorAño(año);
    }

    @GetMapping("/mas-viejo")
    public Libro getLibroMasViejo(){
        return libroService.getLibroMasViejo();
    }

    @GetMapping("/mas-nuevo")
    public Libro getLibroMasNuevo(){
        return libroService.getLibroMasNuevo();
    }

    @GetMapping("/libros-ordenados")
    public List<Libro> getLibrosOrdenados(){
        return libroService.getListaLibrosOrdenados();
    }
}


