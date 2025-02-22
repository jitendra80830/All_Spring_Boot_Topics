package exeptionPack;

public class ExeDemo {
    public static void main(String[] args) {
        boolean ok  = false;
        try {
            int i = 9/0;
            ok = true;
            System.exit(0);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Error: "+e.getMessage());
        }
        finally {
            System.out.println("Finaly");

            //throw new RuntimeException("its not ok");

        }
    }
}
