package com.dba_leidy.citas.clases_base;

import java.util.Date;

/**
 * Created by DBA-Leidy on 9/11/2017.
 */

public class paciente {
    private String pac_id;
    private int pac_cedula;
    private String pac_nombre;
    private String pac_apellido;
    private int pac_telefono;
    private Date pac_fecha_n;

    public String getPac_id() {
        return pac_id;
    }
    public int getPac_cedula() {
        return pac_cedula;
    }
    public String getPac_nombre() {
        return pac_nombre;
    }
    public String getPac_apellido() {
        return pac_apellido;
    }
    public int getPac_telefono() {
        return pac_telefono;
    }
    public Date getPac_fecha_n() {
        return pac_fecha_n;
    }
}
