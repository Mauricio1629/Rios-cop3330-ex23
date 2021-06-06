/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex23;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        myApp.TroubleShoot();
    }

    public void TroubleShoot() {
        System.out.print("Is the car silent when you turn the key? ");
        if(in.hasNext("y")) {
            in.nextLine();
            System.out.print("Are the battery terminals corroded? ");
            if(in.hasNext("y")) {
                System.out.print("Clean terminals and try starting again.");
                System.exit(0);
            } else {
                System.out.print("Replace cables and try again.");
                System.exit(0);
            }
        } else {
            System.out.print("Does the car make a slicking noise? ");
            in.nextLine();
            if(in.hasNext("y")) {
                System.out.print("Replace the battery.");
                System.exit(0);
            } else {
                System.out.print("Does the car crank up but fail to start? ");
                in.nextLine();
                if(in.hasNext("y")) {
                    System.out.print("Check spark plug connections.");
                    System.exit(0);
                } else {
                    System.out.print("Does the engine start and then die? ");
                    in.nextLine();
                    if(in.hasNext("y")) {
                        System.out.print("Does you car have fuel injection? ");
                        in.nextLine();
                        if(in.hasNext("y")) {
                            System.out.print("Get it in for service.");
                            System.exit(0);
                        } else {
                            System.out.print("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    } else {
                        System.out.print("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }
}








