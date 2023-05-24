/*
Question: Demonstrate the difference between abstract class and interface by writing programs
as well as in keypoints.
 */
/*
 Key Points about abstract Classes
 =================================
 1. An Abstract class is a class that cannot be instantiated.
 2. It can have both abstract and non-abstract methods.
 3. Abstract methods are declared without a body and must be extended by the sub classes.
 4. Non-abstract methods can be directly used by the sub classes.
 5. Abstract classes can have constructors.
 6. Subclasses extends the abstract class using the `extends` keyword.
  
 */

package in.com.programs;

abstract class Animals{
	protected String name;
	
	public Animals(String name) {
		this.name = name;
	}
	
	public abstract void sound();
	
	public void sleep() {
		System.out.println(name+" is sleeping....");
	}	
}

class Cat extends Animals{

	public Cat(String name) {
		super(name);
	}
	
	public void sound() {
		System.out.println(name+" says meow meow....");
	}
	
}

public class AbstractClassAndInterface_05 {
	
	public static void main(String[] args) {
		Cat cat = new Cat("Cat");
		cat.sound();
		cat.sleep();
	}

}

/*
  Key Points about interfaces
  ===========================
  1. An interface is a contract that a class can implement.
  2. It can only contain abstract methods and constants(variable declared as `final`).
  3. All methods in an interface are implicitly public and abstract.
  4. Interfaces cannot have constructors.
  5. Classes implement interface using the `implements` keyword.
  6. A class can implements multiple interfaces.
  
  interface Animals{
  		String name = "";
  		
  		void sound();
  		default void sleep(){
  			System.out.println(name+" is sleeping");
  		}
  }
  
  class Cat implements Animals{
  		private String name;
  		
  		public Cat(String name){
  			this.name = name;
  		}
  		
  		public void sound(){
  			System.out.println(name+" says meow meow...."); 
  		}
  }
  
  public class MainApp{
  		public static void main(String[] args){
  			Cat cat = new Cat("Cat");
  			cat.sound();
  			cat.sleep();
  		}
  }
  
 */
