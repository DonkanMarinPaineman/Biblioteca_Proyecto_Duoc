package com.example.bibliotecaduoc.service;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros(){
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id){
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id){
        libroRepository.eliminar(id);
        return "Producto Eliminado";
    }

    //la accion la hace el service:
    public int totalLibrosV1(){
        return libroRepository.obtenerLibros().size();
    }
    //la accion la hace el modelo:
    public int totalLibrosV2(){
        return libroRepository.totalLibros();
    }

    public Libro getLibroAutor( String autor){
        return libroRepository.buscarPorAutor(autor);
    }
}
