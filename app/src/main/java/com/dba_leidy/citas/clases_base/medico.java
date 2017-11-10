package com.dba_leidy.citas.clases_base;

import java.util.Date;

/**
 * Created by DBA-Leidy on 9/11/2017.
 */

public class medico {
    private String med_id;
    private int med_cedula;
    private String med_nombre;
    private String med_apellido;
    private int med_telefono;
    private Date med_fecha_n;
    private String med_ocupacion;

    public String getMed_id() {
        return med_id;
    }

    public int getMed_cedula() {
        return med_cedula;
    }

    public String getMed_nombre() {
        return med_nombre;
    }

    public String getMed_apellido() {
        return med_apellido;
    }
    public int getMed_telefono() {
        return med_telefono;
    }
    public Date getPac_id() {
        return med_fecha_n;
    }

    public String getMed_ocupacion() {
        return med_ocupacion;
    }

}
