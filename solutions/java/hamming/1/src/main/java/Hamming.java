class Hamming {

    private String leftStrand, rightStrand;
    private int distance;

    Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        distance = 0;
    }

    int getHammingDistance() {
        if(leftStrand.isEmpty() && rightStrand.isEmpty()) {
            return distance;
        } else {
            for(int i = 0; i < leftStrand.length(); i++) {
                if(leftStrand.charAt(i) != rightStrand.charAt(i)) {
                    distance++;
                }
            }

            return distance;
        }
    }

}