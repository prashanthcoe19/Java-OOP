package Tutorial11;

public class NewClass2 {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5 };
        try {
            for (int i = 0; i <= ar.length; i++)
                System.out.println(ar[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index ar[5] does not exists. Starting at 0, the loop must end at 4.");
        }
    }

}
