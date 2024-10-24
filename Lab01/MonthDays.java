package Lab01;

import java.util.Scanner;
public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        while (true) {
            System.out.print("Enter month (name, abbreviation, or number): ");
            monthInput = scanner.nextLine().trim();

            if (isValidMonth(monthInput)) {
                break;
            } else {
                System.out.println("Invalid month input, please try again.");
            }
        }

        while (true) {
            System.out.print("Enter year: ");
            String yearInput = scanner.nextLine().trim();

            if (isValidYear(yearInput)) {
                year = Integer.parseInt(yearInput);
                break;
            } else {
                System.out.println("Invalid year input, please enter a non-negative number in full digits.");
            }
        }

        int month = convertMonthToNumber(monthInput);
        int days = getDaysInMonth(month, year);

        System.out.println("Month: " + monthInput + ", Year: " + year + " has " + days + " days.");
    }

    // Check if the month input is valid (full name, abbreviation, or number)
    public static boolean isValidMonth(String monthInput) {
        String[] validMonths = {"January", "Jan.", "Jan", "1",
                                "February", "Feb.", "Feb", "2",
                                "March", "Mar.", "Mar", "3",
                                "April", "Apr.", "Apr", "4",
                                "May", "May", "May", "5",
                                "June", "Jun.", "Jun", "6",
                                "July", "Jul.", "Jul", "7",
                                "August", "Aug.", "Aug", "8",
                                "September", "Sept.", "Sep", "9",
                                "October", "Oct.", "Oct", "10",
                                "November", "Nov.", "Nov", "11",
                                "December", "Dec.", "Dec", "12"};

        for (String validMonth : validMonths) {
            if (validMonth.equalsIgnoreCase(monthInput)) {
                return true;
            }
        }
        return false;
    }

    // Check if the year input is valid (must be non-negative and a full number)
    public static boolean isValidYear(String yearInput) {
        try {
            int year = Integer.parseInt(yearInput);
            return year >= 0; // Year should be non-negative
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Convert month input to a number (1-12)
    public static int convertMonthToNumber(String monthInput) {
        switch (monthInput.toLowerCase()) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun.":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul.":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sept.":
            case "sep":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;
            default:
                return -1; // Invalid month
        }
    }

    // Get number of days in the month, considering leap years
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; // Invalid month
        }
    }

    // Check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
