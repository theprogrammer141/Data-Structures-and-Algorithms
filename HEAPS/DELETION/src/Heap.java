import java.util.ArrayList;

public class Heap{
    public static ArrayList<Integer> heap;

    public Heap(){
        heap = new ArrayList<>();
    }

    public static int minHeapDeletion(int data) {
        int deleted_element = heap.get(0);

        //swap first and last node
        int temp = heap.getLast();
        heap.set(0, heap.get(heap.size() - 1));
        heap.set(heap.size() - 1, temp);

        //delete last node
        heap.removeLast();

        //fix heap
        heapifyForMinHeap(0);

        return deleted_element;
    }

    public static void heapifyForMinHeap(int index){
        int left_child = 2 * index + 1;
        int right_child = 2 * index + 2;
        int smallest = index;

        if(left_child < heap.size() && heap.get(left_child) < heap.get(smallest)){
            smallest = left_child;
        }

        if(right_child < heap.size() && heap.get(right_child) < heap.get(smallest)){
            smallest = right_child;
        }

        if(smallest != index){
            int temp = heap.get(index);
            heap.set(index, heap.get(smallest));
            heap.set(smallest, temp);
            heapifyForMinHeap(smallest);
        }
    }

    public static int maxHeapDeletion(int data){
        int deleted_element = heap.get(0);

        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.set(heap.size() - 1, temp);

        heap.removeLast();

        heapifyForMaxHeap(0);

        return deleted_element;
    }

    public static void heapifyForMaxHeap(int index){
        int left_child = 2 * index + 1;
        int right_child = 2 * index + 2;
        int largest = index;

        if(left_child < heap.size() && heap.get(left_child) > heap.get(largest)){
            largest = left_child;
        }

        if(right_child < heap.size() && heap.get(right_child) > heap.get(largest)){
            largest = right_child;
        }

        if(largest != index){
            int temp = heap.get(index);
            heap.set(index, heap.get(largest));
            heap.set(largest, temp);
            heapifyForMaxHeap(largest);
        }
    }
}