import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int num = myScanner.nextInt();
//
//        if (num > -50 && num < 50) {
//            System.out.println("Your number is between -50 and 50");
//        } else if (num > 100 || num < -100) {
//            System.out.println("Your number is more then 100 away from 0!");
//        } else {
//            System.out.println("Something else");
//        }

//        System.out.print("Enter a lowercase word: ");
//        String word = myScanner.nextLine();
//        String first = word.substring(0, 1);  //// get first letter

//        if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u")) {
//            System.out.println("Your word begins with a vowel");
//        } else {
//            System.out.println("Your word begins with a consonant");
//        }

//        System.out.println("Slay the Dragon!");
//        System.out.println("----------------");
//        int health = (int) (Math.random() * 100) + 1;
//        System.out.println("The dragon has " + health + " health");
//
//        int attackAmount = 0;
//        int numAttacks = 0;
//        boolean dragonSlayed = false;
//
//        while (numAttacks < 5 && !dragonSlayed) {
//            System.out.print("\nEnter an attack amount: ");
//            attackAmount = myScanner.nextInt();
//            numAttacks += 1;
//            health -= attackAmount;
//            if (health <= 0) {
//                System.out.println("You slayed the dragon!");
//                dragonSlayed = true;
//            } else {
//                System.out.println("Attack again! The dragon has " + health + " health");
//            }
//        }
//
//        if (!dragonSlayed) {
//            System.out.println("You lost!");
//        } else {
//            System.out.println("You won!");
//        }
//        System.out.println("Game over, goodbye!");

//        int x = 6;
//        int y = 15;
//        boolean m = true;
//        boolean n = false;
//
//        System.out.println("-- Set A --");
//        System.out.println(x > y && y == 15);
//        System.out.println(y > x && y == 15);
//        System.out.println(x <= 5 || y % 2 == 1);
//        System.out.println(y < x || !(y == x));
//        System.out.println(m && !n);
//        System.out.println(!(m && n));
//        System.out.println("- part 2 -");
//        System.out.println((x > 2) && (x < 8));
//        System.out.println(x > 3 && x < 6);
//        System.out.println(x + 2 == 8 && m);
//        System.out.println((x > 2) || (x % 2 == 1));
//        System.out.println(x >= 7 || !m);
//        System.out.println(!(x > 2));
//        System.out.println(!(x > 7));

//        boolean isRaining = false;
//        double bank = 10.50;
//        int minutes = 45;
//        boolean shop;
//        boolean stay;
//
//        shop = (bank >= 8.00) && (minutes < 60) && !isRaining;
//        System.out.println(shop);
//
//        stay = !(bank > 5) || minutes > 30 || isRaining;
//        System.out.println(stay);
//
//        int score = 65;
//        if (score < 0 || score > 100 || score % 2 != 0)
//        {
//            System.out.println("Illegal score");
//        }
//        else if (score >= 0 && score <= 100 && score % 2 == 0)
//        {
//            System.out.println("Legal score");
//        }
//        else
//        {
//            System.out.println("Invalid!");
//        }
//
//        System.out.println("- part 2 -");
//
//        score = 80;
//        if (score < 0 || score > 100 || score % 2 != 0)
//        {
//            System.out.println("Illegal score");
//        }
//        else if (score >= 0 && score <= 100 && score % 2 == 0)
//        {
//            System.out.println("Legal score");
//        }
//        else
//        {
//            System.out.println("Invalid!");
//        }
//
//        String word = "Apple";
//        if (!word.toLowerCase().equals("apple"))
//        {
//            System.out.println("beep!");
//        }
//        else
//        {
//            System.out.println("boop!");
//        }

//        boolean a, b, c, d; // NOTE you can declare multiple
//        // variables of same type like this!
//        a = false;
//        b = !a;
//        c = !(a || b);
//        d = !b && !(c && a);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//
//        a = false;
//        b = false;
//        c = true;
//        if (a && b || c)
//        {
//            System.out.println("yes 1!");
//        }
//        else
//        {
//            System.out.println("no 1!");
//        }
//
//        if (a && (b || c))
//        {
//            System.out.println("yes 2!");
//        }
//        else
//        {
//            System.out.println("no 2!");
//        }
//
//        if (c || b && a)
//        {
//            System.out.println("yes 3!");
//        }
//        else
//        {
//            System.out.println("no 3!");
//        }
//
//        if ((c || b) && a)
//        {
//            System.out.println("yes 4!");
//        }
//        else
//        {
//            System.out.println("no 4!");
//        }

//        int p = 10;
//        int q = 13;
//        boolean w = true;
//
//        if ((p > 8) || (q < 10))
//        {
//            int sum = p + q;
//            System.out.println("Sum is: " + sum);
//        }
//
//        if (q == 13)
//        {
//            System.out.println("q is a 13!");
//        }
//
//        if (!(p < 8))
//        {
//            System.out.println("p is NOT < 8!");
//        }
//
//        if (!(q + p > 25))
//        {
//            int sum = p + q;
//            System.out.println("sum NOT > 25!");
//        }
//
//        if (w)
//        {
//            System.out.println("w is true!");
//        }

//        int p = 5;
//        int q = 0;
//
//        if (p > 0 || (p / q) == 2)
//        {
//            System.out.println("it’s true :)");
//        }
//        else
//        {
//            System.out.println("it’s false :(");
//        }

//        int p = 5;
//        int q = 0;
//
//        if ((p < 3 && (p / q) == 2))
//        {
//            System.out.println("it’s true :)");
//        }
//        else
//        {
//            System.out.println("it’s false :(");
//        }

//        int p = 5;
//        int q = 0;
//
//        if (p < 3 || (p / q) == 2)
//        {
//            System.out.println("it’s true :)");
//        }
//        else
//        {
//            System.out.println("it’s false :(");
//        }

//        int p = 5;
//        int q = 0;
//
//        if (p > 0 && (p / q) == 2)
//        {
//            System.out.println("it’s true :)");
//        }
//        else
//        {
//            System.out.println("it’s false :(");
//        }

        myScanner.close();
    }
}
