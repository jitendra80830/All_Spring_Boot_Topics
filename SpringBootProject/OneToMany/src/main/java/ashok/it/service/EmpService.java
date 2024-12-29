package ashok.it.service;

import ashok.it.entities.Address;
import ashok.it.entities.Employee;
import ashok.it.repo.AddressRepo;
import ashok.it.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRepo empRepo;

    @Autowired
    private AddressRepo addressRepo;

    public void deleteEmpRec(){
        empRepo.deleteById(1);
    }

    //fetching parent class data
    public void getEmpData(){
        Optional<Employee> byId = empRepo.findById(1);

    }
   //fetching child class data
    public void getAddData(){
        Optional<Address> byId = addressRepo.findById(1);

    }

    public void saveEmpData(){

        Employee employee = new Employee();
        Address a1 = new Address();
        a1.setCity("Noida");
        a1.setState("UP");
        a1.setType("Permanent");
        a1.setEmployee(employee);

        Address a2  = new Address();
        a2.setType("Present");
        a2.setState("Delhi");
        a2.setState("Delhi");
        a2.setEmployee(employee);

        List<Address> addresses = Arrays.asList(a1, a2);


        employee.setEmpName("Jitendra");
        employee.setSalary(222.2);
        employee.setAddresses(addresses);

        a2.setEmployee(employee);

        empRepo.save(employee);

    }
}
