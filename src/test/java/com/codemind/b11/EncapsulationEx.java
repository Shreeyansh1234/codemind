package com.codemind.b11;

public class EncapsulationEx {

	public static void main(String[] args) {
		class A{
			int emp_id;
			String ename;
			void setEmpID(int eid) {
				emp_id=eid;
				
			}
			int getEmpID() {
				return emp_id;
			}
		}
	}

}
