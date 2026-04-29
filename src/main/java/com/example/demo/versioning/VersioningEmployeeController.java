package com.example.demo.versioning;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeV2;
import com.example.demo.model.Name;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class VersioningEmployeeController {
//no need application property config

//    @GetMapping("v1/getEmp")
//    public Employee getfirstVersionOfEmployee(){
//        return new Employee(LocalDate.now(),"name","email",1l);
//    }
//
//    @GetMapping("v2/getEmp")
//    public EmployeeV2 getSecondVersionOfEmployee(){
//        return new EmployeeV2(new Name("first","last"),1l);
//    }


    //params versioning
    //http://localhost:8080/ver/employee/param?version=2
    @GetMapping(path = "/employee/param", params = "version=2")
    public Employee getFirstVersionOfPersonParam() {
        return new Employee(LocalDate.now(),"name","email",1l);
    }



    //header versioning
    @GetMapping(path = "/emp/header", headers = "X-API-VERSION=1.0.0")
    public EmployeeV2 getSecondVersionOfPersonHeader() {
        return new EmployeeV2(new Name("first","last"),1l);
    }


   //media type versioning
    @GetMapping(path = "/emp/accept", produces = "application/json;version=1.0.0")
    public EmployeeV2 getSecondVersionOfPersonMediaType() {
        return new EmployeeV2(new Name("first","last"),1l);
    }

}
