import java.util.*;
public class CC1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String sentance;
        double S;
        double L;
        int words=0;
        int sentances=0;
        int index;
        sentance=input.nextLine();
        for (int i = 0; i < sentance.length(); i++) {
            if (sentance.charAt(i) == ' ') {
                words++;
            }
        }
        for (int i = 0; i < sentance.length(); i++) {
            if (sentance.charAt(i) == '.'|| sentance.charAt(i) == '!' || sentance.charAt(i) == '?') {
                sentances++;
            }
        }
        words++;
        S=((double)(sentances)/words*100);
     
        L=((double)sentance.replaceAll("[^a-zA-Z]", "").length())/words*100;
        index= (int)((0.0588 * L) - (0.296 * S) - 15.8);
        System.out.println("Grade: "+index+"!");
        

    }
}
