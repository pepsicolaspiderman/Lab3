public class lab33a {
    public static void createHead() {
        Node head = new Node(0, null);
        Node tail = head;

        for (int i = 0; i < 9; i++) {
            tail.next = new Node(i + 1, null);
            tail = tail.next;
        }
    }

    public static void createTail() {
        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
    }

    public static void toString() {
        Node ref = head;
        while (ref != null) {
            System.out.print("" + ref.value);
            ref = ref.next;
        } }
    public static void AddFirst() {
        Node head = new Node(3, head);
    }
    public static void AddLast() {
        Node newtail = new Node(123, null);
        Node ref = head;
        while (ref.next!=null) {
            ref = ref.next;
        }
        ref.next = newtail;
    }
    public static void Insert() {
        Node newNode = new Node(34, null);
        Node ref = head;
        int k = 1;
        while(ref.next!=null&&(k<2)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next.next;
        ref.next = newNode;
    }
    public static void RemoveFirst() {
        Node head = head.next;
    }
    public static void RemoveLast() {
        Node ref = head;
        while (ref.next.next!=null) {
            ref=ref.next;
        }
        ref.next.null;
    }
    public static void Remove() {
        Node ref = head;
        int k = 1;
        while (ref.next!=null&&(k<2)){
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
    }
}

