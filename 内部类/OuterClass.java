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
	
	//�ڴ��������������ڲ���
	class InnerClass{//������
		
		public InnerClass(){
			//���ڲ�����߿���ֱ�ӵķ����ⲿ������κγ�Ա��name��age��������private���ε�����
			name = "����";
			age = 18;
			
		}
		
		public void innerMethod(){//���巽��
			System.out.println(getName());
			System.out.println(getAge());
			
		}
		}
		
		public OuterClass getOuterClass(){
			return OuterClass.this;//OuterClass.this;��ʾһ����Χ��Ķ��������
		}
		
		public static void main(String[] args) {
			OuterClass out = new OuterClass();//ʵ������һ���ⲿ��
			OuterClass.InnerClass inner = out.new InnerClass();//ʵ����/�����ڲ��࣬����ͨ���ⲿ��Ķ���
			inner.innerMethod();
			
			//������getxxx����������.new����
			/*public InnerClass getInnerClass(){
				return new InnerClass();
			}*/
			
		}
}
