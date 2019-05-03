package Prueba;



/**
 * @author Oscar Alejandro Ortiz
 *
 */
public class Nodo {

   /*
    * declaracion de Variables  para el valor del nodo y los punteros para los nodos hijos 
    */
	private Nodo nodoIzquierdo;
	
    private Nodo nodoDerecho;
    
    private Integer dato;
 
    /*
     * Constructores 
     */
    public Nodo(Integer dato) {
        this.dato = dato;
    }
 
    public Integer getDato() {
        return dato;
    }
 
    /*
     * Set y get para cada una de las variables de la clase nodo
     */
    public void setValor(Integer dato) {
        this.dato = dato;
    }
 
    public Nodo getNodoIzquierdo() {
        return nodoIzquierdo;
    }
 
    public void setNodoIzquierdo(Nodo nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }
 
    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }
 
    public void setNodoDerecho(Nodo nodoDerecho) {
        this.nodoDerecho= nodoDerecho;
    }
    
    
    /*
     * metodo de agregar nodo que recibe como parametro el valor del nodo que fue enviado como parametro,
     * metodo recursivo que toma la desicion de saber si tiene no tiene un nodo hijo, agrega el nodo, si no lo
     * manda como parametro con el llamado al mismo metodo
     */
    public void agregarNodo(Integer dato) {
  	
    	   if (dato > this.dato) {
    		
    		   if (nodoDerecho != null) {
               	
               	nodoDerecho.agregarNodo(dato);
               	
               } else {
               	
               	nodoDerecho= new Nodo(dato);
               }
           
            
        } else {
        	
        	 if (nodoIzquierdo != null) {
             	
             	nodoIzquierdo.agregarNodo(dato);
             	
             } else {
             	
             	nodoIzquierdo = new Nodo(dato);
             }
            
        }
    }
 
    
    /*
     * Metodo de la clase nodo que recorre el arbol InOrden, primero el nodo izquierdo hijo, luego el padre y por ultimo el nodo derecho hijo
     */
    public void mostrarInOrden() {
        if (nodoIzquierdo != null) {
        	nodoIzquierdo.mostrarInOrden();
        }
        System.out.println(dato);
        if (nodoDerecho != null) {
        	nodoDerecho.mostrarInOrden();
        }
    }
 

}