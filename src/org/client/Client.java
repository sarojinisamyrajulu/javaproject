package org.client;

import org.com.Employee;

public class Client extends Employee {

		private void compId() {
			System.out.println("3290871");
		}
		private void compName() {
		System.out.println("TCS");
		}
			
			public static void main(String[] args) {
				Client cc = new Client();
				cc.compName();
				cc.compId();
				cc.empId();
				cc.empName();
				
			}

}

