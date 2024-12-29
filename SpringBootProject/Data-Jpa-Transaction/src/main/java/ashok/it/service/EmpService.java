package ashok.it.service;

import ashok.it.entities.Address;
import ashok.it.entities.Emp;
import ashok.it.repo.AddRepo;
import ashok.it.repo.EmpRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    private AddRepo addRepo;

    @Autowired
    private EmpRepo empRepo;

    @Transactional(rollbackOn = Exception.class)
    public void saveEmp(){
        Emp emp = new Emp("Jitendra",2000.0);

       // int i = 10/0;
        empRepo.save(emp);
        Address address = new Address("Noida" ,"UP","India",emp.getEnpId());

        addRepo.save(address);

    }

}
