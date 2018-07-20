/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esctructraLineales;

import java.util.Stack;

/**
 *
 * @author imagensala1juarez
 */
public class Pila {

    private Stack<String> stack = new Stack<>();
    private String dato = "";

    public void realizarOperacion(String op) {

        switch (op) {
            case "eliminar":
                this.dato = this.stack.pop();
                break;
            case "imprimir":
                System.out.println(this.stack.toString());
                break;
            case "insertar":
                this.stack.push(this.dato);
                break;
            case "elementoTope":
                System.out.println("Tope: " + this.stack.firstElement());
                break;
            case "estaVacia":
                if (this.stack.isEmpty()) {
                    System.out.println("esta Vacia");
                } else {
                    System.out.println("no esta Vacia");
                }
                break;
        }
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.setDato("paco");
        pila.realizarOperacion("insertar");
        pila.setDato("hugo");
        pila.realizarOperacion("insertar");
        pila.setDato("Luis");
        pila.realizarOperacion("insertar");

        pila.realizarOperacion("imprimir");

        pila.realizarOperacion("elementoTope");

        while (pila.getStack().isEmpty()) {
            pila.realizarOperacion("eliminar");
            pila.realizarOperacion("imprimir");
        }

    }

    public Stack<String> getStack() {
        return stack;
    }

}
