
public class Overridding extends MethodOverridding{
	
	public void savings() {
		System.out.println("savings:1%");
		super.savings();

	}
	
	public static void main(String[] args) {
		Overridding f = new Overridding();
		f.fixed();
		f.savings();
	}
	

}
