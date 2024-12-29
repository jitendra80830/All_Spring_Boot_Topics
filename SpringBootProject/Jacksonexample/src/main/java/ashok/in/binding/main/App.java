package ashok.in.binding.main;

import ashok.in.binding.Student;
import ashok.in.binding.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.File;

public class App {

    public static void main(String[] args) throws Exception {
        App app = new App();
       // app.convertObjectToJson();
        //app.convertJsonToJavaObject();
    }

    public void convertObjectToJson() throws Exception{
        User user = new User(101,"Jitendra","Male",10101001);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("user.json"),user);
        //mapper.writeValueAsBytes("");


        System.out.println("Java object converted to json");
    }

    public void convertJsonToJavaObject() throws Exception{

        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(new File("user.json"), User.class);
        System.out.println(user);

        System.out.println("Json converted to java object....");
    }

}
