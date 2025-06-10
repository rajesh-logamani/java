package threads.problems.callables_node;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        // Create a sample binary tree
        Node leftChild = new Node(2, null, null);
        Node rightChild = new Node(3, null, null);
        Node root = new Node(1, leftChild, rightChild);

        // Create a TreeSizeCalculator instance
        ExecutorService executorService = Executors.newCachedThreadPool();
        TreeSizeCalculator calculator = new TreeSizeCalculator(root,executorService);
        Future<Integer> futureSize = executorService.submit(calculator);

        try{
            int size = futureSize.get();
            System.out.println(size);
        }
        catch(Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
