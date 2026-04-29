//package com.example.demo.versioning;
//
//import com.example.demo.model.Employee;
//import com.example.demo.model.EmployeeV2;
//import com.example.demo.model.Name;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.time.LocalDate;
//
//@RestController
//public class VersioningSBEmployeeController {
////must need application.property configuration
//
////    @GetMapping("v1/getEmp")
////    public Employee getfirstVersionOfEmployee(){
////        return new Employee(LocalDate.now(),"name","email",1l);
////    }
////
////    @GetMapping("v2/getEmp")
////    public EmployeeV2 getSecondVersionOfEmployee(){
////        return new EmployeeV2(new Name("first","last"),1l);
////    }
//
//
//    //params versioning
//    //instead this   @GetMapping(path = "/person", params = "version=1")
//    // we use in version = spring.mvc.apiversion.use.query-parameter=version
//    @GetMapping(path = "/sb/person", version = "2.0.0")
//    public Employee getFirstVersionOfPersonParam() {
//        return new Employee(LocalDate.now(),"name","email",1l);
//    }
//
//    //path versioning || spring.mvc.apiversion.use.path-segment=0
//    @GetMapping(value = "/sb/{version}/person", version = "2.0.0")
//    public EmployeeV2 getSecondVersionOfPersonRequestPath() {
//        return new EmployeeV2(new Name("first","last"),1l);
//    }
//
//    //header versioning
//    // instead @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
//    //spring.mvc.apiverison.use.header=X-API-VERSION
//    @GetMapping(path = "/sb/person/header", version = "1.0.0")
//    public EmployeeV2 getSecondVersionOfPersonHeader() {
//        return new EmployeeV2(new Name("first","last"),1l);
//    }
//
//
//    //Accept:application/json;version=2
//    // instead @GetMapping(path = "/person/accept", produces = "application/json;version=1.0.0")
//    //spirng.mvc.apiversion.use.media-type-parameter[application/json]=version
//    @GetMapping(path = "/sb/person/accept", version = "1.0.0")
//    public EmployeeV2 getSecondVersionOfPersonMediaType() {
//        return new EmployeeV2(new Name("first","last"),1l);
//    }
//
//}
