package javaassignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Javaassignment2 {

    static class Person {
        String name;
        ArrayList<Integer> apples;
        int totalWeight;

        Person(String name) {
            this.name = name;
            this.apples = new ArrayList<>();
            this.totalWeight = 0;
        }

        void addApple(int weight) {
            apples.add(weight);
            totalWeight += weight;
        }

        void printApples() {
            System.out.print(name + " : ");
            for (int weight : apples) {
                System.out.print(weight + " ");
            }
            System.out.println("(Total " + totalWeight + "g)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input collection
        ArrayList<Integer> appleWeights = new ArrayList<>();
        System.out.println("Enter apple weight in gram (-1 to stop) : ");
        while (true) {
            int weight = scanner.nextInt();
            if (weight == -1) break;
            appleWeights.add(weight);
        }

      
        Person ram = new Person("Ram");
        Person sham = new Person("Sham");
        Person rahim = new Person("Rahim");

       
        int totalAmount = 100;
        double ramShare = 50.0 / totalAmount;
        double shamShare = 30.0 / totalAmount;
        double rahimShare = 20.0 / totalAmount;

       
        int totalWeight = appleWeights.stream().mapToInt(Integer::intValue).sum();

       
        int ramTargetWeight = (int) (ramShare * totalWeight);
        int shamTargetWeight = (int) (shamShare * totalWeight);
        int rahimTargetWeight = (int) (rahimShare * totalWeight);

        
        Collections.sort(appleWeights, Collections.reverseOrder());

      
        for (int weight : appleWeights) {
            if (ramTargetWeight > 0) {
                ram.addApple(weight);
                ramTargetWeight -= weight;
            } else if (shamTargetWeight > 0) {
                sham.addApple(weight);
                shamTargetWeight -= weight;
            } else if (rahimTargetWeight > 0) {
                rahim.addApple(weight);
                rahimTargetWeight -= weight;
            }
        }
        System.out.println("Distribution Result :");
        ram.printApples();
        sham.printApples();
        rahim.printApples();
    }
}
