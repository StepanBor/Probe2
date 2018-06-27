package pack1;



public class Probe3Main {
    public static void main(String[] args){
        int a=100;
        int b=200;
        Probe1 pr1=new Probe1(5,4);
        Probe1 pr12=new Probe2(5,4,3);
        Probe2 pr2=new Probe2(5,4,3);
        pr1.overriden(a,b);
        pr12.overriden(a,b);
        pr2.overriden(a,b);

    }

}
