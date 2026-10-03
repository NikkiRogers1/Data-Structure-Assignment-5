public class ArrayCollection <T> implements CollectionInterface<T> {
    private T[] elements;
    private int numElements;

    public ArrayCollection(){
        elements = (T[]) new Object[100];
        numElements = 0;


    }
  
    public void add(T item){        
        elements[numElements] = item;
        numElements++;
    }

    public boolean isFull(){
       return numElements == elements.length;

    }
    public int find(T target) {

        for(int i = 0; i < numElements; i++) {
                if(elements[i].equals(target)){
                    return i;
                }
        }
        return -1;
    
    }

    public T get(T target) {

        int location = find(target);

        if (location != -1){
            return elements[location];

        }
        return null;
    }

    public void remove(T target) {
        
        int location = find(target);
        if (location != -1){
            elements[location] = elements[numElements - 1];
        elements[numElements -1] = null;
        numElements--;
    }
}
    public boolean contains(T target) {
        
        return find(target) != -1;
    }

    public boolean isEmpty() {
        return numElements ==0;
            
        }

        public int size() {
            return numElements;
        }
    }
