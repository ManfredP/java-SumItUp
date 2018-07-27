import java.util.InputMismatchException;
import java.util.Scanner;

class UserDialogue {
    static long getEndNum() {
        long endNum = 0;
        Scanner scn = new Scanner(System.in);
        scn.useDelimiter("\\n");
        boolean inputNOk = true;
        while (inputNOk) {
            System.out.print("Please enter end number: ");
            try {
                endNum = scn.nextLong();
                if (endNum > 0) {
                    inputNOk = false;
                }
            } catch (InputMismatchException ex) {
                scn.nextLine();
            }
        }
        return endNum;
    }
}
