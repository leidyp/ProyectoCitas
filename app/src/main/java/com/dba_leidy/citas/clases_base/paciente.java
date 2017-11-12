package com.dba_leidy.citas.clases_base;

import android.renderscript.Script;

import java.util.Date;

/**
 * Created by DBA-Leidy on 9/11/2017.
 */

public class paciente {
    private int pac_id;
    private String pac_cedula;
    private String pac_nombre;
    private String pac_apellido;
    private String pac_telefono;
    private String pac_fecha_n;


    public paciente(){}

    public paciente(String pac_cedula, String pac_nombre, String pac_apellido, String pac_telefono, String pac_fecha_n) {
        this.pac_cedula = pac_cedula;
        this.pac_nombre = pac_nombre;
        this.pac_apellido = pac_apellido;
        this.pac_telefono = pac_telefono;
        this.pac_fecha_n = pac_fecha_n;
    }

    public int getPac_id() {
        return pac_id;
    }

    public void setPac_id(int pac_id) {
        this.pac_id = pac_id;
    }

    public String getPac_cedula() {
        return pac_cedula;
    }

    public void setPac_cedula(String pac_cedula) {
        this.pac_cedula = pac_cedula;
    }

    public String getPac_nombre() {
        return pac_nombre;
    }

    public void setPac_nombre(String pac_nombre) {
        this.pac_nombre = pac_nombre;
    }

    public String getPac_apellido() {
        return pac_apellido;
    }

    public void setPac_apellido(String pac_apellido) {
        this.pac_apellido = pac_apellido;
    }

    public String getPac_telefono() {
        return pac_telefono;
    }

    public void setPac_telefono(String pac_telefono) {
        this.pac_telefono = pac_telefono;
    }

    public String getPac_fecha_n() {
        return pac_fecha_n;
    }

    public void setPac_fecha_n(String pac_fecha_n) {
        this.pac_fecha_n = pac_fecha_n;
    }
}
