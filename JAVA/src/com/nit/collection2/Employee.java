package com.nit.collection2;

	class Employee{
		private String name;
		private String dept;
		private Long salary;
		private String gender;
		private int age;
		public Employee(String name, String dept, double salary, String gender, int age) {
			super();
			this.name = name;
			this.dept = dept;
			this.salary = (long) salary;
			this.gender = gender;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = (long) salary;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", gender=" + gender + ", age="
					+ age + "]";
		}
		
	}


