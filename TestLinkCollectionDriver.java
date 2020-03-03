import ch05.collections.*;
import support.LLNode;

public class TestLinkCollectionDriver {
   public static void main(String[] args ) {
   
      TestLinkCollection<String> myLinkedCollection = new TestLinkCollection<String>();
      TestLinkCollection<String> mySecondCollection = new TestLinkCollection<String>();
   
      //add nodes to the first collection
      myLinkedCollection.add("dog");
      myLinkedCollection.add("cat");
      myLinkedCollection.add("dog");
      myLinkedCollection.add("bird");
      myLinkedCollection.add("cat");
      myLinkedCollection.add("dog");
      myLinkedCollection.add("fish");
      myLinkedCollection.add("cat");
      myLinkedCollection.add("dog");
      myLinkedCollection.add("turtle");
      myLinkedCollection.add("cat");
      
      //add nodes to the second collection
      mySecondCollection.add("red");
      mySecondCollection.add("orange");
      mySecondCollection.add("indigo");
      mySecondCollection.add("red");
      mySecondCollection.add("yellow");
      mySecondCollection.add("red");
      mySecondCollection.add("green");
      mySecondCollection.add("indigo");
      mySecondCollection.add("blue");
      mySecondCollection.add("indigo");
      mySecondCollection.add("violet");
      
      //output collection toString
      System.out.println("\nThe current elements in myLinkedCollection is: " + myLinkedCollection);
      System.out.println("The current elements in mySecondCollection is: " + mySecondCollection);
      
      //output count of e element
      System.out.println("\nThe current count of dog is: " + myLinkedCollection.count("dog"));
      System.out.println("The current count of red is: " + mySecondCollection.count("red"));
      
      //output collection after removeAll of e element
      System.out.println("\nRemoving 'cat' from myLinkedCollection...");
      myLinkedCollection.removeAll("cat");
      System.out.println("The current myLinkedCollection is: " + myLinkedCollection);
      
      System.out.println("\nRemoving 'red' from mySecondCollection...");
      mySecondCollection.removeAll("red");
      System.out.println("The current mySecondCollection is: " + mySecondCollection);
      
      //combining myLinkedCollection and mySecondCollection
      System.out.println("\nCombining myLinkedCollection and mySecondCollection...");
      
      LinkedCollection<String> newLLCollection = myLinkedCollection.combine(mySecondCollection);
      LLNode<String> currNode = newLLCollection.head;
       
       while(currNode != null){
         System.out.print(currNode.getInfo().toString() + ", ");
         currNode = currNode.getLink();
      }
   }
}  