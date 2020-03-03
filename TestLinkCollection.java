/**
Note: The book's description for the combine method for this assignment is correct wrong. 
You may return either a LinkedCollection as shown by the method's header or a SortedArrayCollection as shown in the description. 
The option of what to return is yours since the method return type conflicts with the assignment's description.
Adding methods to the LinkedCollection will give us some additional experience working with these structures. 
At this point we will not look at how to implement these items in an array-based implementation but how you might do so is 
something to consider as you work on this assignment.
*/
import ch05.collections.*;
import support.LLNode;

public class TestLinkCollection<T> extends LinkedCollection<T> {

   //to String method to create and return a string that represents the current queue
   public String toString() {
      String result = "";
      if (isEmpty()) {
         return "The List is empty.";
      }  
      LLNode<T> currNode = head;
       
       while(currNode != null){
         result += currNode.getInfo().toString() + ", ";
         currNode = currNode.getLink();
      }
      return result;
   }
   
   //returns a count of the number of elements e in the collection such that e.equals(target) is true
   public int count(T target) {
      int count = 0;
      LLNode<T> currNode = head;
      
      while(currNode != null){
         if(currNode.getInfo().equals(target))
            count++;
         currNode = currNode.getLink();
       }
      return count;
   }
   
   //removes all elements e from the collection such that e.equals is true
   public void removeAll(T target) {
      LLNode<T> currNode = head;
      LLNode<T> previous = null;

      while(currNode != null){
         if(currNode.getInfo().equals(target)){
            if (previous == null){
               head = currNode.getLink();
            }else{           
               previous.setLink(currNode.getLink());  
            }            
         }else{
            previous = currNode;
         }
         currNode = currNode.getLink();
      }
   }
   /*creates and returns a new SortedArrayCollection object that is a combination of this object and the argument object
   The book's description for the combine method for this assignment is wrong. 
   You may return either a LinkedCollection as shown by the method's header or a SortedArrayCollection as shown in the description. 
   The option of what to return is yours since the method return type conflicts with the assignment's description. */
   
   public LinkedCollection<T> combine (LinkedCollection<T> other) {
   
      LLNode<T> t1 = this.head;
      LLNode<T> t2 = other.head;
      
      if (t1 == null)
         return other;
      if (t2 == null)
         return this;
         
      LinkedCollection<T> newLLCollection = new LinkedCollection<>();
      
      while(t1 != null){
         newLLCollection.add(t1.getInfo());
         t1 = t1.getLink();
      }
      while(t2 != null){
         newLLCollection.add(t2.getInfo());
         t2 = t2.getLink();
      }
      return newLLCollection;
   }
}