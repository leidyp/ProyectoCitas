package com.dba_leidy.citas.clases_base;

import java.util.Date;

/**
 * Created by DBA-Leidy on 9/11/2017.
 */

public class medico {
    private int med_id;
    private String med_cedula;
    private String med_nombre;
    private String med_apellido;
    private String med_telefono;
    private String med_fecha_n;
    private String med_ocupacion;

    public medico(String med_cedula, String med_nombre, String med_apellido, String med_telefono, String med_fecha_n, String med_ocupacion) {

        this.med_cedula = med_cedula;
        this.med_nombre = med_nombre;
        this.med_apellido = med_apellido;
        this.med_telefono = med_telefono;
        this.med_fecha_n = med_fecha_n;
        this.med_ocupacion = med_ocupacion;
    }

    public int getMed_id() {
        return med_id;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public String getMed_cedula() {
        return med_cedula;
    }

    public void setMed_cedula(String med_cedula) {
        this.med_cedula = med_cedula;
    }

    public String getMed_nombre() {
        return med_nombre;
    }

    public void setMed_nombre(String med_nombre) {
        this.med_nombre = med_nombre;
    }

    public String getMed_apellido() {
        return med_apellido;
    }

    public void setMed_apellido(String med_apellido) {
        this.med_apellido = med_apellido;
    }

    public String getMed_telefono() {
        return med_telefono;
    }

    public void setMed_telefono(String med_telefono) {
        this.med_telefono = med_telefono;
    }

    public String getMed_fecha_n() {
        return med_fecha_n;
    }

    public void setMed_fecha_n(String med_fecha_n) {
        this.med_fecha_n = med_fecha_n;
    }

    public String getMed_ocupacion() {
        return med_ocupacion;
    }

    public void setMed_ocupacion(String med_ocupacion) {
        this.med_ocupacion = med_ocupacion;
    }
}
