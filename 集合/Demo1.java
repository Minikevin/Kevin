package coursetest;

import java.util.List;

import javax.swing.text.LayeredHighlighter;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		List li = new ArrayList();
		
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		
		li.add(3, 44);//在指定的位置添加元素
		
		li.set(3, 33);//在指定的位置改变元素
		
		//普通的for循环遍历集合
		for(int i=0; i<li.size();i++){
		System.out.println(li.get(i));
	}
		
		System.out.println(li.indexOf(33));//输入33所在的位置或者是索引值
		
	
}
}