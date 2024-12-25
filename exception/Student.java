package student.exception;

public class Student {
	private int Id;
	private String Name;
	private String Address;
	private double Percentage;
	private static int idgen=101;
	public Student () {
		Id=idgen;
		idgen++;
	}
	public Student( String name, String address, double percentage) {
		this();
		
		Name = name;
		Address = address;
		Percentage = percentage;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getPercentage() {
		return Percentage;
	}
	public void setPercentage(double percentage) {
		Percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student Id=" + Id + ", Name=" + Name + " ,Address=" + Address + ", Percentage=" + Percentage;
	}


	}
