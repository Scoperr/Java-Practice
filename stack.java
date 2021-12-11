package sample.javaprograms;
import java.util.Stack;
public class stack {
    public static void main(String[] args){
        //Creation of stack wiht name animals.
        Stack<String> animals = new Stack<>();
        
        //Adding elements to the stack.
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Human");
        
        System.out.println(animals);
        
        //Human -> Cat -> Dog -> Lion, Human is top most element.
        System.out.println(animals.peek());
        
        //To remove top most element.
        animals.pop();
        
        System.out.println(animals);
        System.out.println(animals.search("Cat"));
        System.out.println(animals.search("Lion"));
        System.out.println(animals.search("Dog"));
    }
}
