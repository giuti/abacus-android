package com.svs.sportscalculator.primera;

/**
 * Created by sergio on 09/12/2014.
 */
public class Partido {
    private int id;
    Equipo local;
    Equipo visitante;
    private String localS;
    private String visitanteS;
    private int golesLocal;
    private int golesVisitante;
    private String fechaS;
    private int numJornada;
    private int idLlocal;
    private int idVisitante;
    private int idImagenL;
    private int idImagenV;
    private int dgL;
    private int dgV;

    public Partido(int id, Equipo local, Equipo visitante, int idLlocal, int idVisitante,
                   String localS, String visitanteS, int golesLocal, int golesVisitante,
                   String fechaS, int numJornada, int idImagenL, int idImagenV) {
        this.id = id;
        this.local = local;
        this.visitante = visitante;
        this.idLlocal = idLlocal;
        this.idVisitante = idVisitante;
        this.localS = localS;
        this.visitanteS = visitanteS;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.fechaS = fechaS;
        this.numJornada = numJornada;
        this.idImagenL = idImagenL;
        this.idImagenV = idImagenV;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Equipo getLocal() {
        return local;
    }
    public void setLocal(Equipo local) {
        this.local = local;
    }
    public Equipo getVisitante() {
        return visitante;
    }
    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }
    public String getLocalS() {
        return localS;
    }
    public void setLocalS(String localS) {
        this.localS = localS;
    }
    public String getVisitanteS() {
        return visitanteS;
    }
    public void setVisitanteS(String visitanteS) {
        this.visitanteS = visitanteS;
    }
    public int getGolesLocal() {
        return golesLocal;
    }
    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }
    public int getGolesVisitante() {
        return golesVisitante;
    }
    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    public String getFechaS() {
        return fechaS;
    }
    public void setFechaS(String fechaS) {
        this.fechaS = fechaS;
    }
    public int getFecha() {
        return numJornada;
    }
    public void setFecha(int numJornada) {
        this.numJornada = numJornada;
    }
    public int getNumJornada() {
        return numJornada;
    }
    public void setNumJornada(int numJornada) {
        this.numJornada = numJornada;
    }
    public int getIdLocal() {
        return idLlocal;
    }
    public void setIdLocal(int idLlocal) {
        this.idLlocal = idLlocal;
    }
    public int getIdVisitante() {
        return idVisitante;
    }
    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }
    public int getIdImagenL() {
        return idImagenL;
    }
    public void setIdImagenL(int idImagenL) {
        this.idImagenL = idImagenL;
    }
    public int getIdImagenV() {
        return idImagenV;
    }
    public void setIdImagenV(int idImagenV) {
        this.idImagenV = idImagenV;
    }
    public int getDgL() {
        return dgL;
    }
    public void setDgL(int dgL) {
        this.dgL = dgL;
    }
    public int getDgV() {
        return dgV;
    }
    public void setDgV(int dgV) {
        this.dgV = dgV;
    }
}

