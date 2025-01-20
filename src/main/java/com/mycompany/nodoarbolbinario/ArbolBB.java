/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nodoarbolbinario;

/**
 *
 * @author lopez
 */
//calcular nodo hoja, calcular la altura del arbol, usutilizando una cola, imprimir por consola el nivel del arbol de cada dato que hay por nivel, los datos , cola direccion de memoria
public class ArbolBB {

    private NodoABB raiz;

    public NodoABB getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoABB raiz) {
        this.raiz = raiz;
    }

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
            int cedulaNueva = Integer.parseInt(pernuevo.getCedula());
            while (aux != null) {
                Persona perarblol = (Persona) aux.getInfo();
                int cedulaActual = Integer.parseInt(perarblol.getCedula());

                if (cedulaNueva < cedulaActual) {
                    if (aux.gethIzq() == null) {
                        aux.sethIzq(nuevo);
                        return "dato ingresado  I";
                    } else {
                        aux = aux.gethIzq();
                    }
                } else if (cedulaNueva > cedulaActual) {
                    if (aux.gethDer() == null) {
                        aux.sethDer(nuevo);
                        return "dato ingresado D";
                    } else {
                        aux = aux.gethDer();
                    }

                } else {
                    return "cedula ingresada ya existe";
                }
            }
            return "";
        }
    }

    public String preOrder(NodoABB r) {
        Persona per;
        String res = "";
        if (r != null) {
            per = (Persona) r.getInfo();
            res += per.Imprimir();
            res += preOrder(r.gethIzq());
            res += preOrder(r.gethDer());

        }
        return res;
    }

    public String inOrder(NodoABB r) {
        Persona per;
        String res = "";
        if (r != null) {
            per = (Persona) r.getInfo();

            res += inOrder(r.gethIzq());
            res += per.Imprimir();
            res += inOrder(r.gethDer());

        }
        return res;
    }

    public String postOrder(NodoABB r) {
        Persona per;
        String res = "";
        if (r != null) {
            per = (Persona) r.getInfo();

            res += postOrder(r.gethIzq());

            res += postOrder(r.gethDer());
            res += per.Imprimir();

        }
        return res;
    }

    public int Tamaño(NodoABB r) {
        int res = 0;
        if (r != null) {
            res += 1;
            res += Tamaño(r.gethIzq());
            res += Tamaño(r.gethDer());

        }
        return res;

    }

    public int calcularAltura(NodoABB nodo) {

        if (nodo == null) {
            return -1;
        }
        int alturaIzquierda = calcularAltura(nodo.gethIzq());
        int alturaDerecha = calcularAltura(nodo.gethDer());

        int mayorAltura;
        if (alturaIzquierda > alturaDerecha) {
            mayorAltura = alturaIzquierda;
        } else {
            mayorAltura = alturaDerecha;
        }

        return 1 + mayorAltura;
    }

    public String ElementosporNivel(NodoABB nodo) {
        COLA c1 = new COLA(100);
        if (raiz == null) {
            return "El árbol está vacío";
        }
        c1.Encolar(raiz);

        String resultado = "";

        int nivel = 0;

        while (!c1.Vacia()) {

            int tamNivel = c1.getNe();

            resultado += "Nivel " + nivel + ": "+"\t";

            for (int i = 0; i < tamNivel; i++) {

                NodoABB actual = (NodoABB) c1.Desencolar();
                Persona persona = (Persona) actual.getInfo();
                resultado += persona.getCedula();

                if (i < tamNivel - 1) {
                    resultado += ",";
                }

                if (actual.gethIzq() != null) {
                    c1.Encolar(actual.gethIzq());
                }
                if (actual.gethDer() != null) {
                    c1.Encolar(actual.gethDer());
                }
            }

            resultado += "\n";
            nivel++;
        }

        return resultado;
    }

    public int contarNodosHoja(NodoABB nodo) {
        if (nodo == null) {
            return 0;
        }

        if (nodo.gethIzq() == null && nodo.gethDer() == null) {
            return 1;
        }

        return contarNodosHoja(nodo.gethIzq()) + contarNodosHoja(nodo.gethDer());
    }

}
