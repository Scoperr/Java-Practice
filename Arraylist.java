package sample.javaprograms;
import java.util.ArrayList; //ArrayList is present in Util package.
import java.util.Iterator;
public class Arraylist {
    public static void main(String[] args){
     
        //To create ArrayList.
        //A String of ArrayList, sName is created.
        ArrayList<String> sName = new ArrayList<>();
        
        //To add elements sName ArrayList.
        sName.add("Tarun");
        //To add element at specified position
        sName.add(1,"Hassain");
        
        System.out.println(sName);
        
        //Creating another ArrayList.
        ArrayList<String> Age = new ArrayList<>();
        Age.add("Hussain");
        Age.add("Geetha");
        
        //To add a list to another list.
        sName.addAll(Age);
        System.out.println(sName);
        
        //To retrive element at specified index.
        System.out.println(sName.get(3));
        
        //To remove element at specified index.
        sName.remove(3);
        System.out.println(sName);
        
        //To remove element directly.
        sName.remove(String.valueOf("Hassain"));
        System.out.println(sName);
        
        //To change the value of specified index.
        sName.set(0, "Ffer");
        System.out.println(sName);
        
        //To check whether an element is present or not.
        System.out.println(sName.contains("Geetha"));
        
        //To check length of list.
        System.out.println(sName.size());
        
        //To iterate there are 3 methods.
            /* 1. Use for loop.
               2. Use foreach loop.
               3. Using iterator.
            */
        Iterator<String> i = sName.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
            
            
        //To clear whole list.
        sName.clear();
    }
}
