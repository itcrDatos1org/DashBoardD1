package datastructures.Pruebas;

import datastructures.Arboles.AVLTree;
import datastructures.Arboles.BinarySearchTree;
import datastructures.Arboles.SplayTree;
import datastructures.Busqueda.BinarySearch;
import datastructures.DatosLineales.Cola;
import datastructures.DatosLineales.ListaSimple;
import datastructures.DatosLineales.Pila;
import datastructures.Ordenamiento.QuickSort;

/**
 * Created by 13mariano on 10 nov 2017.
 */
public class Pruebas {
    public static void main(String [] var){
        System.out.println("\n-------------ARBOLES-------------------------------------------------------\n");
        System.out.println("\n-------------Avl-------------------------------------------------------\n");
        //Avl Tree
        //--------------------------------------------------------------------------------------//
        AVLTree avltree = new AVLTree();
        avltree.insert(23);
        avltree.insert(26);
        avltree.insert(34);
        avltree.insert(1);

        avltree.getRoot();
        avltree.print();
        System.out.print("\n");

        avltree.remove(23);

        avltree.getRoot();
        avltree.print();


        //--------------------------------------------------------------------------------------//
        System.out.println("\n------------Binario de Busqueda-------------------------------------------------\n");
        //--------------------------------------------------------------------------------------//

        //ABB
        BinarySearchTree abb = new BinarySearchTree();

        abb.insert(23);
        abb.insert(26);
        abb.insert(34);
        abb.insert(1);

        abb.contains(26);

        abb.getRoot();
        abb.print();

        //--------------------------------------------------------------------------------------//
        System.out.println("\n------------Arbol Splay-------------------------------------------------\n");
        //--------------------------------------------------------------------------------------//

        SplayTree st = new SplayTree();
        st.insert(0,23);
        st.insert(1,26);
        st.insert(2,34);
        st.insert(3,1);

        st.print();
        System.out.print("\n");

        System.out.println("\n-------------BUSQUEDAS-------------------------------------------------------\n");
        BinarySearch bn = new BinarySearch();

        ListaSimple lbn = new ListaSimple();
        lbn.add(1);
        lbn.add(2);
        lbn.add(3);
        lbn.add(4);
        lbn.add(5);
        lbn.add(6);
        lbn.add(7);
        lbn.add(8);


        BinarySearch.binarySearch(lbn, 4);
        BinarySearch.binarySearch(lbn, 9);

        System.out.println("\n-------------DATOS LINEALES-------------------------------------------------------\n");
        //--------------------------------------------------------------------------------------//
        System.out.println("\n------------Cola-----------------------------------------------------\n");
        //--------------------------------------------------------------------------------------//

        Cola cola = new Cola();
        cola.Enqueve(1);
        cola.Enqueve(2);
        cola.Enqueve(3);
        cola.Enqueve(4);
        cola.Enqueve(5);

        cola.print();
        System.out.println();

        cola.Dequeve();

        cola.Peek();

        cola.print();
        System.out.println();

        //--------------------------------------------------------------------------------------//
        System.out.println("\n------------Pila-----------------------------------------------------\n");
        //--------------------------------------------------------------------------------------//
        Pila pila = new Pila();

        pila.Push(1);
        pila.Push(2);
        pila.Push(3);
        pila.Push(4);
        pila.Push(5);
        pila.Push(6);


        pila.print();
        System.out.println();

        pila.Pop();

        pila.Peek();

        pila.print();
        System.out.println();

        //--------------------------------------------------------------------------------------//
        System.out.println("\n------------Lista Simple-----------------------------------------------------\n");
        //--------------------------------------------------------------------------------------//

        lbn.print();
        System.out.println("\n------------ORDENAMIENTO------------------------------------------------------\n");
        //--------------------------------------------------------------------------------------//
        System.out.println("\n------------QuickSort-----------------------------------------------------\n");
        //--------------------------------------------------------------------------------------//

        ListaSimple lqs = new ListaSimple();

        lqs.add(3);
        lqs.add(4);
        lqs.add(7);
        lqs.add(8);
        lqs.add(5);
        lqs.add(6);
        lqs.add(1);
        lqs.add(2);
        QuickSort qs = new QuickSort();

    }

}
