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
        System.out.println("\n------------Arbol Splay-------------------------------------------------\n");
        //--------------------------------------------------------------------------------------//

        SplayTree st = new SplayTree();
        st.insert(00,23);
        st.insert(01,26);
        st.insert(02,34);
        st.insert(03,1);

        st.getElement(02);
        
        st.height();
        st.print();

    }

}
