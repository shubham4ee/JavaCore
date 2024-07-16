package day7;

import java.util.Objects;

public class Mobile {
	private String make;
	private String model;
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	public Mobile(String make, String model) {
		this.make = make;
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void print() {
		System.out.println("Make: " + make + ", Model: " + model);
	}
	@Override
	public String toString() {
		return "Mobile [make=" + make + ", model=" + model + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(make, model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		return Objects.equals(make, other.make) && Objects.equals(model, other.model);
	}
	
	

}







