package com.ds.linkedlist;

public class MyLinkedList {
    private Node headNode;
    public static int listLength(Node headNode){
        int length = 0;
        Node temp = headNode;
        while(temp.getNext()!=null){
            length++;
            temp = temp.getNext();
        }
        return  length;
    }

    public  void insertAtBegining(int data){
        Node node = new Node(data);
        node.setNext(headNode);
        headNode = node;
    }

    public void insertAtEnd(int data){
        Node node = new Node(data);
        if(headNode==null){
            headNode = node;
        }else{
            Node temp = headNode;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    public Node remvoveFromBegin(){
        Node node = headNode;
        if(node!=null){
           headNode = node.getNext();
           node.setNext(null);
        }
        return node;
    }

    public Node remvoveAtEnd(){
        Node node = headNode;
        if(node == null){
            return null;
        }
        if(node.getNext()==null){
            headNode = null;
            return node;
        }
        if(node!=null){
            Node prevNode =null;
            while(node.getNext()!=null){
                prevNode = node;
                node = node.getNext();
            }
            prevNode.setNext(null);
        }
        return node;
    }

    private  int counter=0;
    public Node findNethNode(Node head, int pos){ //using recursion
        if(head!=null){
            findNethNode(head.getNext(), pos);
            counter++;
            if(counter==pos){
                return head;
            }
        }
        return  null;
    }

    public static boolean findLoopExists(Node head){
        Node fastPtr = head;
        Node slowPtr= head;
        while(fastPtr!=null && fastPtr.getNext()!=null){
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();
            if(slowPtr==fastPtr){
                return true;
            }
        }
        return false;
    }

    public static int findLengthOfLoop(Node head){
        Node fastPtr = head;
        Node slowPtr = head;
        int length =0;
        boolean isLoopExists =false;
        while(fastPtr!=null && fastPtr.getNext()!=null){
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();
            if(slowPtr == fastPtr){
                isLoopExists=true;
                break;
            }
        }
        if(isLoopExists){
         do{
             slowPtr = slowPtr.getNext();
             length++;
         }while (slowPtr!=fastPtr);
        }
        return  length;
    }

    public Node reverseSinglyLinkedlist(Node head){
        Node current = head;
        Node prev= null;
        while(current!=null){
            Node next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return prev;
    }

    public int findIntersectingNode(Node list1, Node list2){
        int l1 =0,l2=0, diff=0;
        Node head1 = list1; Node head2=list2;
        while(head1!=null){
            l1++;
            head1 = head1.getNext();
        }
        while(head2!=null){
            l2++;
            head2 = head2.getNext();
        }
        if(l1<l2){
            head1 = list2;
            head2 = list1;
            diff = l2-l1;
        }else{
            head1 = list1;
            head2 = list2;
            diff = l1-l2;
        }
        for(int i=0;i<diff; i++){
            head1 = head1.getNext();
            while(head1!=null && head2!=null){
                if(head1==head2){
                    return head1.getData();
                }
                head1 = head1.getNext();
                head2 = head2.getNext();
            }
        }
        return -1;
    }

    public Node findMiddle(Node head){
        Node ptr1=head;
        Node ptr2 = head;
        int i =0;
        while(ptr1.getNext()!=null){
            if(i==0){
                ptr1 = ptr1.getNext();
                i=1;
            }else if(i==1){
                ptr1=ptr1.getNext();
                ptr2=ptr2.getNext();
                i=0;
            }
        }
        return ptr2;
    }
}
