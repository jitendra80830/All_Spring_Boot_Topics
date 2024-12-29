package FactoryDesignPattern;

public class FactoryDesignPattern {

    public static void main(String[] args) {
        Employee android_developer = EmployeeFactory.getEmployeeType("Android Developer");
        System.out.println(android_developer.salary());
        Employee web_developer = EmployeeFactory.getEmployeeType("Web Developer");
        System.out.println(web_developer.salary());



    }

}
