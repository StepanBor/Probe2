package pack1;

public class Probe2 extends Probe1 {
    private int c;

    public Probe2(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public Probe2() {
        super();
    }


    public String overriden(int a, int b,int c) {
        String st="ovrerriden in Probe2 "+a+b+c;
        return st;

    }

    @Override
    public void overriden(int a, int b) {
        System.out.println("Overriden in probe2 "+a+b+c);
    }
}
