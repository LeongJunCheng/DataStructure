/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author Student
 */
public class DataStructurePartB<T> implements ListInterface<T> {

    private Node firstNode, lastNode;
    private int size;

    private class Node {

        T data;
        Node next, previous;

        public Node() {

        }

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    }

    @Override
    public void add(T newEntry) {
        Node newNode = new Node(newEntry);
        if (isEmpty()) {
            firstNode = newNode;
        } else {
            lastNode.next = newNode;
            newNode.previous = lastNode;
        }
        lastNode = newNode;
        size++;
    }//done

    @Override
    public void replace(T oldEntry, T newEntry) {
        Node found = myEquals(oldEntry);
        
        if(found != null){
            found.data = newEntry;
        }
    }//done
    
    public void replaceByID(String id, T anEntry) {
        int hi = 0;
        if (!isEmpty()) {
            Node temp = firstNode;
            while (temp != null) {
                if (temp.data instanceof DeliveryManDomain){
                    DeliveryManDomain data = (DeliveryManDomain) temp.data;
                    if (data.getID().equals(id)) {
                        temp.data = anEntry;
                        hi = 1;
                        System.out.println("Update Successfully.");
                    }
                    temp = temp.next;
                }
            }
            if(hi == 0)
                System.out.print("There is non-matched data in list.");
        }else{
            System.out.print("The current list is empty.");
        }
    }

    public Node myEquals(T entry) {
        if (!isEmpty()) {
            Node temp = firstNode;
            while (temp != null) {
                if (temp.data.equals(entry)) {
                    return temp;
                }
                temp = temp.next;
            }
            System.out.print("There is non-matched data in list.");
            return null;
        }else{
            System.out.print("The current list is empty.");
            return null;
        }
    }//done
    
    public Node myEqualsByPosition(int position) {
        if (!isEmpty()) {
            Node temp = firstNode;
            int i = 0;
            while (temp != null) {
                if (position == i) {
                    return temp;
                }
                temp = temp.next;
                i++;
            }
            System.out.print("There is non-matched data in list.");
            return null;
        }else{
            System.out.print("The current list is empty.");
            return null;
        }
    }

    @Override
    public boolean contains(T anEntry) {
        if (!isEmpty()) {
            Node temp = firstNode;
            while (temp != null) {
                if (temp.data.equals(anEntry)) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }//done

    @Override
    public void remove(T anEntry) {
        if (!isEmpty()) {
            //Node temp = firstNode;
            if (firstNode.data.equals(anEntry)) {
                firstNode = firstNode.next;
                if (firstNode == null) {
                    lastNode = null;
                } else {
                    firstNode.previous = null;
                }
                size--;
            }else{
                Node found = myEquals(anEntry);

                if(found != null){
                    if (found == lastNode) { //remove last node
                        lastNode = found.previous;
                        lastNode.next = null;
                    } else {
                        found.data = null;
                        found.previous.next = found.next;
                        found.next.previous = found.previous;
                    }
                    size--;
                }
            }
        }
    }
    
    public void removeByPosition(int position) {
        position = position - 1;
        if (!isEmpty()) {
            //Node temp = firstNode;
            if (position == 0) {
                firstNode = firstNode.next;
                if (firstNode == null) {
                    lastNode = null;
                } else {
                    firstNode.previous = null;
                }
                size--;
            }else{
                Node found = myEqualsByPosition(position);
                if(position <= size){
                    if (position == size) { //remove last node
                        lastNode = found.previous;
                        lastNode.next = null;
                    } else {
                        found.data = null;
                        found.previous.next = found.next;
                        found.next.previous = found.previous;
                    }
                    size--;
                }
            }
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public void getAll() {
        if (!isEmpty()) {
            Node temp = firstNode;
            int i = 1;
            while (temp != null) {
                System.out.println(i++ + ") " + temp.data.toString());
                temp = temp.next;
            }
        } else {
            System.out.println("The current list is empty.");
        }
        
//        String str = "";
//        Node temp = firstNode;
//        while (temp != null) {
//            str += temp.data + " ";
//            temp = temp.next;
//        }
//
//        return str;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }


    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
