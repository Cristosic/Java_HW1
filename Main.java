package homework;

public class Main {

    public static void main(String[] args) {

        char ch = 'G';
        System.out.println("Character:G");

        int first = 89;
        System.out.println("Integer:89");

        byte second = 4;
        System.out.println("Byte:4");

        short third = 56;
        System.out.println("Short:56");

        float fourth = 4.7333436f;
        System.out.println("Float:4.7333436");

        double fifth = 4.355453532;
        System.out.println("Double:4.355453532");

        long sixth = 12121;
        System.out.println("Long:12121");

        System.out.println("________________________________");

        int num = 345;

        int num1 = num / 100;
        int num2 = num % 100 / 10;
        int num3 = num % 10;
        System.out.println("number 345 -> " + num1 + "," + num2 + "," + num3);

    }
}
