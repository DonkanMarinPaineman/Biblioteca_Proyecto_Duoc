package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //genera geters seters tostring equals hashcode y sus constructores
@AllArgsConstructor // genera constructor con todos los campos
@NoArgsConstructor // genera constructor vacio

public class Libro {

    private int id;
    private String isbn ;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;




}
