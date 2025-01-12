/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nodoarbolbinario;

/**
 *
 * @author lopez
 */
public class ArbolBB {

    private NodoABB raiz;

    public ArbolBB() {
        raiz = null;
    }

    public String Ingresar(Object elem) {
        NodoABB nuevo = new NodoABB(elem, null, null);
        if (raiz == null) {
            this.raiz = nuevo;
            return "primer dato ingresado";
        } else {
            NodoABB aux = raiz;
            Persona pernuevo = (Persona) nuevo.getInfo();
            while (aux != null) {
                Persona perarblol = (Persona) aux.getInfo();
                int r = pernuevo.getCedula().compareTo(perarblol.getCedula());
                if (r > 0) {
                    if (aux.gethDer() == null) {
                        aux.sethDer(nuevo);
                        return "dato ingresado D";
                    } else {
                        aux = aux.gethDer();
                    }
                } else if (r < 0) {
                    if (aux.gethIzq() == null) {
                        aux.sethIzq(nuevo);
                        return "dato ingresado  I";
                    } else {
                        aux = aux.gethIzq();
                    }
                } else {
                    return "cedula ingresada ya existe";
                }
            }
            return "";
        }
    }
//    public String InOrder()
//    {
//        if(raiz==null)
//        {
//            return "no hay datos";
//        }else
//        {
//            
//        }
//    }

}
