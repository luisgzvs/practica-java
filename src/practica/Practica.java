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
public class Practica {

    private int resultado = 0;

    public void ContadorFor(int x) {

        int resultado = 0;

        for (int i = 0; i < x; x--) {
            resultado = resultado + x;
        }

        System.out.println("El resultado final es: " + resultado);

    }

    public void ContadorWhile(int x) {

        int resultado = 0;

        while (x > 0) {
            resultado += x;
            x--;
        }

        System.out.println("El resultado final es: " + resultado);

    }

    public void ContadorRecursivo(int x) {

        if (x == 0) {
            System.out.println("El resultado final es: " + resultado);
        } else {
            resultado += x;
            x = x - 1;
            ContadorRecursivo(x);
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Practica instanciaPractica = new Practica();
        
        ejercicios instanciaEjercicios = new ejercicios();

        instanciaPractica.ContadorFor(5);
        instanciaPractica.ContadorWhile(5);
        instanciaPractica.ContadorRecursivo(5);
        //instanciaEjercicios.ContadorFor(5);

    }

}
