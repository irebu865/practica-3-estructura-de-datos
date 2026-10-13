public class Ficha {
    private int ladoA;
    private int ladoB;
    public Ficha(int ladoA, int ladoB) {
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        if (0>ladoA || ladoA>6 || ladoB<0 || ladoB>6  ) {
            throw new IllegalArgumentException("Valores incorrectos");
        }
    }
    public int getLadoA() {
            return ladoA;
        }
    public int getLadoB() {
            return ladoB;
        }

    public int getPuntosTotales() {
        return ladoA+ladoB;
    }

    // Invierte la ficha para acomodarla a la cadena si es necesario
    public Ficha invertir() {
       return new Ficha(ladoB, ladoA);
    }
    @Override
    public String toString() {
        return "["+ladoA+"|"+ladoB+"]";
    }
}

