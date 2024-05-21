public class HelpJava {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Справка по");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.print("Выберите вариант: ");

        char choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор");
                System.out.println("else оператор");
                break;
            case '2':
                System.out.println("Традиционный оператор switch");
                System.out.println("switch(выражение) {");
                System.out.println("\tcase константа {");
                System.out.println("\t\tпоследовательность операторов");
                System.out.println("\t\tbreak");
                System.out.println("\t\t//...");
                System.out.println("}");
                break;
            default:
                System.out.println("Выбранный варинат не найден");
        }
    }
}
