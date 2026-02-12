class ReverseString {

    String reverse(String inputString) {
        if(inputString.isEmpty()) return "";
        else if(inputString.length() == 1) return inputString;
        else {
            return reverse(inputString.substring(1)) + inputString.charAt(0);
        }
    }
  
}