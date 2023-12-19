package Ex2_2;

public class SortingApplication {
    public static void main(String[] args) {
        SortingAlgorithm sorter = new SelectionSort();
        sorter.sort();

        sorter = new MergeSort();
        sorter.sort();

        sorter = new InsertionSort();
        sorter.sort();
    }
}
