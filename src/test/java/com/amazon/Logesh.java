package com.amazon;

public class Logesh {

	private String Name;
	private int Rollnum;
	private int Age;
	
	public int getAge() {
		return Age;
		}
	public int getRollnum() {
		return Rollnum;
	}
	public String getName(){
		return Name;
	}

	public void setAge(int newAge) {
		Age= newAge;
	}
	public void setRollnum(int newRollnum) {
		Rollnum= newRollnum;
	}
	public void setName(String newName) {
		Name= newName;
	}
	public static class TestSample{
		public static void main(String[] args) {
			Logesh s = new Logesh();
			s.setAge(25);
			s.setName("Arun");
			s.setRollnum(1402);
			
			System.out.println("Name" + s.getName());
			System.out.println("Age" + s.getAge());
			System.out.println("Rollnum" + s.getRollnum());
			
		}
	}
}
