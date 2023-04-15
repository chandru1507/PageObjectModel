
import java.util.LinkedHashSet;
import java.util.Set;


public class SetProgg {
	
	public static void main(String[] args) {
		 Set <Integer> se1 = new LinkedHashSet<>();
		 se1.add(10);
		 se1.add(20);
		 se1.add(30);
		 se1.add(40);
		 se1.add(50);
		 se1.add(60);
		 se1.add(70);
		 
		// System.out.println(se1);
		 
		 
		 Set <Integer> se2 = new LinkedHashSet<>();
		 se2.add(80);
		 se2.add(20);
		 se2.add(20);
		 se2.add(40);
		 se2.add(50);
		 se2.add(60);
		 se2.add(20);
		 
		 //System.out.println(se2);
		 
		 se2.addAll(se1);
		// System.out.println(se2);
		 
		 se1.retainAll(se2);
		// System.out.println(se1);
		 
		 se2.removeAll(se1);
		// System.out.println(se2);
		 
		 
		 
		 
		 
		 
		 
	}

}
