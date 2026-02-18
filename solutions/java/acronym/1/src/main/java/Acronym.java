class Acronym {

    private String mPhrase;

    Acronym(String phrase) {
        mPhrase = phrase;
    }

    String get() {
        String acronym = "";
        String[] splitPhrase = mPhrase.split("\\s+", 0);

        for(String s: splitPhrase) {
            if(s.contains("-")) {
                String[] temp = s.split("-");
                for(String t: temp) {
                    acronym += t.charAt(0);
                }
            } else {
                acronym += s.charAt(0);
            }
        }

        return acronym.toUpperCase();
    }

}