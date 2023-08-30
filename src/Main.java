import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int select, select1, select2;
        double usdToTry, euroToTry, usdToEuro, tryToEuro, tryToUsd, euroToUsd;
        double moneyAmount, currencyMoney;

        usdToTry = 26.7100;
        euroToTry = 29.1784;
        usdToEuro = 0.92;
        tryToEuro = 0.0343;
        tryToUsd = 0.0374;
        euroToUsd = 1.0923;

        label:
        while (true) {
        System.out.println("\nWelcome to the Currency Converter.\n1 - For new currency\n2 - Exit");
        System.out.print("Select: ");
        select = input.nextInt();
            switch (select) {
                case 1:

                    break;
                case 2:
                    break label;
                default:
                    System.out.println("\nUndefined action.");
                    continue;
            }

        System.out.print("\n1 - TL\n2 - USD\n3 - Euro\nSelect the currency you want to enter: ");
        select1 = input.nextInt();

        System.out.print("\n1 - TL\n2 - USD\n3 - Euro\nSelect the currency you want to convert: ");
        select2 = input.nextInt();

        System.out.print("Enter the amount of money: ");
        moneyAmount = input.nextDouble();

            if (select1 == 1 && select2 == 1) {
                System.out.println(moneyAmount + " TRY is " + moneyAmount + " TRY.");
            } else if (select1 == 1 && select2 == 2) {
                currencyMoney = moneyAmount * tryToUsd;
                System.out.println(moneyAmount + "TRY is $" + currencyMoney + ".");
            } else if (select1 == 1 && select2 == 3) {
                currencyMoney = moneyAmount * tryToEuro;
                System.out.println(moneyAmount + "TRY is € " + currencyMoney + ".");
            } else if (select1 == 2 && select2 == 1) {
                currencyMoney = moneyAmount * usdToTry;
                System.out.println("$" + moneyAmount + " is " + currencyMoney + " TRY.");
            } else if (select1 == 2 && select2 == 2) {
                System.out.println("$" + moneyAmount + " is $" + moneyAmount + ".");
            } else if (select1 == 2 && select2 == 3) {
                currencyMoney = moneyAmount * usdToEuro;
                System.out.println("$" + moneyAmount + " is € " + currencyMoney + ".");
            } else if (select1 == 3 && select2 == 1) {
                currencyMoney = moneyAmount * euroToTry;
                System.out.println("€ " + moneyAmount + " is " + currencyMoney + " TRY.");
            } else if (select1 == 3 && select2 == 2) {
                currencyMoney = moneyAmount * euroToUsd;
                System.out.println("€ " + moneyAmount + " is $" + currencyMoney + ".");
            } else if (select1 == 3 && select2 == 3) {
                System.out.println("€ " + moneyAmount + " is € " + moneyAmount + ".");
            } else {
                System.out.println("\nUndefined action.");
            }
        }
    }
}