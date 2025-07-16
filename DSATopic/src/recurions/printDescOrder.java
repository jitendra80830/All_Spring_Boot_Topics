package recurions;

public class printDescOrder {
    public static void main(String[] args) {
        descOrd(5);
    }

    private static void descOrd(int i) {
        if(i==0){
            return;
        }
        System.out.println(i);
        descOrd(i-1);
    }
}
