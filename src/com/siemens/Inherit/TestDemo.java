/**
 * 
 */
package com.siemens.Inherit;

import org.junit.jupiter.api.Test;

import com.siemens.bean.Person;

/**
 * @author Willi
 *    使用继承实现功能增强
 *    条件: 得知道要继承的类是谁
 */
public class TestDemo {
	@Test
	public void test() {
		Person person = new SuperPerson();
		person.run();
	}
}
