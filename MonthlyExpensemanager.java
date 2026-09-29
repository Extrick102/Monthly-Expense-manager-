import java.util.Scanner;

public class MonthlyExpenseManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        char currency = '$';
        boolean budgetChecked = true;

        int rent;
        double monthlyIncome;
        double groceries;
        double transportation;
        double phone;
        double internet;
        double entertainment;
        double schoolExpenses;
        double savings;
        double clothing;
        double personalCare;

        float weeklyExpenses;
        long totalExpensesLong;
        short expenseCount = 10;
        byte monthNumber = 1;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your monthly income: ");
        monthlyIncome = input.nextDouble();

        System.out.print("Enter your monthly rent or housing: ");
        rent = input.nextInt();

        System.out.print("Enter your grocery expenses: ");
        groceries = input.nextDouble();

        System.out.print("Enter your transportation expenses: ");
        transportation = input.nextDouble();

        System.out.print("Enter your phone expenses: ");
        phone = input.nextDouble();

        System.out.print("Enter your internet expenses: ");
        internet = input.nextDouble();

        System.out.print("Enter your entertainment expenses: ");
        entertainment = input.nextDouble();

        System.out.print("Enter your school expenses: ");
        schoolExpenses = input.nextDouble();

        System.out.print("Enter your savings: ");
        savings = input.nextDouble();

        System.out.print("Enter your clothing expenses: ");
        clothing = input.nextDouble();

        System.out.print("Enter your personal care expenses: ");
        personalCare = input.nextDouble();

        double totalExpenses = rent + groceries + transportation + phone
                + internet + entertainment + schoolExpenses + savings
                + clothing + personalCare;

        double remainingMoney = monthlyIncome - totalExpenses;

        weeklyExpenses = (float) (totalExpenses / 4.0);

        int roundedExpenses = (int) totalExpenses;

        totalExpensesLong = (long) totalExpenses;

        double percentageSpent = (totalExpenses / monthlyIncome) * 100;

        System.out.println("\nMONTHLY EXPENSE REPORT");
        System.out.println("======================");

        System.out.println("Name:\t" + name);
        System.out.println("Income:\t" + currency + monthlyIncome);

        System.out.println("\nEXPENSES");
        System.out.println("Rent:\t\t" + currency + rent);
        System.out.println("Groceries:\t" + currency + groceries);
        System.out.println("Transportation:\t" + currency + transportation);
        System.out.println("Phone:\t\t" + currency + phone);
        System.out.println("Internet:\t" + currency + internet);
        System.out.println("Entertainment:\t" + currency + entertainment);
        System.out.println("School:\t\t" + currency + schoolExpenses);
        System.out.println("Savings:\t" + currency + savings);
        System.out.println("Clothing:\t" + currency + clothing);
        System.out.println("Personal Care:\t" + currency + personalCare);

        System.out.println("\nSUMMARY");
        System.out.println("Total Expenses:\t\t" + currency + totalExpenses);
        System.out.println("Money Remaining:\t" + currency + remainingMoney);
        System.out.println("Weekly Expense Estimate:\t" + currency + weeklyExpenses);
        System.out.println("Percentage of Income Spent:\t" + percentageSpent + "%");

        System.out.println("\nADDITIONAL INFORMATION");
        System.out.println("Number of Expense Categories:\t" + expenseCount);
        System.out.println("Month Number:\t\t\t" + monthNumber);
        System.out.println("Rounded Total Expenses:\t\t" + currency + roundedExpenses);
        System.out.println("Long Total Expenses:\t\t" + currency + totalExpensesLong);
        System.out.println("Budget Checked:\t\t\t" + budgetChecked);

        System.out.println("\nYou spend " + percentageSpent
                + "% of your monthly income.");

        input.close();
    }
}
