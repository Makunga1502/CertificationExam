package daysofCode;

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int t = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < t; i++) {
            String s = scan.nextLine();
            char[] charArray = s.toCharArray();


            StringBuilder evenChars = new StringBuilder();
            StringBuilder oddChars = new StringBuilder();

            for (int j = 0; j < charArray.length; j++) {

                if (j % 2 == 0) {
                    evenChars.append(charArray[j]);
                } else {
                    oddChars.append(charArray[j]);
                }
            }


            System.out.println(evenChars.toString() + " " + oddChars.toString());
        }

        scan.close();
    }



}
