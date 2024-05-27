
class Two implements MessageDisplay {
    @Override
    public void displayMessage() {
        int a = 5;
        int b = 3;
        System.out.println("Сума чисел " + a + " та" + b + " = " + (a + b));
    }
}