package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        /*
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        */
        // calculateIngredients();
        // calculateCups();
        buyFillTake();
    }
    /*
    public static void calculateIngredients() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need:");

        int cups = scanner.nextInt();
        int water = cups * 200; //[ml]
        int milk = cups * 50; // [ml]
        int beans = cups * 15; // [g]
        System.out.printf("For %d cups of coffee you will need:%n" , cups);
        System.out.printf("%d ml of water %n" , water);
        System.out.printf("%d ml of milk %n" , milk);
        System.out.printf("%d g of coffee beans %n" , beans);
    }
     */

    /*
    public static void calculateCups() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int waterAvailable = scanner.nextInt(); // [ml]
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkAvailable = scanner.nextInt(); // [ml]
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beansAvailable = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeeded = scanner.nextInt();

        // calculate each ingredient per cup
        int cupsPerWater = waterAvailable/200;
        int cupsPerMilk = milkAvailable/50;
        int cupsPerBeans = beansAvailable/15;

        int cupsMax = Math.min(Math.min(cupsPerWater,cupsPerMilk),cupsPerBeans);

        if (cupsNeeded == 0 || cupsNeeded == cupsMax) {
            System.out.println("Yes, I can make that amount of coffee");
            }
            else if (cupsMax < cupsNeeded) {
            System.out.printf("No, I can make only %d cup(s) of coffee %n", cupsMax);
            }
            else {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that) %n", cupsMax-cupsNeeded);
            }
        }

     */

    public static void buyFillTake() {

        boolean machineOn = true;
        // keep machine state in array of size 5
        // populate array with initial values
        int coffeeMachine[] = new int[5];

        coffeeMachine[0] = 550; //[$] cash
        coffeeMachine[1] = 400; //[ml] water
        coffeeMachine[2] = 540; //[ml] milk
        coffeeMachine[3] = 120; //[g] beans
        coffeeMachine[4] = 9; //[pieces] cups

        // printMachineState(coffeeMachine);
        // System.out.println();

        while (machineOn) {

            String action = selectAction();

            switch (action) {
                case "buy":
                    buyCoffee(coffeeMachine);
                    break;
                case "fill":
                    fillMachine(coffeeMachine);
                    break;
                case "take":
                    takeCash(coffeeMachine);
                    break;
                case "remaining":
                    printMachineState(coffeeMachine);
                    break;
                case "exit":
                    machineOn = false;
                    break;
                default:
                    System.out.println("not a valid action");
            }
        }
    }

    public static void printMachineState(int coffeeMachine[]) {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water %n", coffeeMachine[1]);
        System.out.printf("%d ml of milk %n", coffeeMachine[2]);
        System.out.printf("%d g of coffee beans %n", coffeeMachine[3]);
        System.out.printf("%d disposable cups %n", coffeeMachine[4]);
        System.out.printf("$%d of money %n", coffeeMachine[0]);
        System.out.println();
    }

    public static String selectAction() {

        String action = "wrong input";

        System.out.println("Write action (buy, fill, take, remaining, exit):");

        Scanner scanner = new Scanner(System.in);
        action = scanner.nextLine();

        return action;
    }

    public static void buyCoffee(int coffeeMachine[]) {

        // array: cash - 0, water - 1, milk - 2, beans - 3, cups -4
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

        Scanner scanner = new Scanner(System.in);
        String coffeeType = scanner.nextLine();

        int water = 0;
        int milk = 0;
        int beans = 0;
        int cups = 0;

        if (!coffeeType.equals("back")) {

            // System.out.println(coffeeType);

            int number = Integer.parseInt(coffeeType);

            switch (number) {
                case 1:
                    water = coffeeMachine[1] - 250;
                    // milk = coffeeMachine[2] - 0;
                    beans = coffeeMachine[3] - 16;
                    cups = coffeeMachine[4] - 1;
                    if (water <= 0) {
                        System.out.println("Sorry, not enough water!");
                        //coffeeMachine[1] = 0;
                        System.out.println();
                    } else if (beans <= 0) {
                        System.out.println("Sorry, not enough beans!");
                        //coffeeMachine[3] = 0;
                        System.out.println();
                    } else if (cups <= 0) {
                        System.out.println("Sorry, not enough cups!");
                        //coffeeMachine[4] = 0;
                        System.out.println();
                    } else {
                        System.out.println("I have enough resources, making you a coffee!");
                        coffeeMachine[0] = coffeeMachine[0] + 4;
                        coffeeMachine[1] = coffeeMachine[1] - 250;
                        // coffeeMachine[2] = coffeeMachine[2] - 0;
                        coffeeMachine[3] = coffeeMachine[3] - 16;
                        coffeeMachine[4] = coffeeMachine[4] - 1;
                        System.out.println();
                    }
                    break;
                case 2:
                    water = coffeeMachine[1] - 250;
                    milk = coffeeMachine[2] - 0;
                    beans = coffeeMachine[3] - 16;
                    cups = coffeeMachine[4] - 1;
                    if (water <= 0) {
                        System.out.println("Sorry, not enough water!");
                        //coffeeMachine[1] = 0;
                        System.out.println();
                    } else if (milk <= 0) {
                        System.out.println("Sorry, not enough milk!");
                        //coffeeMachine[2] = 0;
                        System.out.println();
                    } else if (beans <= 0) {
                        System.out.println("Sorry, not enough beans!");
                        //coffeeMachine[3] = 0;
                        System.out.println();
                    } else if (cups <= 0) {
                        System.out.println("Sorry, not enough cups!");
                        //coffeeMachine[4] = 0;
                        System.out.println();
                    } else {
                        System.out.println("I have enough resources, making you a coffee!");
                        coffeeMachine[0] = coffeeMachine[0] + 7;
                        coffeeMachine[1] = coffeeMachine[1] - 350;
                        coffeeMachine[2] = coffeeMachine[2] - 75;
                        coffeeMachine[3] = coffeeMachine[3] - 20;
                        coffeeMachine[4] = coffeeMachine[4] - 1;
                        System.out.println();
                    }
                    break;
                case 3:
                    water = coffeeMachine[1] - 200;
                    milk = coffeeMachine[2] - 100;
                    beans = coffeeMachine[3] - 12;
                    cups = coffeeMachine[4] - 1;
                    if (water <= 0) {
                        System.out.println("Sorry, not enough water!");
                        //coffeeMachine[1] = 0;
                        System.out.println();
                    } else if (milk <= 0) {
                        System.out.println("Sorry, not enough milk!");
                        //coffeeMachine[2] = 0;
                        System.out.println();
                    } else if (beans <= 0) {
                        System.out.println("Sorry, not enough beans!");
                        //coffeeMachine[3] = 0;
                        System.out.println();
                    } else if (cups <= 0) {
                        System.out.println("Sorry, not enough cups!");
                        //coffeeMachine[4] = 0;
                        System.out.println();
                    } else {
                        System.out.println("I have enough resources, making you a coffee!");
                        coffeeMachine[0] = coffeeMachine[0] + 6;
                        coffeeMachine[1] = coffeeMachine[1] - 200;
                        coffeeMachine[2] = coffeeMachine[2] - 100;
                        coffeeMachine[3] = coffeeMachine[3] - 12;
                        coffeeMachine[4] = coffeeMachine[4] - 1;
                        System.out.println();
                    }
                    break;
            }
        }

        // return coffeeParams;
    }

    public static void fillMachine(int coffeeMachine[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println("Write how many ml of water you want to add:");
        coffeeMachine[1] = coffeeMachine[1] + scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        coffeeMachine[2] = coffeeMachine[2] + scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeMachine[3] = coffeeMachine[3] + scanner.nextInt();

        System.out.println("Write how many disposable cups you want to add:");
        coffeeMachine[4] = coffeeMachine[4] + scanner.nextInt();

        System.out.println();

        /*
        for (int i=1; i<5; i++) {
            System.out.println(i+" >>> "+coffeeMachine[i]);
        }
        */

    }

    public static void takeCash (int coffeeMachine[]) {

        System.out.println();

        System.out.printf("I gave you $%d  %n", coffeeMachine[0]);
        System.out.println();
        coffeeMachine[0] = 0;
    }
}