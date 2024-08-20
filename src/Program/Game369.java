package Program;

public class Game369 {

	public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            String numberStr = String.valueOf(i);
            int count = 0;
            
            for (int j = 0; j < numberStr.length(); j++) {
                char digit = numberStr.charAt(j);
                if (digit == '3' || digit == '6' || digit == '9') {
                    count++;
                }
            }
            
            if (count > 0) {
                for (int k = 0; k < count; k++) {
                    System.out.print("♥");
                }
            } else {
                System.out.print(i);
            }
            
            System.out.print(" ");
        }
    }
}
