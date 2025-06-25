package Hard1;

public class Hangman {
        private int maxMistakes = 6;
        private int mistakeCount = 0;

        public void makeStep() {
            mistakeCount++;
        }

        public boolean isGameOver() {
            return mistakeCount >= maxMistakes;
        }

        public void draw() {
            switch (mistakeCount) {
                case 0:
                    System.out.println("Ошибок: 0");
                    System.out.println("_________");
                    System.out.println("|       |");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("-------------");
                    break;
                case 1:
                    System.out.println("Ошибок: 1");
                    System.out.println("_________");
                    System.out.println("|       |");
                    System.out.println("|       O");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("-------------");
                    break;
                case 2:
                    System.out.println("Ошибок: 2");
                    System.out.println("_________");
                    System.out.println("|       |");
                    System.out.println("|       O");
                    System.out.println("|       |");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("-------------");
                    break;
                case 3:
                    System.out.println("Ошибок: 3");
                    System.out.println("_________");
                    System.out.println("|       |");
                    System.out.println("|       O");
                    System.out.println("|      /|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("-------------");
                    break;
                case 4:
                    System.out.println("Ошибок: 4");
                    System.out.println("_________");
                    System.out.println("|       |");
                    System.out.println("|       O");
                    System.out.println("|      /|\\");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("-------------");
                    break;
                case 5:
                    System.out.println("Ошибок: 5");
                    System.out.println("_________");
                    System.out.println("|       |");
                    System.out.println("|       O");
                    System.out.println("|      /|\\");
                    System.out.println("|      /");
                    System.out.println("|");
                    System.out.println("-------------");
                    break;
                case 6:
                    System.out.println("Ошибок: 6");
                    System.out.println("_________");
                    System.out.println("|       |");
                    System.out.println("|       O");
                    System.out.println("|      /|\\");
                    System.out.println("|      / \\");
                    System.out.println("|");
                    System.out.println("-------------");
                    break;
            }
        }
    }
