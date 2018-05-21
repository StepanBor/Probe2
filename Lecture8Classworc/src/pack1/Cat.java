package pack1;

import java.io.Serializable;

public class Cat implements Cloneable, Serializable {
	private int age;
	private String name;
	private String color;
	public Cat(int age, String name, String color) {
		super();
		this.age = age;
		this.name = name;
		this.color = color;
	}
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public Cat clone() throws CloneNotSupportedException {
		
		return (Cat) super.clone();
	}
	
	
	
	

}
