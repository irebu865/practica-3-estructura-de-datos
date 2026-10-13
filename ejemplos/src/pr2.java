import java.util.List;
import java.util.ListIterator;

public class pr2 {
    public boolean equivalentes (List <String> l1,List <String> l2 ){

        if (l1.size() != l2.size()) {
            return false;
        }
        ListIterator <String> it= l1.listIterator();
        while (it.hasNext()){
            String actual= it.next();
            boolean encontrado=false;
            Iterator<String> it2 = copia.iterator();
            while (it2.hasNext() && !encontrado) {
                if (it2.next().equals(actual)) {
                    it2.remove();
                    encontrado = true;
                }
            }

            if (!encontrado) {
                return false;
            }
        }

        return true;
    }
}






    }
}
