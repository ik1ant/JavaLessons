/*
Демонстрация работы традиционного оператора Switch
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("i равен " + i);
                    break;
                case 1:
                    System.out.println("i равен " + i);
                    break;
                case 2:
                    System.out.println("i равен " + i);
            }
        }
    }
}
