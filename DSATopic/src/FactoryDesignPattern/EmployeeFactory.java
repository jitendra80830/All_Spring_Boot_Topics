package FactoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployeeType(String empType){
        if(empType.trim().equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        }
        else if(empType.trim().equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }else {
            return null;
        }
    }
}
