package chanllenger.mainChallenge3;

import java.util.Scanner;

import chanllenger.healthChallenge3.Clerk;

public class Start3 {
    public static void main(String[] args) {
        Scanner reading=new Scanner(System.in);

        Clerk juan=new Clerk();
        juan.requestData();
        juan.calculateFee();

        reading.close();
    }
}
