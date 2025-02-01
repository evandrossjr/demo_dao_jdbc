package application;

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

		System.out.println("\n===TEST 2: department findByDepartment ====");

		System.out.println("\n===TEST 3: department findByAll ====");

		System.out.println("\n===TEST 4: department insert ====");
		Department newDepartment = new Department(null,"kids");
		departmentDao.insert(newDepartment);
		System.out.println("Inserido novo departamento " + newDepartment.getId());

		System.out.println("\n===TEST 5: department update ====");

		System.out.println("\n===TEST 6: department delete ====");

	}

}
