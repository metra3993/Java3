import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длины сторон треугольника:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (!isValidTriangle(a, b, c)) {
            System.out.println(formatTriangleSides(a, b, c) + " не являются сторонами треугольника");
        } else {
            if (isRightTriangle(a, b, c)) {
                System.out.println(formatTriangleSides(a, b, c) + " являются сторонами прямоугольного треугольника");
            } else if (isEquilateralTriangle(a, b, c)) {
                System.out.println(formatTriangleSides(a, b, c) + " являются сторонами равностороннего треугольника");
            } else if (isIsoscelesTriangle(a, b, c)) {
                System.out.println(formatTriangleSides(a, b, c) + " являются сторонами равнобедренного треугольника");
            } else {
                System.out.println(formatTriangleSides(a, b, c) + " являются сторонами обычного треугольника");
            }
        }

        scanner.close();
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        return (a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b);
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || b == c || c == a;
    }

    public static String formatTriangleSides(int a, int b, int c) {
        return a + ", " + b + " и " + c;
    }
}
