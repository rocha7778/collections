package stream;

import java.util.Objects;

public class Employee {

	private String title;
	private Integer id;
	private Double salary;
	
	
	
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee() {
		
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(title, other.title);
	}
	
	
	

}
