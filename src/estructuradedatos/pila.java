/*
 * UNIVERSIDAD JUAREZ AUTONOMA DE TABASCO.
 * DIVISIÓN ACADEMICA DE INFORMATICA Y SISTEMAS
 * PROGRAMACION Y ESTRUCTURA DE DATOS
 */
package estructuradedatos;

/**
 *
 * @author Dr. Adrián Sevilla <adrianevil.com>
 */
public class pila {
    private Object e[][];
    private int puntero = 0;
    pila(){
        e = new Object[2][1000];
    }
    pila(int cantidad){
        e = new Object[2][cantidad];
    }
    public boolean agregar(Object e){
        if (!estaLleno()) {
            this.e[0][puntero] = e;
            puntero++;
            return true;
        }
        return false;
        
    }
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
    public Object ver(){
        if (!estaVacio())
            return e[0][puntero-1];
        return false;
    }
    public Object ver(int indice){
        try{
            if (!estaVacio())
            return e[0][indice];
        }catch(Exception e){
            
        }
        return false;
    }
    private void acomodar(int desde){
        for(int i=desde;i<puntero;i++){
            if (e[0][i] == null) {
                e[0][i] = e[0][(i+1)];
                e[0][(i+1)] = null;
            }
        }
        puntero--;
    }
    
    public int longitud(){
        return puntero;
    }
    public boolean estaLleno(){
        return (this.e[0].length - 1) == puntero;
    }
    public boolean estaVacio(){
        return this.puntero == 0;
    }
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
