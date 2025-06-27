package F_multithreading.problems.callables_node;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {

    private Node root;
    private ExecutorService executorService;

    public TreeSizeCalculator(Node root, ExecutorService executorService) {
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception {
        return calculateSize(root, executorService);
    }

    private Integer calculateSize(Node node, ExecutorService executorService) throws Exception {
        if (node == null) {
            return 0;
        }
        TreeSizeCalculator leftNode = new TreeSizeCalculator(root.left,executorService);
        Future<Integer> futureLeft = executorService.submit(leftNode);

        TreeSizeCalculator rightNode = new TreeSizeCalculator(root.right,executorService);
        Future<Integer> futureRight = executorService.submit(rightNode);

        // Wait for the results of the left and right subtree calculations
        Integer leftSize = futureLeft.get();
        Integer rightSize = futureRight.get();

        return 1 + leftSize + rightSize;
    }
}