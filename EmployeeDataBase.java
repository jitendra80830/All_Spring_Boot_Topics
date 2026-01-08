package streamApi;

import java.util.Arrays;
import java.util.List;


public class EmployeeDataBase {
    public static List<Employ> getAllEmploy(){
        Project p1 = new Project("P001", "Alpha", "ABC Corp", "Alice");
        Project p2 = new Project("P002", "Beta", "XYZ Ltd", "Bob");
        Project p3 = new Project("P003", "Gamma", "ABC Corp", "Alice");
        Project p4 = new Project("P004", "Delta", "TechWorld", "Charlie");
        Project p5 = new Project("P005", "Epsilon", "MoneyMatters", "Daniel");
        Project p6 = new Project("P006", "Zeta", "SmartTech", "Eva");
        Project p7 = new Project("P007", "Eta", "BrandBoost", "George");
        Project p8 = new Project("P008", "Theta", "InnoSoft", "Hannah");
        Project p9 = new Project("P009", "Iota", "fastTrack", "Ian");
        Project p10 = new Project("P010", "Kappa", "DigitalWave", "Jessica");


        Employ e1 = new Employ(1, "John Doe", "Development", Arrays.asList(p1,p2), 80000, "Male");
        Employ e2 = new Employ(2, "Jane Smith", "Development", Arrays.asList(p3), 80000, "Female");
        Employ e3 = new Employ(3, "Michael Brown", "Sales", Arrays.asList(p4), 60000, "Male");
        Employ e4 = new Employ(4, "Emily Davis", "Hr", Arrays.asList(p1), 55000, "Female");
        Employ e5 = new Employ(5, "Chris Johnson", "Finance", Arrays.asList(p5), 90000, "Male");
        Employ e6 = new Employ(6, "Linda Martinez", "Development", Arrays.asList(p6), 85000, "Female");
        Employ e7 = new Employ(7, "Robert Lee", "Marketing", Arrays.asList(p7), 72000, "Male");
        Employ e8 = new Employ(8, "Patricia White", "Development", Arrays.asList(p8), 88000, "Female");
        Employ e9 = new Employ(9, "David Harris", "Sales", Arrays.asList(p9), 78000, "Male");
        Employ e10= new Employ(10, "Susan Clark", "Development", Arrays.asList(p10), 95000, "Female");

        return Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
    }
}
