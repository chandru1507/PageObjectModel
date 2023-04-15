
public class HdfcBank implements RbiBank,WorldBank
{
	public void savings() {
		System.out.println("Savings:3%");
	}
	
	public void  fixed() {
		System.out.println("fixed:15%");
	}

	public static void main(String[] args) {
		HdfcBank h = new HdfcBank();
		h.savings();
		h.fixed();
	}
}
