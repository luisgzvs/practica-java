/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author luisgonzalez
 */
public class Arreglos {
    
    //Data Provider     
    String nombres[] = {"0", "Ferny", "Kenneth", "Misa", "JuanP", "Gega"};
    String apellidos[] = {"0", "Solis", "Alvarado", "Valerio", "Gamboa", "Zamora"};
    int numeros[] = {0, 80, 100, 200, 50, 20};
    
    public int SeleccionarPosicion(){
        return (int) (Math.random() * 5) + 1;
    }
    
    public String imprimirNombre (){
        String nombres = "";
        String resultado = "";
        resultado = this.nombres[SeleccionarPosicion()];
        return resultado;
    }
    
    public String imprimirApellido (){
        String resultado = "";
        resultado = apellidos[SeleccionarPosicion()];
        return resultado;
    }
    
    public int seleccionarEdad(){
        int resultado = 0;
        resultado = numeros[SeleccionarPosicion()];
        return resultado;
    }
    
}
