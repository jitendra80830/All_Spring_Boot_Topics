package LamdaEx;

public class LamdaExampleMain {
    public static void main(String[] args) {
        // Callable
        /*LamdaInterfaceImpl l = new LamdaInterfaceImpl();
        l.test();*/

        //Anonymous implementation
        /*LamdaInterfaceTest l1 = new LamdaInterfaceTest() {
            @Override
            public void test() {
                System.out.println("First Helo");
            }
        };
        l1.test();

        LamdaInterfaceTest l2  = new LamdaInterfaceTest() {
            @Override
            public void test() {
                System.out.println("Second Hello");
            }
        };
        l2.test();*/

        //Using interface by Lambda
       /* LamdaInterfaceTest l1 = ()->{
            System.out.println("First time lambda using");
        };
        l1.test();

        StringInterfaceEx st = (str) -> String.valueOf(str.length());

        System.out.println(st.strTest("Jitendra"));

        AddTwoNumberInterface add = (a,b)-> a+b;
        System.out.println(add.addTwoNum(2,3));*/

        FunctionalInterface functionalInterface;

        functionalInterface = () -> 222;
        System.out.println(functionalInterface.getValue());

        functionalInterface = () -> Math.random() * 10;

        functionalInterface.getValue();

        FunctionalInterfaceWithArg functionalInterfaceWithArg;

        functionalInterfaceWithArg = (n) -> n > 0;
        System.out.println(functionalInterfaceWithArg.test(20));

        //Block Lambda Expressions

        FunctionalInterfaceForBlockLamdaEx functionalInterfaceForBlockLamdaEx = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println(functionalInterfaceForBlockLamdaEx.fun(3));
        System.out.println(functionalInterfaceForBlockLamdaEx.fun(5));

        //Generic Functional Interface and Lamda

        GenericFunctionalInterface<Integer> generic = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            //return result;
            return result;
        };

        System.out.println(generic.fun(3));

        GenericFunctionalInterface<String> stringGeneric = (n) -> {
            String result = "";

            for (int i = n.length() - 1; i >= 0; i--) {
                result += n.charAt(i);
            }
            return result;
        };
        System.out.println(stringGeneric.fun("Jitendra"));

        //Passing Lambda Expressions as Arguments
        String srtIn = "Lamda ex is Power full";
        String strOut = "";
        strOut = stringOp((str) -> str.toUpperCase(), srtIn);
        System.out.println(strOut);

        //Block lamda exp in Passing Lambda Expressions as Arguments
        stringOp((str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, srtIn);



        //Lambda Expressions and Variable Capture

        int c = 10;

        FunctionalInterfaceWithIntegerArg interfaceWithIntegerArg;
        interfaceWithIntegerArg = (n) ->{
            int v = c + n;


            return v;
        };

        //Method References to static Methods
        //Demonstrates a static method reference:

        String a = " abaca";



    }

    static String stringOp(FunctionalInterfaceWithStringArg functionalInterface, String str) {
        return functionalInterface.fun(str);
    }


}
