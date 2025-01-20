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
        Persona Juan = new Persona("12", 1, 2, 3, "j", 2,'m');
        Persona Pepe = new Persona("07", 1, 2, 3, "j", 2,'m');
        Persona Henrry = new Persona("17", 1, 2, 3, "j", 2,'m');
        Persona Paul = new Persona("04", 1, 2, 3, "j", 2,'m');
        Persona Ander = new Persona("09", 1, 2, 3, "j", 2,'m');
        Persona Carlos = new Persona("15", 1, 2, 3, "j", 2,'m');
        Persona David = new Persona("20", 1, 2, 3, "j", 2,'m');
        Persona Angelo = new Persona("08", 1, 2, 3, "j", 2,'m');
        Persona Christopher = new Persona("16", 1, 2, 3, "j", 2,'m');
   
        
        ArbolBB a=new ArbolBB();
        
        System.out.println(a.Ingresar(Juan));
        System.out.println(a.Ingresar(Pepe));
        System.out.println(a.Ingresar(Henrry));
        System.out.println(a.Ingresar(Paul));
        System.out.println(a.Ingresar(Ander));
        System.out.println(a.Ingresar(Carlos));
        System.out.println(a.Ingresar(David));
        System.out.println(a.Ingresar(Angelo));
        System.out.println(a.Ingresar(Christopher));
        
        
        System.out.println(a.inOrder(a.getRaiz()));
        System.out.println(a.postOrder(a.getRaiz()));
        System.out.println(a.preOrder(a.getRaiz()));
        System.out.println(a.Tamaño(a.getRaiz()));
        
    }
}
