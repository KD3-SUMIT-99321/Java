import java.util.ArrayList;
import java.util.Collections;

public class Problem3 {
   public static void main(String[] args) {
	   ArrayList<String> list = new ArrayList<>();
		 Collections.addAll(list,  "Red",
	    "Green",
	    "Blue",
	    "Yellow",
	    "Orange",
	    "Pink",
	    "Purple",
	    "Black",
	    "White",
	    "Gray",
	    "Brown",
	    "Violet",
	    "Indigo",
	    "Cyan",
	    "Magenta");
		 System.out.println("Before Modification");
			for(String s:list) {
				System.out.println(s);
			}
			
          list.set(1, "Black");
        
        System.out.println("---------------------------------------");
      	System.out.println("After Modification");
      	System.out.println("---------------------------------------");
      	for(String s:list) {
			System.out.println(s);
		}
  }
}
