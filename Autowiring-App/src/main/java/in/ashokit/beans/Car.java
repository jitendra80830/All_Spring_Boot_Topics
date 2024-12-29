package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
   // @Qualifier("diesel")
    private IEngine eng;

    //Setter injection
/*    @Autowired
    public void setEng(Engine eng){
        this.eng = eng;
        System.out.println("Setter Injection called..");
    }*/


    public Car(){
        System.out.println("Car 0 param Constructor called...");
    }
    //Constructor Injection
    /*@Autowired
    public Car(IEngine eng){
        this.eng = eng;
        System.out.println("Car Param Constructor called...");
    }*/
    public void drive(){
        int status = eng.start();
        if(status>=1){
            System.out.println("Journey started...");
        }
    }
}
