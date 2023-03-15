package com.detrox.pokedex.Modelos;

public class MDetallePokemon {
    private Integer id_pokemon;
    private String edad;
    private String tipo;
    private Integer nivel;
    private Integer generacion;

    public MDetallePokemon(Integer id_pokemon, String edad, String tipo, Integer nivel, Integer generacion) {
        this.id_pokemon = id_pokemon;
        this.edad = edad;
        this.tipo = tipo;
        this.nivel = nivel;
        this.generacion = generacion;
    }

    public Integer getId_pokemon() {
        return id_pokemon;
    }

    public void setId_pokemon(Integer id_pokemon) {
        this.id_pokemon = id_pokemon;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getGeneracion() {
        return generacion;
    }

    public void setGeneracion(Integer generacion) {
        this.generacion = generacion;
    }
}
