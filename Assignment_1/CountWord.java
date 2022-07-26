package Assignment_1;
import java.util.Scanner;

public class CountWord {

    public static String[] inputWords() {
        String[] words = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words you want to count : \n");
        System.out.print("Enter the first Word : ");
        words[0] = sc.next();
        System.out.print("Enter the second Word : ");
        words[1] = sc.next();
        System.out.print("Enter the third Word : ");
        words[2] = sc.next();
        return words;
    }

    public static int[] wordsount(String urlword, String[] words, int[] countword) {
        String[] split = urlword.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (words[0].equals(split[i])) {
                countword[0]++;
            }
            if (words[1].equals(split[i])) {
                countword[1]++;
            }
            if (words[2].equals(split[i])) {
                countword[2]++;
            }
        }
        return countword;
    }


}
    

