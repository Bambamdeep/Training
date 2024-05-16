package springproject;
import java.util.*;

public class Student {
   public static void main(String [] args) {
//    Set<Integer> al=new HashSet<Integer>();    
//            al.add(10);    
//            al.add(20);    
//            al.add(30);    
//            al.add(32);  
//            al.add(10);
           // al.remove(2);
          //  Collections.sort(al);
           // Collections.reverse(al);
            //System.out.println(al);
	 //  Map<Integer,String> map = new HashMap<Integer,String>();
	   Map<String,String> map = new TreeMap<String,String>();
	   map.put("Dk","Deepak");
	   map.put("AK", "Bambam");
	   map.put("Ck", "Narendra");
	   map.put("Fk", "kumar");
	   map.put("Gk","Bhardwaj");
	   map.remove("Gk");
	   
//	  for (Map.Entry<Integer,String> m : map.entrySet()) {
//		  if (m.getKey().equals(10)) {
//			  System.out.println("true");
//			  break;
//		  }
//		  else {
//			  System.out.println("false");
//			  break;
//	  }
	  System.out.println(map);
	 
	  }

   }


