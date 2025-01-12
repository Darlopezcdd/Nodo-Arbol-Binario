/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nodoarbolbinario;

/**
 *
 * @author lopez
 */
public class NodoABB {
    private Object info;
    private NodoABB hIzq;
    private NodoABB hDer;

    public NodoABB(Object info, NodoABB hIzq, NodoABB hDer) {
        this.info = info;
        this.hIzq = hIzq;
        this.hDer = hDer;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public NodoABB gethIzq() {
        return hIzq;
    }

    public void sethIzq(NodoABB hIzq) {
        this.hIzq = hIzq;
    }

    public NodoABB gethDer() {
        return hDer;
    }

    public void sethDer(NodoABB hDer) {
        this.hDer = hDer;
    }
    
    
}
