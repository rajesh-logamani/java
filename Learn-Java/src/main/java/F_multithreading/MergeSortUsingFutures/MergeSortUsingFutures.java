package F_multithreading.MergeSortUsingFutures;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSortUsingFutures implements Callable<ArrayList<Integer>> {

    private ArrayList<Integer> list;
    private ExecutorService executorService = null;

    MergeSortUsingFutures(ArrayList<Integer> list, ExecutorService executorService) {
        this.list = list;
        this.executorService = executorService;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }
        while (i < left.size()) {
            merged.add(left.get(i++));
        }
        while (j < right.size()) {
            merged.add(right.get(j++));
        }
        return merged;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        if (list.size() <= 1) return list;
        // Split the list into two halves
        System.out.println("Splitting list: " + list + " in thread: " + Thread.currentThread().getName());
        int mid = list.size() / 2;
        ArrayList<Integer> leftList = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> rightList = new ArrayList<>(list.subList(mid, list.size()));

        MergeSortUsingFutures leftTask = new MergeSortUsingFutures(leftList, executorService);
        MergeSortUsingFutures rightTask = new MergeSortUsingFutures(rightList, executorService);

        ArrayList<Integer> leftSorted = executorService.submit(leftTask).get();
        System.out.println("Left sorted list: " + leftSorted + " in thread: " + Thread.currentThread().getName());
        ArrayList<Integer> rightSorted = executorService.submit(rightTask).get();
        System.out.println("Right sorted list: " + rightSorted + " in thread: " + Thread.currentThread().getName());


        return merge(
                leftSorted, rightSorted
        );
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 1000));
        }

        System.out.println("Unsorted List: " + list);

        ExecutorService executorService = java.util.concurrent.Executors.newCachedThreadPool();
        MergeSortUsingFutures sortTask = new MergeSortUsingFutures(list, executorService);
        try {
            Future<ArrayList<Integer>> future = executorService.submit(sortTask);
            ArrayList<Integer> result = future.get();

            System.out.println("Sorted List: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }


    }

}
