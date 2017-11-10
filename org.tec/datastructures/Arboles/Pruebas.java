package datastructures.Arboles;

/**
 * Created by 13mariano on 10 nov 2017.
 */
public class Pruebas {
    public static void main(String [] var){
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

        abb.getRoot();
        abb.print();

        //--------------------------------------------------------------------------------------//
        System.out.println("\n------------Arbol B-------------------------------------------------\n");
        //--------------------------------------------------------------------------------------//

        BTree bt = new BTree();

        bt.insert(0,23);
        bt.insert(1,23);
        bt.insert(2,26);
        bt.insert(3,34);
        bt.insert(4,1);

        bt.getElement(3);

    }

}
