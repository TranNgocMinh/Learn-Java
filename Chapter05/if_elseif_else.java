public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int time = 19;
		String greeting ="";
		if (time < 10) {
		    greeting = "Good morning";
		}
		else if (time < 20) { 
		    greeting = "Good day";
		}
		else { 
		      greeting = "Good evening";
		}
		System.out.print(greeting);
  }
