public class Main {
    public static void main(String[] args) {
        //First exercise
        String name = "Maria";
        int age =  25;
        double height = 1.68;
        boolean isStudent = true;

        System.out.println("Name: " + name + "\nAge: " + age + "\nHeight: " + height + "\nIs a student: " +isStudent);

        //Second Exercise
        double valorDouble = 19.5;
        System.out.println("The integer value of the product is: " + (int) valorDouble);

        //Third exercise
        double grade1 = 7.5;
        double grade2 = 8.0;
        double grade3 = 9.0;
        double averageGrade = (grade1 + grade2 + grade3) / 3;
        System.out.println("The GPA is: " + averageGrade);

        //Fourth exercise
        int celsius = 20;
        double fahrenheit = ((double)celsius * 9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

        //Fifth exercise
        String title = "The Little Prince";
        String author ="Antoine de Saint-Exupéry";
        int numberOfPages = 96;
        double price = 39.9;
        char fiction = 'F';
        char nonFiction = 'N';
        char technology = 'T';
        char story = 'S';

        System.out.println('Book registered: %s by %s');
    }
}