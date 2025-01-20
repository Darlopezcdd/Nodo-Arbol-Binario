/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nodoarbolbinario;

/**
 *
 * @author lopez
 */
public class COLA {


    private int tamnio, ne, inicio, finnal;
    private Object[] V;

    public int getNe() {
        return ne;
    }


    public COLA(int tamnio) {
        this.tamnio = tamnio;
        this.ne = 0;
        this.inicio = 0;
        this.finnal = 0;
        this.V = new Object[tamnio];
    }

    public Object Desencolar() {
        Object res;
        if (!Vacia()) {
            res = V[inicio];
            V[inicio] = null;
            inicio++;
            ne--;
            if (inicio == tamnio) {
                inicio = 0;
            }
            return res;
        } else {
            return null;
        }

    }

    public String Encolar(Object elem) {
        String res = "Elemento Encolado";
        if (!Llena()) {

            V[finnal] = elem;
            finnal++;
            ne++;
            if (finnal == tamnio) {
                finnal = 0;
            }
            return res;
        } else {
            return "No se pudo Encolar, Cola Llena";
        }

    }

    public String Imprimir() {
        String res = "";

        for (int i = 0; i < V.length ; i++) {

            res += V[i] + "\n";

        }
        return res;
    }

//    public String Reporte() {
//        String res = "";
//        notas not;
//        for (int i = 0; i < V.length    ; i++) {
//            if(V[i]==null)
//            {
//                
//            }else
//            {
//                not = (notas) V[i];
//            res += not.getCedula() + " " + not.getCodMateria() + " " + not.getNota_1() + " " + not.getNota_2() + " " + not.getNota_suple() + "\n";
//            }
//            
//
//        }
//        return res;
//    }

    public boolean Vacia() {
        return ne == 0;
    }

    public boolean Llena() {
        return ne == tamnio;
    }

}

