import java.util.LinkedHashMap;
import java.util.Map;

public class MapProg {
	
	public static void main(String[] args) {
		
		Map <Integer,String> mp1= new LinkedHashMap<>();
		
		mp1.put(10, "Chandru");
		mp1.put(20, "Boss");
		mp1.put(50,"out");
		mp1.put(60,"not");
		mp1.put(70,"real");
		mp1.put(5, "Chandru");
		System.out.println(mp1);
		
	}

}
