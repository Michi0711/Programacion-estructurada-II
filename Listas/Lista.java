package Listas;

public class Lista {
    private Nodo head = null; 
    //clase interna llamada nodo 
    private int length = 0; //obtener longitud o contador 
    public class Nodo{
        public int data; 
        public Nodo next; //esto es el enlace al siguiente Nodo
        Nodo(int valor){
            data = valor; 
            next = null; 
        }
    }
    public boolean isEmptyList(){
        return head == null;
    }
    public int contarNodos(){
        return length;
    }
    public void mostrarNodos(){
        Nodo current = head;
        int contador = 0; 
        while (current != null){
            System.out.println("El elemento " + (contador + 1) + " del Nodo es: " + current.data);
            current = current.next;
            contador++;
        }
    }
    public void insertarAlinicio(int valor){
        //instancia de un nodo 
        Nodo nodo = new Nodo(valor); 
        nodo.next = head; 
        //Apuntar el puntero del nodo a la cabeza 
        head = nodo;
        length++; 
    }
    public void insertarAlFinal(int valor) {
        Nodo nodo = new Nodo(valor);
        if (isEmptyList()) {
            head = nodo;
        } else{
            Nodo puntero = head;
            while (puntero.next != null) {
                puntero = puntero.next;
            }
            puntero.next = nodo;
        }
        length++;
    }
    public void insertarEnPosicion(int posicion, int valor){ 
        Nodo nodo = new Nodo (valor); 
        if (isEmptyList()) {
            head = nodo; 
        }else {
            Nodo puntero = head; 
            int contador = 0; 
            while (contador < posicion && puntero.next != null){
                puntero = puntero.next; 
                contador++;
            }
            nodo.next = puntero.next; 
            puntero.next = nodo; 
        }
        length++;
        }
}
