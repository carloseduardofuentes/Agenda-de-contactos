package com.company.models;

/**
 * Created by Treming20 on 04/11/2017.
 */
public class Telefono {
    protected String tipo;
    protected String telefono;

    public Telefono(String tipo, String telefono) {
        this.tipo = tipo;
        this.telefono = telefono;
    }

    public Telefono() {
        this.tipo = "";
        this.telefono = "";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toUpperCase();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "tipo='" + tipo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
