import java.util.HashMap;

class Scrabble {

    private String mWord;

    Scrabble(String word) {
        mWord = word;
    }

    int getScore() {
        int score = 0;

        if(mWord.length() == 0) return score;
        else {
            char[] wordCharArray = mWord.toLowerCase().toCharArray();

            for(char c: wordCharArray) {
                score += getCharScore(c);
            }

            return score;
        }
    }

    private static int getCharScore(char c) {
        HashMap<Character, Integer> charScore = new HashMap<>();
        charScore.put('a', 1);
        charScore.put('b', 3);
        charScore.put('c', 3);
        charScore.put('d', 2);
        charScore.put('e', 1);
        charScore.put('f', 4);
        charScore.put('g', 2);
        charScore.put('h', 4);
        charScore.put('i', 1);
        charScore.put('j', 8);
        charScore.put('k', 5);
        charScore.put('l', 1);
        charScore.put('m', 3);
        charScore.put('n', 1);
        charScore.put('o', 1);
        charScore.put('p', 3);
        charScore.put('q', 10);
        charScore.put('r', 1);
        charScore.put('s', 1);
        charScore.put('t', 1);
        charScore.put('u', 1);
        charScore.put('v', 4);
        charScore.put('w', 4);
        charScore.put('x', 8);
        charScore.put('y', 4);
        charScore.put('z', 10);


        return charScore.get(c);
    }

}