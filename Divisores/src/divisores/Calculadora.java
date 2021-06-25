package divisores;

import java.util.ArrayList;
import java.util.function.Function;

public class Calculadora {
    int num;
    ArrayList<Integer> lista = new ArrayList();
    
    public Calculadora(int num, ArrayList<Integer> lista){
        this.num = num;
        this.lista = lista;
    }
    
    Function<Integer, Integer> f = x -> lista.stream().filter(i -> (num % i == 0)).reduce(x, Integer::sum);
    
    Function<Integer, Integer> fcalcular = Memoizador.memoizar(f);
}
