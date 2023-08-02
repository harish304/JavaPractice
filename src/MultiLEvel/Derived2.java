package MultiLEvel;

public class Derived2 extends Derived1 {
	  void Derived2(){
		  System.out.println("This Is DerivedMethod 2");
		   
}
	  public static void main( String[]args) {
		  
		  Derived2 DC = new Derived2();
		  DC.Base();
		  DC.Derived1();
		  DC.Derived2();
		  
		  
	  } 

}
