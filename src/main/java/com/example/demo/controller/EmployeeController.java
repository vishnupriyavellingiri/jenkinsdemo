package com.example.demo.controller;

import com.example.demo.dao.EmployeeRepo;
import com.example.demo.model.ApiResponse;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Locale;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/employee")

public class EmployeeController {

    private  final EmployeeService employeeService;

    private  final EmployeeRepo employeeRepo;
    
    
    public EmployeeController(EmployeeService employeeService, EmployeeRepo employeeRepo) {
    	super();
    	this.employeeService = employeeService;
    	this.employeeRepo = employeeRepo;

    }

   // private final MessageSource messageSource;


    //HATEOAS links are usually for resources (DTOs / Entities), not primitive/final types like String
//    @GetMapping("/{id}")
//    public EntityModel<Employee> findEmployeeById(@PathVariable Long id) {
//
//        Employee emp = employeeService.findEmployeeById(id);
//
//        EntityModel<Employee> entityModel = EntityModel.of(emp);
//
//        entityModel.add(
//                linkTo(methodOn(EmployeeController.class).findAll())
//                        .withRel("get-all")
//        );
//
//        return entityModel;
//    }

//    @PostMapping
//    public ResponseEntity<Void> saveEmp(@RequestBody Employee emp) {
//
//        Employee employee = employeeRepo.save(emp);
//
//        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(employee.getId())
//                .toUri();
//
////        EntityModel<Employee> entityModel = EntityModel.of(employee);
////
////        entityModel.add(
////                linkTo(methodOn(EmployeeController.class).findEmployeeById(employee.getId()))
////                        .withRel("get-by-id")
////        );
//
//        return ResponseEntity.created(uri).build();
//    }


    @GetMapping("/findAll")
    public List<Employee> findAll() {
        List<Employee> emp = employeeRepo.findAll();
        System.out.println();
        return emp;
    }

//    @GetMapping("/getMsg")
//    public String getMsg() {
//        //get from headers Accept-Language else default from message.properties
//        Locale locale = LocaleContextHolder.getLocale();
//        return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
//    }

    @GetMapping("/getEmp")
    public String getEmp() {
        //get from headers Accept-Language else default from message.properties
        return "emp";
    }


}
