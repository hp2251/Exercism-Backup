import java.util.HashMap;

public class PangramChecker {

    HashMap<Integer, Integer> map = new HashMap<>();
    
    public boolean isPangram(String input) {
        if(input.isEmpty() || input.length() < 26) return false;
        else {
            char[] inputArray = input.toLowerCase().toCharArray();

            for(int i = 0; i < inputArray.length; i++) {
                int c = (int) inputArray[i];
                
                if(c > 96 && c < 123) map.put(c, c);
            }

            if(map.size() == 26) return true;
            
        }
        return false;
    }

}