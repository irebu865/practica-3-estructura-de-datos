import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
public class EJe {
    public static void sustituirPares(List<Integer> lista) {
        int tam = lista.size();
        ListIterator<Integer> it = lista.listIterator();
        for (int i = 0; i < tam; i++) {
            Integer tmp = it.next();
            if (tmp % 2 == 0) {
                it.set(tmp + 1);
            }
        }
    }
    public static<T> void insertarOrdenado (ListIterator<T> it, T elem){
        while(it.hasNext()){
            T actual=it.next();
            if(actual.compareTo(elem)>0){
                it.previous();
                it.add(elem);
                return;
            }
            it.add(elem);
        }

    }
    public static void expandir (ListIterator<String> lista){
        while(lista.hasNext()){

        }
    }
    public static <T> void borrarElementosEnPosPares(List <T> l){
        Iterator <T> it=l.iterator();
        int pos=0;
        while(it.hasNext()){
            it.next();
            if(pos%2==0){
                it.remove();
            }
            pos++;
        }
    }

}