
public class Test1 {

	private int a;
	
	public Test1(int a){
		this.a=a;
	}

	public void setA(int a){
		this.a = a;
	}
	
	public int getA(){
		return a;
	}
	
	public String toString(){
		String s = Integer.toString(getA());
		return s;
	}
}
