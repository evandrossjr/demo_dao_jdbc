package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();		
		
		System.out.println("===TEST 1: department findById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);

		System.out.println("\n===TEST 2: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		

		System.out.println("\n===TEST 3: department insert ====");
		Department newDepartment = new Department(null,"kids");
		departmentDao.insert(newDepartment);
		System.out.println("Inserido novo departamento " + newDepartment.getId());

		System.out.println("\n===TEST 4: department update ====");
		
		
		
		
		System.out.println("\n===TEST 5: department delete ====");
		System.out.println("Digite o Id a ser deletado: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Departamento Deletado!");
		
		
		sc.close();
		

	}

}
