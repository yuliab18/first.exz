class Three implements MessageDisplay {
    @Override
    public void displayMessage() {
        int number = 4;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Факторіал числа " + number + " = " + factorial);
    }
}
