boolean access = true;
		
		String username;
		username = JOptionPane.showInputDialog("please enter your username");
		
		if (username.equalsIgnoreCase("guri"))
		{
			String password;
			password = JOptionPane.showInputDialog("please enter your password");
		
			if(password.equals("Gurveer"))
			{
				JOptionPane.showMessageDialog(null,"Access Granted password");
				access = true;
				
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Incorrect Password");
			}
			if(access = true)
			{
				String currencyType = JOptionPane.showInputDialog("Please enter your currency type ");
				String currency = currencyType.toUpperCase();
				double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount"));
				
				
					switch(currency)
					{
					case "USD":
					double CAD = 1.33;
					double value = amount * CAD;
					
					JOptionPane.showMessageDialog(null,"USD $"+amount+"is equal to CSD $"+ value);
					break;
					case "CSD":
					double USD = 1/1.33;
					value = amount * USD;
					
					JOptionPane.showMessageDialog(null,"CSD $"+amount+"is equal to USD $"+ value);
					break;
					default:
					System.out.println("Invalid Currency");
					break; 
    		}
		
		
		---------------------------------------------------------------------------------------------
		
		
		
		// While------------------
				boolean bob = true;
				int age = 1;
				int number = 0;
				//Loop Bobs age five times
				
				while (bob)//Continue as long as the condition is true
				{
					System.out.println("Bob is  " + age + "year old");
					age++;
					
					if (age >= 6)
						  //bob = false; //ends after this statement is false
						break; //ends the loop
				}
				
				System.out.println("--------------------");
				
				while (number!=100)//continue as long as the condition is true
				{
					System.out.println("The number is  " + number);
					number++;
				}
				
				//do while-----------------
				//Run once.
				//If while is true then loop
				//If while is false then exit
				boolean today = true;
				do//Run once
				{
					System.out.println("Today is true");
					System.out.println("Today is true");
					today = false;
				}
				while (today);//Run until false
				System.out.println("Today is now false");
				
				System.out.println("---------------------------");
				
				int cars = 1;
				do//Run once
				{
				System.out.println("Cars are "+cars);
				cars++;
				}
				while (cars>=5);//Run until false
				System.out.println("-----------------------") ;
				
			  //Nested for Loop
				
			  int ii;
			  int a;
			  for (ii = 100; ii < 105; ii++)// Run once for for every 5 times a runs
			  {
				System.out.println("Out");
				for (a = 100; a < 105; a++)
				{
					System.out.println("In");
				}
			  }
             /*for-----------------------
             for (initialization; test;update)
             Loop until the condition is false
             A number is used to control the loop
             checking for true or false based upon a value*/
			  for (int counter = 0; counter <=5; counter++)
			  {
				  System.out.println("---------------------------------");
				  
				  
			int i ;
			for (i = 100; i < 105; i++)
			{
				if (i == 102)
				{
						continue; //Skips number 102 then continue looping
							
				}
					System.out.println("The numbers are " + i);
			}
			  }
			}

		}
