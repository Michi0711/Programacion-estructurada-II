package Pila;
public class Pila {
    /*Tope nos sirve para indicar en donde tenemos que insertar Longitud
    se emplea para obtener el tamaño de la pila
     */
    private Nodo tope = null;
    private int longitud = 0;
    public class Nodo{
        public int isbn;
        public String autor;
        public String  titulo;
        public Nodo next = null;
        public Nodo (int isbn, String autor, String titulo){
            this.isbn = isbn;
            this.autor = autor;
            this.titulo = titulo;

public boolean isEmptyStrack (){
    return tope == null;

    public int length (){
return longitud;
    }
public void apilar (int isbn, String autor, String titulo){
    Nodo nodoPush = new Nodo(isbn, autor, tirtulo); 
    nodoPush = new tope;
    tope = nodoPush;
    longitud++; //cada vez que se agrega un elemento se incrementa la longitud 

    public void desapilar (){
        if(tope! = null){
            Nodo nodoPop = tope;
            tope = tope.next;
            nodoPop = null;
        }
        longitud--;
    }
    public void obtenerTope(){
        if (!isEmptyStrack()){
            Nodo nodoCima = tope;
            System.out.println("El libro actual es: [" + nodoCima.isbn + ", " + nodoCima.autor + ", " + nodoCima.titulo + "]");
        }
   }
   piblic void destructor(){
    
   }
}
 // Elimina el valor y la referencia a los demas nodos.
 tope = null;
 // Reinicia el contador a 0.
 longitud = 0;   

}
}


}
}
