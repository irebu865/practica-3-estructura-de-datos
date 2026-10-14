import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Jugador {
    private String nombre;
    private LinkedList<Ficha> colec;
    public Jugador(String nombre) {
        this.nombre=nombre;
        this.colec=new LinkedList<>();
    }

    public String getNombre() {
        return this.nombre;
    }
    public Queue<Ficha> getFichas() {
        return this.colec;
    }

    public void recibirFicha(Ficha f) {
        colec.add(f);
    }
    public Ficha buscarFicha(int valor1, int valor2) {
      int total=colec.size();
      for(int i=0; i<total;i++){
          Ficha f=colec.remove();
          if (f.getLadoA() == valor1 || f.getLadoA() == valor2 ||
                  f.getLadoB() == valor1 || f.getLadoB() == valor2) {
              return f;
          }
          colec.add(f);
      }
      return null;
    }
    public boolean tieneFichas() {
        if (colec.isEmpty()) {
            return false;
        }
            return true;
    }

    public int calcularPuntosRestantes() {
        int suma=0;
        Iterator<Ficha> it= colec.iterator();
        while(it.hasNext()){
            Ficha actual=it.next();
            suma+=actual.getPuntosTotales();
        }
        return suma;
    }

    @Override
    public String toString() {
        return null;
    }
}
