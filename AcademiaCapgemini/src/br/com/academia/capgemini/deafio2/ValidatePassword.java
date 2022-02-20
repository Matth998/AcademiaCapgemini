<<<<<<< HEAD
package br.com.academia.capgemini.deafio2;

public class ValidatePassword {
	
	public static boolean validateDigit(String password) {
		
		 if (password.length() < 6) return false;

		    boolean validateNumber = false;
		    boolean validateUpperCase = false;
		    boolean validateLowerCase = false;
		    boolean validateSymbol = false;
		    
		    for (char c : password.toCharArray()) {
		         if (c >= '0' && c <= '9') {
		        	 validateNumber = true;
		         } else if (c >= 'A' && c <= 'Z') {
		        	 validateUpperCase = true;
		         } else if (c >= 'a' && c <= 'z') {
		        	 validateLowerCase = true;
		         } else {
		        	 validateSymbol = true;
		         }
		    }
		    return validateNumber && validateUpperCase && validateLowerCase && validateSymbol;
	
	}
	
	public static void passwordValidated(String password) {
	
		if(validateDigit(password) == true) {
			
			System.out.println("User Criated!");
			
		}else {
			
			System.out.println("Password invalid! Check if it meets the requirements"
					+ "\nIt has at least 6 characters.\r\n"
					+ "\nnContains at least 1 digit.\r\n"
					+ "\nContains at least 1 letter in.\r\n"
					+ "\nContains at least 1 capital letter.\r\n"
					+ "\nContains at least 1 special character. The special characters are: !@#$%^&*()-+");
			
		}
	}
}
=======
package br.com.academia.capgemini.deafio2;

public class ValidatePassword {
	
	public static boolean validateDigit(String password) {
		
		 if (password.length() < 6) return false;

		    boolean validateNumber = false;
		    boolean validateUpperCase = false;
		    boolean validateLowerCase = false;
		    boolean validateSymbol = false;
		    
		    for (char c : password.toCharArray()) {
		         if (c >= '0' && c <= '9') {
		        	 validateNumber = true;
		         } else if (c >= 'A' && c <= 'Z') {
		        	 validateUpperCase = true;
		         } else if (c >= 'a' && c <= 'z') {
		        	 validateLowerCase = true;
		         } else {
		        	 validateSymbol = true;
		         }
		    }
		    return validateNumber && validateUpperCase && validateLowerCase && validateSymbol;
	
	}
	
	public static void passwordValidated(String password) {
	
		if(validateDigit(password) == true) {
			
			System.out.println("User Criated!");
			
		}else {
			
			System.out.println("Password invalid! Check if it meets the requirements"
					+ "\nIt has at least 6 characters.\r\n"
					+ "\nnContains at least 1 digit.\r\n"
					+ "\nContains at least 1 letter in.\r\n"
					+ "\nContains at least 1 capital letter.\r\n"
					+ "\nContains at least 1 special character. The special characters are: !@#$%^&*()-+");
			
		}
	}
}
>>>>>>> 43554ae8d23f8cd51390507c54ced6275656befd
