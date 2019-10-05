/*
 * UNIVERSIDAD JUAREZ AUTONOMA DE TABASCO.
 * DIVISIÓN ACADEMICA DE INFORMATICA Y SISTEMAS
 * PROGRAMACION Y ESTRUCTURA DE DATOS
 */
package estructuradedatos;

/**
  * Representación de una pila Tipo de Estructura de datos PILA
  * @author Dr. Adrián Sevilla <adrianevil.com>
  * @since 1.0
  * @version 1.0
 */
public class pila {
    /*
    * @param e Elementos de la pila
    */
    private Object e[][];
    /*
    *@param puntero cantidad de elementos en la pila
    */
    private int puntero = 0;
    /**
     * Constructor de la pila, al estar vacio la pila se crea de 1000 elementos tipo Object
     */
    pila(){
        e = new Object[2][1000];
    }
    /**
     * Constructor con parametro de cantidad
     * @param cantidad Elementos de la pila 
     */
    pila(int cantidad){
        e = new Object[2][cantidad];
    }
    /**
     * Agrega elementos a la pila
     * @param e Elemento a ser agregado a la pila tipo Object
     * @return regresa Verdadero cuando se agrega exitosamente
     */
    public boolean agregar(Object e){
        if (!estaLleno()) {
            this.e[0][puntero] = e;
            puntero++;
            return true;
        }
        return false;
        
    }
    /**
     * Extrae y elimina un elemento de la pila segun el índice proporcionado
     * @param indice numero que representa al índice de la pila
     * @return el elemento extraido de la pila del tipo Object
     */
    public Object extraer(int indice){
        Object intercambio;
        if ((indice < puntero) & (indice >=0 )) {
            intercambio = e[0][indice];
            e[0][indice] = null;
            acomodar(indice);
            return intercambio;
        }
        return false;
    }
    /**
     * Regresa el elemento de la pila que se encuentra arriba (A tope) sin borrarlo.
     * @return elemento a tope de la pila tipo Object
     */
    public Object ver(){
        if (!estaVacio())
            return e[0][puntero-1];
        return false;
    }
    /**
     * Regresa el elemento de la pila que se encuentra en el índice proporcionado.
     * @param indice número entero que representa el índice de la pila
     * @return el elemento que se encuentra en el indice cuando se encuentra o false cuando no existe.
     */
    public Object ver(int indice){
        try{
            if (!estaVacio())
            return e[0][indice];
        }catch(Exception e){
            
        }
        return false;
    }
    /**
     * Acomoda los elementos de la pila para cuando se extrae uno.
     * @param desde índice que se extrae
     */
    private void acomodar(int desde){
        for(int i=desde;i<puntero;i++){
            if (e[0][i] == null) {
                e[0][i] = e[0][(i+1)];
                e[0][(i+1)] = null;
            }
        }
        puntero--;
    }
    /**
     * Elementos que se encuentran en la pila.
     * @return el número de elementos en la pila en entero.
     */
    public int longitud(){
        return puntero;
    }
    /**
     * Indica si la pila se encuentra ocupada completamente, es decir sin espacios.
     * @return True cuando se encuentra llena y false en caso contrario
     */
    public boolean estaLleno(){
        return (this.e[0].length - 1) == puntero;
    }
    /**
     * Indica si la pila no tiene elementos.
     * @return true en caso de que no existan elementos en la pila y false en caso contrario.
     */
    public boolean estaVacio(){
        return this.puntero == 0;
    }
    /**
     * Elimina a todos los elementos en la pila establece a null los espacios y a cero el tope.
     * @return 
     */
    public boolean vaciar(){
        try {
            for (int i=0; i < e.length; i++)
                for (int j=0; j < e[0].length; j++)
                e[i][j] = null;
            puntero = 0;
            return true;
        }catch(Exception e){
            
        }
        return false;
        
    }
}
