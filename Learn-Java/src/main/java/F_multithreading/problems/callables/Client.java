package F_multithreading.problems.callables;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {


    public static void main(String[] args) {
        System.out.println("Enter the size of the Array List to be created: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayCreator arrayCreator = new ArrayCreator(n);

        try {
            ExecutorService executorService = Executors.newFixedThreadPool(5);
            Future<ArrayList<Integer>> futureList = executorService.submit(arrayCreator);
            ArrayList<Integer> list = futureList.get();
            System.out.println("Array List created with size: " + list.size());
            System.out.println("Elements in the Array List: " + list);
        } catch (Exception e) {
            System.out.println("An error occurred while creating the Array List: " + e.getMessage());
        }
    }
}
