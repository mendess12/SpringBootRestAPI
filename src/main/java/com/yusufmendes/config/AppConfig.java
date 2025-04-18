package com.yusufmendes.config;

import com.yusufmendes.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "Yusuf", "Mendes"));
        employeeList.add(new Employee("2", "Efe", "Can"));
        employeeList.add(new Employee("3", "Elif", "Arya"));
        employeeList.add(new Employee("4", "Mirza", "Yonel"));
        employeeList.add(new Employee("5", "Aysu", "Yıldız"));

        return employeeList;
    }
}
