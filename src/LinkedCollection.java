public class LinkedCollection<T> implements CollectionInterface<T>{

private LLNode<T> head;
private int numElements;

public LinkedCollection(){
    head = null;
    numElements = 0;

}
public void add(T element) {
    LLNode<T> newNode = new LLNode<>(element);

    newNode.setLink(head);

    head = newNode;

    numElements ++;

}
public LLNode<T> find(T target) {
    LLNode<T> location = head;
    LLNode<T> previous= null;
    while (location != null ) {
        if(location.getInfo().equals(target)) {
            return location;

        }
        previous = location;
        location = location.getLink();


    }
    return null;
}

public T get(T target) {

    LLNode<T> location = find(target);
    if (location != null) {
        return location.getInfo();
    }
    return null;
}

public void remove(T target){
    LLNode<T> location = head;
    LLNode<T> previous = null;

    while (location != null){
      if (location.getInfo().equals(target)) {

        if(location == head){
            head = head.getLink();
            numElements --;

            return;
        }
        previous.setLink(location.getLink());
        numElements --;
        return;
 
    }
    previous = location;
    location = location.getLink();

}
}
public boolean contains(T target) {
    return find(target) != null;
}
public boolean isEmpty(){

    return numElements ==0;
}
public int size() {
    return numElements;
}

public boolean isFull(){
    return false;
    
}
}