package Health;

import java.util.Scanner;

public class CalculatorBMI {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj wzrost w cm: ");
        double heightCm = scanner.nextDouble();
        System.out.print("Podaj wagę w kg: ");
        double weightKg = scanner.nextDouble();
        
        //BMI = waga w Kg / wzrost w m2 podniesiony do kwadratu
        
        double heightMeters = heightCm/100;
        double heightMeterSquare = heightMeters*heightMeters;
        double currentBMI = weightKg/heightMeterSquare;
        
        System.out.println("Wzrost w centymetrach: " + heightCm);
        System.out.println("Waga w kilogramach: " + weightKg);
        System.out.println("Prawidłowe BMI mieści się w zakresie 18,5 - 24,9. Twoje BMI to: " + currentBMI);
 
        //Wyniki 
        
        if ( currentBMI < 18.5) {
            double targetWeightKg = (18.5*heightMeterSquare);
            double targetWeightChangeKg = targetWeightKg - weightKg;
            System.out.println("Masz niedowagę. Aby uzyskać prawidłowe BMI przybrać na wadze  minimum: " + targetWeightChangeKg + " kg");
        } else if (currentBMI >=18.5 && currentBMI <=24.9) {
            System.out.println("Masz odpowiednią wagę. Tak trzymać");      
        } else if (currentBMI> 24.9 && currentBMI <=30) {
            double targetWeightKg = (24.9 *heightMeterSquare);
            double targetWeightChangeKg = weightKg - targetWeightKg;
            System.out.println("Masz nadwagę. Aby uzyskać prawidłowe BMI powinieneś zrzucić wagę minimum: " + targetWeightChangeKg + " kg");    
        } else {
            double targetWeightKg = (24.9 *heightMeterSquare);
            double targetWeightChangeKg = weightKg - targetWeightKg;
            System.out.println("Masz otyłość. Aby uzyskać prawidłowe BMI powinieneś zrzucić wagę minimum: " + targetWeightChangeKg + " kg");           
        }  
    }
}