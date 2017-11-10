package datastructures.DatosLineales;

public class Cola<T>
{
    private NodeLista<T> head;
    private int capacidad;

    public Cola()
    {
        this.head = null;
        this.capacidad = 0;
    }

    public void Enqueve (T dato){
        EnqueveP(dato);
    }
    private void EnqueveP(T dato) {
        NodeLista<T> nodo = new NodeLista(dato);
        if (this.capacidad == 0)
        {
            this.head = nodo;
            this.head.setNext(null);
            this.capacidad += 1;
        }
        else
        {
            NodeLista<T> current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(nodo);
            current.getNext().setNext(null);
            this.capacidad += 1;
        }
    }

    public void Peek(){PeekP();}
    private T PeekP() {
        System.out.println("Esrte es el primer elemento: "+head.getData());
        return (T)this.head.getData();
    }

    public void  Dequeve(){
        DequeveP();
    }
    private void DequeveP(){
        if (this.capacidad != 0) {
            if (this.capacidad == 1)
            {
                this.head = null;
                this.capacidad -= 1;
            }
            else
            {
                System.out.println("se retiro: "+ this.head.getData());
                this.head = this.head.getNext();
                this.capacidad -= 1;
            }
        }
    }

    public int size()
    {
        return this.capacidad;
    }

    public void print(){
        printP();
    }
    private void printP() {

        NodeLista<T> aux = this.head;
        if (aux == null)
        {
           System.out.println("La cola esta vacia");
        }

        while (aux.getNext() != null) {
            if (aux.getNext() == null)
            {

                aux = aux.getNext();
            }
            else
            {
                System.out.println("["+aux.getData()+"]");
                aux = aux.getNext();
            }
        }

    }
}
