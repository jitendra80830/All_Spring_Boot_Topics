package DesignPattern.singletoneDesign;

public class Samausa {
    private static Samausa samausa;
    private Samausa(){

    }
    //Lazy way to create Sigletone Object
    public static Samausa getSamausa(){

        synchronized (Samausa.class){
            if(samausa == null){
                samausa = new Samausa();
            }
        }
        return samausa;
    }

}
