import java.util.*;
public class CC1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word;
        double S;
        double L;
        int words=0;
        int sentances=0;
        int index;
        word=input.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                words++;
            }
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '.'|| word.charAt(i) == '!' || word.charAt(i) == '?') {
                sentances++;
            }
        }
        words++;
        S=((double)(sentances)/words*100);
     
        L=((double)word.replaceAll("[^a-zA-Z]", "").length())/words*100;
        index= (int)((0.0588 * L) - (0.296 * S) - 15.8);
        System.out.println(index);
        

    }
}
