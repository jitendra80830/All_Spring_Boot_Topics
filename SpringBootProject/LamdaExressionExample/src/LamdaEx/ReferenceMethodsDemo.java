package LamdaEx;

public class ReferenceMethodsDemo {

    static String stringOP(FunctionalInterfaceWithStringArg stringArg , String  str){
        return stringArg.fun(str);
    }

    public static void main(String[] args) {
        String inputStr = "JitendraKr";
        String outString = "";
        //Method References to Static Methods
        outString = stringOP(MyStringOP::reverseString , inputStr);

        System.out.println("Method References to Static Methods "+outString);


        //Method References to Instance Methods
        inputStr = "JitendraKrgupta";
        MyStringOp2 myStringOP =new MyStringOp2();

        outString = stringOP(myStringOP::reverseString , inputStr);

        System.out.println("Method References to Instance Methods "+outString);




    }

}
