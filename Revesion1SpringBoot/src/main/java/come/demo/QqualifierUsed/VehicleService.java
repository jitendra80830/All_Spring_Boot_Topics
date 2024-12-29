package come.demo.QqualifierUsed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    @Autowired
    @Qualifier("car")
    private Vehicle vehicle;

    public void print(){
        vehicle.start();
    }
}
