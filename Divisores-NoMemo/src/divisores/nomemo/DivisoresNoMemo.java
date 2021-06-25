package divisores.nomemo;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisoresNoMemo {
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        int soma = 0;
        long inicio = System.currentTimeMillis();
        soma = lista.stream().filter(i -> (20 % i == 0)).reduce(soma, Integer::sum);
        System.out.println("Soma = " + soma);
        System.out.println("Tempo de execução: " + (System.currentTimeMillis()-inicio));
        //De acordo com os testes, a versao do programa que utiliza o memoizador é notavelmente mais rapida//
    }
    
}
