//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vaz = new Vehicle();
        vaz.fuelCap = 10;
        vaz.mpg = 5;
        int range = vaz.getRange();
        System.out.println(range);
    }
}