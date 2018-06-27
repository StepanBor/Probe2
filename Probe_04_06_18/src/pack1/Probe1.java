package pack1;

public class Probe1 {

    private int a;
    private int b;

    public Probe1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Probe1() {
    }

    public void overriden(int a, int b){

        System.out.println("overriden in Probe1 "+a+b);

    }

}
