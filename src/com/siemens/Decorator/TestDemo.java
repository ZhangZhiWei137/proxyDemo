/**
 * 
 */
package com.siemens.Decorator;

import org.junit.jupiter.api.Test;

import com.siemens.bean.NormalPerson;
import com.siemens.bean.Person;

/**
 * @author Willi
 *	不需要知道父类是谁 只需要知道接口即可
 *				
 *	条件:
 *		1 装饰者和被装饰需要实现同一个接口
 *		2 装饰者有被装饰者的引用
 *
 *	缺点: 工作量大
 */
public class TestDemo {
	@Test
	public void test() {
		Person person = new SuperPerson(new NormalPerson());
		person.run();
	}
}
