/**
 * 
 */
package com.siemens.Decorator;

import com.siemens.bean.Person;

/**
 * @author Willi
 *
 */
public class SuperPerson implements Person {

	public Person person;
	
	public SuperPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public void run() {
		this.person.run();
		System.out.println("SuperPerson fly...");
	}

}
