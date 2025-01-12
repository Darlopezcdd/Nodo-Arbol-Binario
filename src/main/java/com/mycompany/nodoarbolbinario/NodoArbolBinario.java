/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.nodoarbolbinario;

/**
 *
 * @author lopez
 */
public class NodoArbolBinario {

    public static void main(String[] args) {
        Persona Juan = new Persona("3", 1, 2, 3, "j", 2);
        Persona Pepe = new Persona("2", 1, 2, 3, "j", 2);
        Persona Henrry = new Persona("3", 1, 2, 3, "j", 2);
        Persona Paul = new Persona("6", 1, 2, 3, "j", 2);
        Persona Ander = new Persona("1", 1, 2, 3, "j", 2);
        Persona Carlos = new Persona("8", 1, 2, 3, "j", 2);
        
        ArbolBB a=new ArbolBB();
        System.out.println(a.Ingresar(Juan));
        System.out.println(a.Ingresar(Pepe));
        System.out.println(a.Ingresar(Henrry));
        System.out.println(a.Ingresar(Paul));
        System.out.println(a.Ingresar(Ander));
        System.out.println(a.Ingresar(Carlos));
        
    }
}
