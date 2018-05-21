package pack1;

public class Obj <T extends Comparable<T>> {
	private T someObj;

	public Obj(T someObj) {
		super();
		this.someObj = someObj;
	}
	

	public Obj() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Object getSomeObj() {
		return someObj;
	}

	public void setSomeObj(T someObj) {
		this.someObj = someObj;
	}
	

}
