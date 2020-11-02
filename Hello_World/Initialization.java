public class Initialization {

    public static void main(String[] args) {
        Check check = new Check();
        System.out.println("Uninitialized int: " + check.checkInt);
        System.out.println("Uninitialized char: " + check.checkChar);
    }
}

class Check
{
    int checkInt;
    char checkChar;
}