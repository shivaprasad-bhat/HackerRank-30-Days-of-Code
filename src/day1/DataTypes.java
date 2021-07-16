package day1;

import java.util.Scanner;

/**
 * Input Format
 *
 * The first line contains an integer that you must sum with i.
 * The second line contains a double that you must sum with d.
 * The third line contains a string that you must concatenate with s.
 *
 * Output Format
 *
 * Print the sum of both integers on the first line, the sum of both doubles (scaled to 1 decimal place)
 * on the second line, and then the two concatenated strings on the third line.
 *
 * @author shivaprasadbhat
 */
public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int i1;
        double d1;
        String s1;

        i1 = scan.nextInt();
        d1 = scan.nextDouble();
        scan.nextLine();
        s1 = scan.nextLine();

        System.out.println(i + i1);
        System.out.println(d + d1);
        System.out.println(s + s1);
        scan.close();
    }
}