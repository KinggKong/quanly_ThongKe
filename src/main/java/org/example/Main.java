package org.example;

import org.example.Action.MainAction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainAction mainAction = new MainAction();
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        while (choose != 21) {
            System.out.println("========================MENU==========================");
            System.out.println("Choose feature: ");
            System.out.println("1.Get All Mon an");
            System.out.println("2.Add mon an");
            System.out.println("3.Update mon an");
            System.out.println("4.Delete mon an");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        }
    }
}