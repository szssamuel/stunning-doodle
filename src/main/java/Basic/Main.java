package Basic;

public class Main {
    public static void main(String[] args) {
        Worker wrk = new Worker(new Numbers());
        int dir = 1;
        for (int i=0; i<100; i++) {
            if(wrk.work(dir))
                System.out.println("Counters now equal!");
        }
    }
}
