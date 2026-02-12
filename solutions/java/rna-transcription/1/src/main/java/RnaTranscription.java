import java.util.HashMap;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        String result = "";

        for (char c : dnaStrand.toCharArray()) {
             result += String.valueOf(getComplement(c));
        }

        return result;
    }

    static String getComplement(char c) {
        HashMap<Character, Character> complement = new HashMap<>();
        complement.put('G', 'C');
        complement.put('C', 'G');
        complement.put('T', 'A');
        complement.put('A', 'U');

        return String.valueOf(complement.get(c));
    }

}