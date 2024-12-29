package ashok.in.binding.main;

import ashok.in.binding.Student;
import com.google.gson.Gson;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.convertJavaObjToJson();
        app.studentConvertJavaObjToJson();


    }
    public void convertJavaObjToJson(){

        Student student = new Student("Jitendra",101);
        Gson gson = new Gson();

        String jsonString  = gson.toJson(student);
        System.out.println(jsonString);
    }
    public void studentConvertJavaObjToJson(){
        Student student = new Student("Jitendra",101);

        Gson gson = new Gson();

        String jsonString = gson.toJson(student);

        Student student1 = gson.fromJson(jsonString, Student.class);

        System.out.println(student1);


    }
}
