package DamageOutput;

import java.util.Scanner;

public class CritDamageOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your atk");
        float atk = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter your crit Damage");
        float critDamage = Integer.valueOf(scanner.nextLine());

        float critDamagePercent = critDamage / 100;
        int finalDamage = (int) (atk + (atk * critDamagePercent));
        System.out.println("Your Damage is" + finalDamage);

        System.out.println("Hello World");
    }
}
