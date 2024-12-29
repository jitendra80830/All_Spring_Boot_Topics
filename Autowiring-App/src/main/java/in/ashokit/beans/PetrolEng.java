package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrol")
@Primary
public class PetrolEng implements IEngine{

    public PetrolEng(){
        System.out.println("PetrolEng Constructor called..");
    }

    @Override
    public int start() {
        System.out.println("PetrolEng started...");
        return 1;
    }
}
