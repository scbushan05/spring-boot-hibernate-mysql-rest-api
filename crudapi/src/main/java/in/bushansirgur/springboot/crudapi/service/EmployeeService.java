package in.bushansirgur.springboot.crudapi.service;

import java.util.List;

import in.bushansirgur.springboot.crudapi.model.Employee;

public interface EmployeeService {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id); 
}
