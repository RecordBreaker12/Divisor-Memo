package divisores;

import java.util.ArrayList;
import java.util.Arrays;


public class Divisores {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        Calculadora calc = new Calculadora(20, lista);
        long inicio = System.currentTimeMillis();
        System.out.println("Soma = "+calc.fcalcular.apply(0));
        System.out.println("Tempo de execução: " + (System.currentTimeMillis()-inicio));
    }
    
}
