
public class SingleInheri extends SingleInheriparent{

	public void empId() {
		System.out.println("My Empolyee id is:1748");
	}

	
    public void empName() {
    	System.out.println("My Name is:chandru");
    }
    
    public static void main(String[] args) {
		
    	SingleInheri a = new SingleInheri();
    	
        a.empId();
        a.empName();
        a.staffId();
        a.staffName();
        a.workerName();
        a.workerId();
    	
	}
}
