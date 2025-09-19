public class SingleTone {

    private static SingleTone singleTone;

    private SingleTone() {
    }

    public static SingleTone getIntance() {
        if (singleTone == null) {
            singleTone = new SingleTone();
            return singleTone;
        }else {
        return singleTone;
        }
    }

    public static void main(String[] args) {
        SingleTone intance = SingleTone.getIntance();
        SingleTone intance1 = SingleTone.getIntance();
        System.out.println(intance.hashCode()+" : "+intance1.hashCode());


        String url = "https://jsonplaceholder.typicode.com/todos/1";
/*

       Employye em =  retstTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1").get();

        System.out.println(em);
*/



    }

}
