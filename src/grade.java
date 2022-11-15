import java.util.Scanner;

// taremwa abdul malik 2021/a/kcs/1113/f
// have made a simple grade system to calculate  grade for students at compass 
public class grade {
    public static void main(String[] args) {

        int marks[] = new int[6];
        int i;
        float total = 0, avg, cgpa;
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < 6; i++) {
            System.out.print("Enter Marks for subject" + (i + 1) + ":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];

        }
        scanner.close();

        // calculating average
        avg = total / 6;
        System.out.print("the student grade is:");

        if (avg >= 80) {
            System.out.print("A");

        } else if (avg >= 60 && avg < 80) {

            System.out.print("B");

        } else if (avg >= 40 && avg < 60) {

            System.out.print("c");
        } else {
            System.out.print("d");
        }

    }
}
