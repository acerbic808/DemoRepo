package Learning2;

class Base1 { 
    
    // Static method in base class which will be hidden in subclass  
    public static void display() { 
        System.out.println("Static or class method from Base"); 
    } 
      
     // Non-static method which will be overridden in derived class  
     public void print()  { 
         System.out.println("Non-static or Instance method from Base"); 
    } 
} 
  
// Subclass 
class Derived1 extends Base1 { 
      
    // Static is removed here (Causes Compiler Error)  
    public void display(int n) { 
        System.out.println("Non-static method from Derived"); 
    } 
      
    // Static is added here (Causes Compiler Error)  
    public static void print(int n) { 
        System.out.println("Static method from Derived"); 
   } 
} 

public class Testing_static2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
