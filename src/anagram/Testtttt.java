package anagram;

public class Testtttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] number = {1,2,3,1};
		var reuslt = odd_even_product(number);
		
		//System.out.println(reuslt);
		
		
		String[] doorFittings = {"Door to 7th heaven"};
        String[] codes = {"1301"};

        //String result = door(doorFittings, codes);
        
        String result3 = door3(new String[] {"Portal 1","Portal 2","Portal 3",}, new String[] {"501",});
        
       
        System.out.println(result3);
		
		

	}
	
	public static Integer odd_even_product( Integer[] my_list ) {
		//Insert your code here
		
		int product = 1;
		int acumlator =0;
		
		for(int i=0; i< my_list.length; i++){
			product = my_list[i] * product;
			acumlator = acumlator + my_list[i];
		}
		
		if(product%2==0) {
			return acumlator;
		}else {
			return 0;
		}
		
	}
	
	public static String door( String[] door_fitting, String[] codes ) {
		
		StringBuilder output = new StringBuilder();

        for (int i = 0; i < door_fitting.length; i++) {
            String doorFitting = door_fitting[i];
            String code = codes[i];

            int lowercaseCount = countLowercaseLetters(doorFitting);
            boolean containsRoom = doorFitting.toLowerCase().contains("room");
            int digitCount = countDigits(doorFitting);

            String doorCode = String.format("%d%d%d", lowercaseCount, containsRoom ? 1 : 0, digitCount);
            output.append(doorFitting).append(" - ").append("Key code ").append(code).append(";");

            if (!code.equals(doorCode)) {
                System.out.println("Warning: Key code mismatch for door fitting: " + doorFitting);
            }
        }

        return output.toString();
	}
	
	
	public static int countLowercaseLetters(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                count++;
            }
        }
        return count;
    }

    private static int countDigits(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
    
    
    public static String door3(String[] door_fitting, String[] codes) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < door_fitting.length; i++) {
            String doorFitting = door_fitting[i];

            // Check if index i is within the bounds of the codes array
            String code = (i < codes.length) ? codes[i] : "DEFAULT_CODE";

            int lowercaseCount = countLowercaseLetters(doorFitting);
            boolean containsRoom = doorFitting.toLowerCase().contains("room");
            int digitCount = countDigits(doorFitting);

            String doorCode = String.format("%d%d%d", lowercaseCount, containsRoom ? 1 : 0, digitCount);
            output.append(doorFitting).append(" - ").append("Key code ").append(code).append(";");

            if (!code.equals(doorCode)) {
                System.out.println("Warning: Key code mismatch for door fitting: " + doorFitting);
            }
        }

        return output.toString();
    }
	
	
	

}
