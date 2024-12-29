package in.ashokit.beans;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("diesel")
//@Primary
public class DiselEng implements IEngine{

    public DiselEng(){
        System.out.println("Diesel Constructor called...");
    }

    @Override
    public int start() {
        System.out.println(" DieselEng started...");
        return 1;
    }
}
