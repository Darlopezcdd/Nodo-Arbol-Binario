/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nodoarbolbinario;

/**
 *
 * @author lopez
 */
public class Persona {
    private String cedula;
    private int codProv;
    private int codCant;
    private int codParr;
    private String recinto;
    private int numMesa;
    private char genero;

    public Persona(String cedula, int codProv, int codCiud, int codParr, 
            String recinto, int numMesa, char genero) {
        this.cedula = cedula;
        this.codProv = codProv;
        this.codCant = codCiud;
        this.codParr = codParr;
        this.recinto = recinto;
        this.numMesa = numMesa;
        this.genero=genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCodProv() {
        return codProv;
    }

    public void setCodProv(int codProv) {
        this.codProv = codProv;
    }

    public int getCodCiud() {
        return codCant;
    }

    public void setCodCiud(int codCiud) {
        this.codCant = codCiud;
    }

    public int getCodParr() {
        return codParr;
    }

    public void setCodParr(int codParr) {
        this.codParr = codParr;
    }

    public String getRecinto() {
        return recinto;
    }

    public void setRecinto(String recinto) {
        this.recinto = recinto;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    public String Imprimir()
    {
        return "Persona: "+ cedula+";"+codProv+";"+  codCant+";"+ codParr+";"+ 
             recinto+";"+  numMesa+";"+ genero+" "+"\n";
    }
}
