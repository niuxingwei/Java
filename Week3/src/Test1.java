 
	class Vehicle1{
			private double load =0.0;
			private double maxLoad;
		
				
			public Vehicle1(double maxLoad)
				{
					this.maxLoad = maxLoad;
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
		    	
		      		return true;
		      		
		    }
		
	}
	 
	
		 