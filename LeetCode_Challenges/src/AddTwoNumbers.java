
public class AddTwoNumbers<E> {
    public static Node<Integer> addTwoNumbers(Node<Integer> l1, Node<Integer> l2){
        Node<Integer> head = new Node<>(0);
        Node<Integer> current = head;

        int sum;
        int carry = 0;
        while (l1 != null || l2 != null && carry == 0){
            sum = carry;
            if(l1 != null){
                sum += l1.getElement();
                l1 = l1.getNext();
            }
            if(l2 != null){
                sum += l2.getElement();
                l2 = l2.getNext();
            }
            carry = sum / 10;
            current.setNext(new Node<>(sum % 10));
            current = current.getNext();
        }

        return head.getNext();

    }

    public static void printList(Node<Integer> head){
        while (head != null) {
            System.out.print(head.getElement() + " ");
            head = head.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> l1 = new Node<>(2, new Node<>(4, new Node<>(3)));
        Node<Integer> l2 = new Node<>(5, new Node<>(6, new Node<>(4)));

        Node<Integer> result = addTwoNumbers(l1,l2);

        printList(result);
    }
}
