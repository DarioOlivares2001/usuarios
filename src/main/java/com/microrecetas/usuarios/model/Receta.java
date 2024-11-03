package com.microrecetas.usuarios.model;


import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "RECETAS") // Cambiado de RECETA a RECETAS para evitar palabras reservadas en Oracle
public class Receta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "tipo_cocina")
    private String tipoCocina;

    @Column(name = "pais_origen")
    private String paisOrigen;

    @Column(name = "dificultad")
    private String dificultad;

    @Column(name = "instrucciones", columnDefinition = "TEXT")
    private String instrucciones;

    @Column(name = "tiempo_coccion")
    private int tiempoCoccion;

    @ElementCollection
    @Column(name = "ingredientes")
    private List<String> ingredientes;

    @Lob // Para almacenar imágenes o descripciones grandes
    @Column(name = "fotografia")
    private String fotografia;

    // Constructor vacío
    public Receta() {}

    // Constructor con parámetros
    public Receta(String nombre, String tipoCocina, String paisOrigen, String dificultad,
                  String instrucciones, int tiempoCoccion, List<String> ingredientes, String fotografia) {
        this.nombre = nombre;
        this.tipoCocina = tipoCocina;
        this.paisOrigen = paisOrigen;
        this.dificultad = dificultad;
        this.instrucciones = instrucciones;
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = ingredientes;
        this.fotografia = fotografia;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }
}