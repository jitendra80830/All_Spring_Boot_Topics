public class Main {
    public static void main(String[] args) {
        //This is not Type Safeting
        BoxWithNotTypeSafeting box = new BoxWithNotTypeSafeting("This is my book");
        box.container = 112;
        //System.out.println(box.getContainer());


        //Type Safeting
        BoxWithTypeSafeting<String> box1 = new BoxWithTypeSafeting<>("This is my pen");
       // box1.container = 1222; // Not allowed;
        System.out.println(box1.getContainer());
    }
}