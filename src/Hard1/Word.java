package Hard1;

public class Word {
    private String word;
    private boolean[] guessedLetters;

    public Word(String word) {
        this.word = word.toLowerCase();
        this.guessedLetters = new boolean[word.length()];
    }

    public boolean checkLetter(char letter) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedLetters[i] = true;
                found = true;
            }
        }
        return found;

    }

    public String getCurrentState() {
        StringBuilder currentState = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (guessedLetters[i]) {
                currentState.append(word.charAt(i));
            } else {
                currentState.append("_");
            }
            currentState.append(" ");
        }
        return currentState.toString().trim();
    }

    public boolean isWordGuessed() {
        for (boolean guessed : guessedLetters) {
            if (!guessed) {
                return false;
            }
        }
        return true;

    }
}
