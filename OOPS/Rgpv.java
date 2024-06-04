public abstract class Rgpv {
    public abstract void lab();

    public abstract void cctv();

    public void copyCheck() {
        System.out.println("This is the rgpv");
    }
}

class Abstraction extends Rgpv {
    public void lab() {
        System.out.println("This is lab");
    }

    public void cctv() {
        System.out.println("This is cctv");
    }

    public static void main(String[] args) {
        Rgpv r = new Abstraction();
        r.cctv();
        r.lab();
        r.copyCheck();
    }
}
