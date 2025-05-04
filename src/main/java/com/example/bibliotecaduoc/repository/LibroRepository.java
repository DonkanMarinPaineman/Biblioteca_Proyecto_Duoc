package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {
    public LibroRepository() {
    listaLibros.add(new Libro(1, "9780000000001", "Introducción a Java", "Educación Global", 2020, "Laura González"));
    listaLibros.add(new Libro(2, "9780000000002", "Spring Boot en Acción", "TechPress", 2021, "Miguel Ramírez"));
    listaLibros.add(new Libro(3, "9780000000003", "Hibernate para Principiantes", "CodeHouse", 2019, "Andrea Soto"));
    listaLibros.add(new Libro(4, "9780000000004", "Microservicios con Spring Cloud", "CloudTech", 2022, "Javier Morales"));
    listaLibros.add(new Libro(5, "9780000000005", "REST APIs con Spring Boot", "API Editores", 2023, "Patricia Fernández"));
    listaLibros.add(new Libro(6, "9780000000006", "Java y Bases de Datos", "BD Books", 2018, "José Herrera"));
    listaLibros.add(new Libro(7, "9780000000007", "Fundamentos de Programación", "Academia TI", 2017, "Camila Núñez"));
    listaLibros.add(new Libro(8, "9780000000008", "Testing en Java", "QA Publishing", 2021, "Ricardo Paredes"));
    listaLibros.add(new Libro(9, "9780000000009", "Arquitectura de Software", "SoftBuild", 2020, "Verónica Díaz"));
    listaLibros.add(new Libro(10, "9780000000010", "Desarrollo Web Full Stack", "WebMasters", 2023, "Tomás Salinas"));
    }

    //arreglo que guardara todos los libros
    private List<Libro> listaLibros = new ArrayList<>();

    

    //metodo que retorna todos los libros
    public List<Libro> obtenerLibros(){
        return listaLibros;
    }

    //buscar libro por su id
    public Libro buscarPorId(int id){
        for (Libro libro : listaLibros){
            if (libro.getId() == id){
                return libro;
            }
        }
        return null;
    }

    //buscar libro por su isbn
    public Libro buscarPorIsbn (String isbn){
        for (Libro libro : listaLibros){
            if (libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }

    //guardar un libro
    public Libro guardar(Libro lib){
        listaLibros.add(lib);
        return lib;
    }
 
    //actualizar un libro por id
    public Libro actualizar(Libro lib){
        int id = 0;
        int idPosicion = 0;

        for(int i = 0; i < listaLibros.size(); i++){
            if (listaLibros.get(i).getId()==lib.getId()){
                id = lib.getId();
                idPosicion = i;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        listaLibros.set(idPosicion, libro1);
        return libro1;
    }
    

    //eliminar un libro
    public void eliminar(int id){
        Libro libro = buscarPorId(id);
        if (libro != null){
            listaLibros.remove(libro);
        }
    }

    public int totalLibros(){
        return listaLibros.size();
    }





}
