package isp.lab3.exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        VendingMachine V1 = new VendingMachine(5);
        V1.displayProducts();
        System.out.println("Hello! Please introduce the 4 digit code to access the menu or press 0 to buy a product.");
        Scanner in = new Scanner(System.in);
        int code = in.nextInt();
        int numberOfTimesForWrongCode = 0;
        if (code == 0) {
            V1.userMenu();
        } else {
            if (code == 2007) {
                V1.adminMenu();
            } else {
                {
                    while (numberOfTimesForWrongCode < 4 && code != 2007) {
                        System.out.println("Wrong code! Try again!");
                        code = in.nextInt();
                        numberOfTimesForWrongCode++;
                    }
                    if (numberOfTimesForWrongCode == 4)
                    System.out.println("Vending Machine out of usage");
                    else{
                        V1.adminMenu();
                    }
                }
            }
        }
    }
}


