/**
 * 
 */
package com.siemens.Inherit;

import com.siemens.bean.NormalPerson;

/**
 * @author Willi
 *
 */
public class SuperPerson extends NormalPerson {

	@Override
	public void run() {
		super.run();
		System.out.println("SuperPerson fly...");
	}

}
