import java.util.*;

public class Main {


    public static Integer indiceOfHouse(int[] houses, int target) {
        for (int i = 0; i < houses.length; ++i) {
            if (houses[i] == target) {
                return i;
            }
        }

        return null;
    }

    public static boolean isAHouse(int[] houses, int element) {
        for (int i = 0; i < houses.length; ++i) {
            if (houses[i] == element) {
                return true;
            }
        }

        return false;
    }

    public static Integer numberOfSections(boolean[] houses) {
        int sections = 0;

        boolean isASection = false;
        for (boolean house : houses) {
            if (house == true) {
                isASection = true;
            } else {
                isASection = false;
            }
        }

        return sections;
    }

    public static void toString(boolean[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] houses = {1, 2, 3, 6, 7, 9};
        int[] neighborhood = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] housesToDestroy = {6, 2, 9, 7, 3, 1}; // In that order

        boolean[] myHood = new boolean[neighborhood.length];

        for (int i = 0; i < myHood.length; ++i) {
            myHood[i] = isAHouse(houses, i);
        }

        System.out.println("Original boolean array:");
        toString(myHood);
        System.out.println();

        ArrayList<Integer> sections = new ArrayList<>();
        for (int e : housesToDestroy) {
            // count how many sections of houses there are
            sections.add(numberOfSections(myHood));
            // find the index of the element in the neighborhood
            
            // destroy the house
            int index = indiceOfHouse(housesToDestroy, e);
            if (myHood[index] == true) {
                myHood[index] = false;
            }

            toString(myHood);
            System.out.println();
        }

        System.out.println("Ending boolean array:");
        toString(myHood);


    }


}