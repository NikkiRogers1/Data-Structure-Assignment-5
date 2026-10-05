
public class LLNode <T> {
        //Stores the info/data inside the node 
        private T info;
        //Stores a reference to the next node
        private LLNode <T> link;
        //Constructor that sets the info when the node is created 
       public LLNode (T info){
        this.info = info;
       }
       //Returns the info stored in this node
       public T getInfo() {
                return info;
       }
       // Returns the references to the new node 
       public LLNode<T>getLink(){
        return link;
       }
       //Changes which node this node points to next
       public void setLink(LLNode<T> newLink) {
        this.link = newLink;

       }
        }
    
