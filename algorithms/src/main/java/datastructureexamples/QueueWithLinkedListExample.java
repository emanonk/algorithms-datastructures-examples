package datastructureexamples;


class LNode1 {

    int data;
    LNode1 next;

    LNode1(int d) {
        data = d;
    }
}


class Queue1 {

    LNode1 enQueue1(LNode1 head, int a) {
        LNode1 tmp = new LNode1(a);
        if (head == null)
            head = tmp;
        else {
            LNode1 tmp1 = head;
            while (tmp1.next != null)
                tmp1 = tmp1.next;

            tmp1.next = tmp;
        }
        return head;
    }


    LNode1 deQueue1(LNode1 head) {
        if (head == null)
            System.out.println("underflow");
        else
            head = head.next;
        return head;
    }

    void display(LNode1 head) {

        System.out.println("\n list is : ");
        if (head == null) {

            System.out.println("no LNode1s");

            return;
        }

        LNode1 tmp = head;

        while (tmp != null) {

            System.out.print(tmp.data + " ");

            tmp = tmp.next;


        }
    }

}

public class QueueWithLinkedListExample {

    public static void main(String[] args) {
        Queue1 ob = new Queue1();
        LNode1 head = null;

        head = ob.enQueue1(head, 1);
        head = ob.enQueue1(head, 2);
        head = ob.enQueue1(head, 3);
        head = ob.enQueue1(head, 4);
        head = ob.enQueue1(head, 5);
        ob.display(head);
        head = ob.deQueue1(head);
        ob.display(head);
    }
}