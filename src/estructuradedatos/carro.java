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
public class carro {
    String marca, modelo, color, tipo;
    carro(){
        marca = "Mazda";
        modelo = "CX9";
        color = "Gris Titanop";
        tipo = "Automatico";
    }
    public String nombre(){
        return marca + " " + modelo + " " + color + " " + tipo;
    }
    
}
