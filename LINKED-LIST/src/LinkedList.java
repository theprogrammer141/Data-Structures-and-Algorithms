public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Methods
    public void addFirst(int data) {
        //Step 1
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //Step 2
        newNode.next = head;

        //Step 3
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addAtIndex(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < index - 1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int value = head.data;
            head = head.next;
            size = 0;
            return value;
        }

        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int value = tail.data;
            head = tail = null;
            size = 0;
            return value;
        }

        Node previous = head;
        for(int i = 0; i < size - 2; i++){
            previous = previous.next;
        }

        int value = previous.next.data;
        previous.next = null;
        tail = previous;
        size --;
        return value;
    }

    public int linearSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int index = helper(head.next, key);

        if(index == -1){
            return -1;
        }

        return index + 1;
    }

    public int recursiveSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node previous = null;
        Node current = tail = head;
        Node next;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void deleteNthNodeFromEnd(int n){
        int size = 0;
        Node temp = head;

        while (temp != null){
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next;
            return;
        }

        //Go to size - n
        int i = 1;
        int indexToReach = size - n;
        Node prev = head;

        while(i < indexToReach){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean checkPalindrome(){
        if(head == null && head.next == null){
            return true;
        }

        //Step 1
        Node midNode = findMidNode(head);

        //Step 2
        Node previous = null;
        Node current = midNode;

        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        Node right = previous;
        Node left = head;

        //Step 3
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }

    public static boolean isCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(Node head){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return ;
        }

        slow = head;
        Node previous = null;

        while(slow != fast){
            previous = fast;
            slow = slow.next;
            fast = fast.next;
        }

        previous.next = null;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        //find mid node
        Node mid = getMid(head);

        //Left and Right MergeSort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //Merge
        return merge(newLeft, newRight);
    }

    public void zigZag(){
        //find Mid
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        //Reverse 2nd half
        Node current = mid.next;
        mid.next = null;
        Node previous = null;
        Node next;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        Node left = head;
        Node right = previous;
        Node nextL, nextR;

        //Alternate merging
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

    }
}
