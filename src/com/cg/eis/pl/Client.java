package com.cg.eis.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Client {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		EmployeeService es = new EmployeeServiceImpl();
		do {
			System.out.println();
			System.out.println("-------------------------------------");
			System.out.println("1. Enter employee details");
			System.out.println("2. Get employee details");
			System.out.println("3. Exit");
			System.out.print("Enter your choice : ");
			int ch = Integer.parseInt(in.readLine());
			switch(ch) {
				case 1:
					System.out.println();
					System.out.println("-------------------------------------");
					System.out.println("Enter employee details");
					System.out.println("-------------------------------------");
					System.out.print("Enter employee Id : ");
					int eid = Integer.parseInt(in.readLine());
					System.out.print("Enter employee name : ");
					String name = in.readLine();
					System.out.print("Enter employee salary : ");
					float sal = Float.parseFloat(in.readLine());
					System.out.print("Enter employee designation : ");
					String ds = in.readLine();
					
					Employee eobj = new Employee();
					eobj.setEid(eid);
					eobj.setEname(name);
					eobj.setSal(sal);
					eobj.setDesg(ds);
					es.serviceOffered(eobj);
					
					es.addData(eobj);
					break;
				case 2:
					System.out.println("Employee Details are : ");
					System.out.println("-------------------------------------");
					List<Employee> l = es.printDetails();
					Iterator<Employee> i = l.iterator();
					while(i.hasNext()) {
						Employee e1 = i.next();
						System.out.println(e1.getEid()+" "+e1.getEname()+" "+e1.getSal()+" "+e1.getDesg()+" "+e1.getInsuranceScheme());
						System.out.println("-------------------------------------");
					}
					break;
				case 3:
					System.out.println("Clossing Application...");
					System.exit(0);
				default:
					System.err.println("INVALID CHOICE ENTERED!");
					System.out.println("Enter choice between 1-3");
			}
		}while(true);
	}
}