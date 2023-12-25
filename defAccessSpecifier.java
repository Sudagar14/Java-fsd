package program_one;

public class defAccessSpecifier {
	void display() 
    { 
        System.out.println("You are using default access specifier"); 
    }
	private void display1() 
    { 
        System.out.println("You are using private access specifier"); 
    }
	protected void display2() 
    { 
        System.out.println("This is protected access specifier"); 
    }



	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
       obj.display();
       System.out.println("Private Access Specifier");
       defAccessSpecifier  obj1 = new defAccessSpecifier();
	   obj1.display1();
	   defAccessSpecifier obj2 = new defAccessSpecifier();   
       obj.display2();


	}

}




