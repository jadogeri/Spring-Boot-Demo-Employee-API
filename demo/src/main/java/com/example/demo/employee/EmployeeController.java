package com.example.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
    @PostMapping
    public void registerNewEmployee(@RequestBody Employee employee) {
        employeeService.addNewEmployee(employee);
    }

    @DeleteMapping(path = "{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
    }

    @PutMapping(path = "{employeeId}")
    public void updateEmployee(
            @PathVariable("employeeId") Long employeeId,
            @RequestBody(required = false) Employee employee ) {
        String email = employee.getEmail();
        String firstName = employee.getFirstName();
        String lastName = employee.getLastName();

        System.out.println("email:" + email);
        System.out.println("firstName:" + firstName);
        System.out.println("lastName:" + lastName);
        System.out.println("employeeId:" + employeeId);
        employeeService.updateEmployee(employeeId, firstName, lastName, email);
    }
}
