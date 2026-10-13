public class Pair1 <U, V> {
    private U firts;
    private V second;
    public Pair1(U f, V s){
        firts=f;
        second=s;
    }
    public U getFirts() {
        return firts;
    }

    public V getSecond() {
        return second;
    }

    public void setFirts(U firts) {
        this.firts = firts;
    }

    public void setSecond(V second) {
        this.second = second;
    }
    public static void main(){
        Pair1<Integer, Integer> pent=new Pair1<>(3,5);
        Pair1 <String, String> ps= new Pair1<>("hola","mundo");
        Pair1 <String, Float> nota=new Pair1<>("al458349", 7.2);
    }
}
