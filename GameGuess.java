public class GameGuess {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        char answer = 'k';

        System.out.println("Задумана буква между A и Z.");
        System.out.print("Попробуйте ее угадать: ");
        ch = (char) System.in.read();
        if (ch == answer) System.out.println("** Правильно! **");
        else System.out.println(" НЕ УГАДАЛ! "); {
            if (ch < answer) System.out.println("Дальше по алфавиту");
            else if (ch != answer) {
                System.out.println("Ближе к началу алфавита");
            }
        }
    }
}