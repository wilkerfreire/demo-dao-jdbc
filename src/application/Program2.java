package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		/*System.out.println("===== TEST 1 : department insert =====");
		Department newDep = new Department(null, "D3");
		depDao.insert(newDep);
		System.out.println("Department inserted!");*/
		
		/*System.out.println("===== TEST 2 : department findById =====");
		Department dep = depDao.findById(1);
		System.out.println(dep);*/
		
		/*System.out.println("===== TEST 3 : department update =====");
		Department dep = depDao.findById(6);
		dep.setName("Enviroment");
		depDao.update(dep);
		System.out.println("Update completed!");*/
		
		/*System.out.println("===== TEST 4 : department deleteById =====");
		depDao.deleteById(7);
		System.out.println("Delete completed!");*/
		
		System.out.println("===== TEST 5 : department findAll =====");
		List<Department> depList = depDao.findAll();
		for(Department d : depList)
			System.out.println(d);
		
	}

}
