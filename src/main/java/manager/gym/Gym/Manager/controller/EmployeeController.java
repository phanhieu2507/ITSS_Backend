package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Employee;
import manager.gym.Gym.Manager.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;
    @GetMapping("/getAllEmployees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return new ResponseEntity<List<Employee>>(employeeService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/")
    public ResponseEntity<String> index(){
        return new ResponseEntity<String>(employeeService.index(),HttpStatus.OK);
    }

    @GetMapping("/saveEmployee")
    public ResponseEntity<String> saveEmployee(){
        return new ResponseEntity<String>(employeeService.saveEmployee(),HttpStatus.CREATED);
    }


}
