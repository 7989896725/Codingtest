import java.util.Scanner;
public class harrypotter {
    public static void main(String[] args) {
        String S= " HarryPotterinhismagicalIsland";
        char maxChar = ' ';

        int i , max = -1;

        int freq[] = new int [256];



        for(i=0;i<S.length(); i++)

        {

            freq[S.charAt(i)] ++;

        }

        for(i=0;i<S.length();i++)

        {

            char ch = S.charAt(i);

            if(max<freq[ch]) {

                max = freq[ch];
                maxChar = ch;

            }

        }

        System.out.println("Max Occuring Character =" +maxChar);

    }


    }
