public class Exam2 {
    public static void main(String[] args) {
        int y = 3;

        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= y - i; j++) {
                System.out.print(" ");
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");}
                for (int u =0; u<= 2*y-2; u++)
                System.out.println();
            }

        }

    }
}
