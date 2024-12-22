import java.util.ArrayList;

public class Heap {
    public static ArrayList<Integer> heap;

    public Heap(){
        heap = new ArrayList<>();
    }

    public void minHeapInsertion(int data){
        heap.add(data);

        int child_index = heap.size() - 1;
        int parent_index = (child_index - 1) / 2;

        while(heap.get(child_index) < heap.get(parent_index)){
            //swap
            int temp = heap.get(child_index);
            heap.set(child_index, heap.get(parent_index));
            heap.set(parent_index, temp);
            child_index = parent_index;
            parent_index = (child_index - 1) / 2;
        }
    }

    public void maxHeapInsertion(int data){
        heap.add(data);

        int child_index = heap.size() - 1;
        int parent_index = (child_index - 1) / 2;

        while(heap.get(child_index) > heap.get(parent_index)){
            //swap
            int temp = heap.get(child_index);
            heap.set(child_index, heap.get(parent_index));
            heap.set(parent_index, temp);

            child_index = parent_index;
            parent_index = (child_index - 1) / 2;
        }
    }
}
