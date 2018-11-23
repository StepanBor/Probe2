package pack1;
//import static jdk.nashorn.internal.objects.Global.print;
//import static net.mindview.util.Print.*;



class WithFinals {
    // Identical to "private" alone:
    private final void f() {
        System.out.println("WithFinals.f()"); }
    // Also automatically "final":
    private void g() {
        System.out.println("WithFinals.g()"); }
}

public class OverrideIllusion {

}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // You can upcast:
        OverridingPrivate op = op2;
//        OverridingPrivate op3=new OverridingPrivate();

        // But you can’t call the methods:
//         op.f();
        //! op.g();
        // Same here:
        WithFinals wf = op2;
        //! wf.f();
        //! wf.g();
    }
}
