public class MainClass {
    public static void main(String[] args) {
        MessageDisplay one = new One();
        MessageDisplay two = new Two();
        MessageDisplay three = new Three();

        one.displayMessage();
        two.displayMessage();
        three.displayMessage();
    }
}