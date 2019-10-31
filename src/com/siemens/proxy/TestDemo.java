/**
 * 
 */
package com.siemens.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Test;

import com.siemens.bean.NormalPerson;
import com.siemens.bean.Person;

/**
 * @author Willi
 * 动态代理 
 * 	代理的概念: 图
				
 * 	条件:
 * 		1 必须得知道要被代理的类/对象是谁
 * 
 * 	
 * 	动态代理:动态的给我们生成代理类/代理对象
 * 	动态: 这个东西我们不用写,java已经给我们提供好了
 * 	JDK的动态代理:
 *      Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) 
 * 		返回一个指定接口的代理类实例 	
 * 			
 * 
 * 	扩展: CGLIB的动态代理(导包)
 */
public class TestDemo {
	@Test
	public void test() {
		Person person = new NormalPerson();
		
		/**
		 *	 参数1：要被增强对象的类加载器
		 * 	参数2：和要被增加的对象一样的接口
		 * 	参数3：增强函数
		 * */
		Person proxyPerson = (Person)Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(), 
				new InvocationHandler() {
					/*
					 * proxy: 固定
					 * method: 要被增强的方法
					 * args: 要被增强的方法的参数
					 * **/
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						
						// 要增强的方法
						if(method.getName().equals("run")) {
							method.invoke(person, args);
							System.out.println("Proxy fly...");
						}
						else {
							method.invoke(person, args);
						}
						return null;
					}
				});
		
		proxyPerson.run();//执行该方法，会调用invoke方法
	}
}
