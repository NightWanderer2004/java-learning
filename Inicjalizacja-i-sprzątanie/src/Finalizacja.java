public class Finalizacja {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method called");
    }

    public static void main(String[] args) {
        Finalizacja obj = new Finalizacja();
        obj = null; 
        System.gc(); 
    }
}