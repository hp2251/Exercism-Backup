import java.util.ArrayList;
import java.util.HashMap;

class RaindropConverter {

    String convert(int number) {
        String result = "";

        ArrayList<Integer> factors = new ArrayList<>();

        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                factors.add(i);
            }
        }

        for(int y = 0; y < factors.size(); y++) {
            int cur = factors.get(y);
            if(isItRaindrop(cur)) {
                result += getRaindropString(cur);
            }
        }

        if(result.equals("")) result = String.valueOf(number);

        return result;
    }

    private static boolean isItRaindrop(int digit) {
        ArrayList<Integer> digits = new ArrayList<>();
        digits.add(3);
        digits.add(5);
        digits.add(7);

        if(digits.contains(digit)) return true;

        return false;
    }

    private static String getRaindropString(int digit) {
        HashMap<Integer, String> raindrops = new HashMap<>();
        raindrops.put(3, "Pling");
        raindrops.put(5, "Plang");
        raindrops.put(7, "Plong");

        return raindrops.get(digit);
    }
}