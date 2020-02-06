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
				
