package coursetest;

import org.omg.CORBA.PUBLIC_MEMBER;

public class OuterClass {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//在大类体里面的类叫内部类
	class InnerClass{//构造器
		
		public InnerClass(){
			//在内部类里边可以直接的访问外部类里的任何成员，name，age，他们是private修饰的属性
			name = "张三";
			age = 18;
			
		}
		
		public void innerMethod(){//定义方法
			System.out.println(getName());
			System.out.println(getAge());
			
		}
		}
		
		public OuterClass getOuterClass(){
			return OuterClass.this;//OuterClass.this;表示一个外围类的对象的引用
		}
		
		public static void main(String[] args) {
			OuterClass out = new OuterClass();//实例化了一个外部类
			OuterClass.InnerClass inner = out.new InnerClass();//实例化/访问内部类，必须通过外部类的对象！
			inner.innerMethod();
			
			//可以用getxxx方法来代替.new方法
			/*public InnerClass getInnerClass(){
				return new InnerClass();
			}*/
			
		}
}
