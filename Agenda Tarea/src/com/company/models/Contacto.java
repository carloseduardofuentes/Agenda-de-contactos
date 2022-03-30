package com.company.models;
import com.company.models.*;

import java.util.List;

/**
 * Created by Treming20 on 04/11/2017.
 */
public class Contacto {

    protected int id;
    protected String nombre;
    protected String Apellido;
    protected String Direccion;
    protected List<Telefono> listTelefono;
    protected Telefono telefono;
    protected Categoria categoria;

    public Contacto(String nombre, String apellido, String direccion, String tipo, Telefono telefono1) {
        this.nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        telefono=telefono1;

    }

    public Contacto() {
        this.nombre = "";
        Apellido = "";
        Direccion = "";
        telefono=new Telefono();

    }

    @Override
    public java.lang.String toString() {
        String telefonos="";
        for (Telefono telefonoTep : listTelefono) {
            telefonos= telefonos + telefonoTep.toString();
        }

        return "Contacto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", telefonos=" + telefonos +
                ", categoria=" + categoria +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido.toUpperCase();
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion.toUpperCase();
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Telefono> getListTelefono() {
        return listTelefono;
    }

    public void setListTelefono(List<Telefono> listTelefono) {
        this.listTelefono = listTelefono;
    }
}
