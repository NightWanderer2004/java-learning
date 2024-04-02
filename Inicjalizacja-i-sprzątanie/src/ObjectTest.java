public class ObjectTest {
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method called");
    }

    @Override
    public String toString() {
         return "Class: " + this.getClass().getName() + " HashCode: " + this.hashCode();
    }

    public static void main(String[] args) {
        ObjectTest obj1 = new ObjectTest();
        ObjectTest obj2 = new ObjectTest();

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.toString()); 

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}