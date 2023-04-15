
public class MethodOverridding {

	
	public void savings() {
		System.out.println("Savings:10%");
	}
	
	public void fixed() {
		System.out.println("fixed:5%");
	}
	
	public static void main(String[] args) {
		
		MethodOverridding e = new MethodOverridding();
		e.fixed();
		e.savings();
		
	}
}
