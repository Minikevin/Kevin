package coursetest;
	
public class Demo {
		
	public static void main(String[] args) {
		Generic<String> generic = new Generic<String>("abc");
		System.out.println(generic.getKey());
		
		Generic generic2 = new Generic<>("abcd");
		System.out.println(generic2.getKey());
	}
}
