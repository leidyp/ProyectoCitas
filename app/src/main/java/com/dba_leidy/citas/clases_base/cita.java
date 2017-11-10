package com.dba_leidy.citas.clases_base;

import java.util.Date;

/**
 * Created by DBA-Leidy on 9/11/2017.
 */

public class cita {
    private String cita_id;
    private String med_id;
    private String pac_id;
    private Date cita_fecha;
    private String cita_hora;
    private String cita_estado;

    public cita() {}

    public String getCita_id() {
        return cita_id;
    }

    public String getMed_id() {
        return med_id;
    }
    public String getPac_idd() {
        return pac_id;
    }
    public Date getCita_fecha() {
        return cita_fecha;
    }
    public String getCita_hora() {
        return cita_hora;
    }
    public String getCita_estado() {
        return cita_estado;
    }
}
