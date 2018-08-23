import second.*;
import java .util.*;
public class Types1  extends Animal{


	public static void main(String[] args) {
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("dog");
		obj.add("bee");
		obj.add("cat");
		obj.add("chimp");
		obj.add("bat");
		System.out.println("\n the display string is\t" +obj);
		obj.add(0,"lion");
		obj.add(1,"tiger");
		obj.remove("bee");
		System.out.println("\n current present names is:\t" +obj);
		obj.remove(0);

		// TODO Auto-generated method stub

		Types1 obj1=new Types1 ();
		obj1.show();
		obj1.display();
	}

	@Override                                     //overriding the function
	public void show() {

		System.out.println("diferent sounds ");
		System.out.println("moo");
	
		System.out.println("caw");
		System.out.println("bellow");
			}
		

			}
	
