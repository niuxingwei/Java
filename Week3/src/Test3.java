 
	class Vehicle {
				private double load =0.0;
				private double maxLoad;
				
				public Vehicle(double maxLoad)
				{
					this.maxLoad = maxLoad;
				}
				@SuppressWarnings("unused")
				private double kiloToNewts(double weight)
				{
				     return (weight * 9.8);
				}
				
				@SuppressWarnings("unused")
				private double newtsToKilo(double weight)
				{
				       return (weight / 9.8);
				} 
				
			

			    public double getLoad ()
				    {
				    	return maxLoad;
				    }
				    
			    public double getMaxLoad()
				    {
				    	return 0;
				    }
			    public boolean addBox( double weight)
			    {
			    		load=	weight + load; 
			    	if( load>maxLoad )
			    	{
			    		load = load - weight;
			    		return false;
			    	
			    	}
			    	else  
			    	{
			      		return true;
			    	}
			    }
			}
		 
	 
		 
	 
	 
	 /* PRESET CODE BEGIN - NEVER TOUCH CODE BELOW */

	 public class Test3 {
		 
	   public static void main(String[] args) {

	     // Create a vehicle that can handle 10,000 kilograms weight
	     System.out.println("Creating a vehicle with a 10,020kg maximum load.");
	     Vehicle vehicle = new Vehicle(10020.0);

	     // Add a few boxes
	     System.out.println("Add box #1 (500kg) : " + vehicle.addBox(500.0));
	     System.out.println("Add box #2 (250kg) : " + vehicle.addBox(250.0));
	     System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000.0));
	     System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000.0));
	     System.out.println("Add box #5 (300kg) : " + vehicle.addBox(300.0));
	     System.out.println("Add box #5 (270kg) : " + vehicle.addBox(270.0));

	     // Print out the final vehicle load
	     System.out.println("Vehicle load is " + vehicle.getLoad() + " kg");
	   }
	 }

	 /* PRESET CODE END - NEVER TOUCH CODE ABOVE */