/**
 * MyListTester.java :: Tester in JLibs
 *
 * 		@author: Dylan Hall
 * 		@date: Jul 6, 2017
 * 		@lang: Java
 *
 * //TODO Project Description
 */
package Tester;


import java.util.Random;

import comp.libs.list.*;
import comp.libs.node.*;

public class MyListTester {

	static Salter serial = new Salter();
	public static void main(String[] args) {
		List list = new List();

		for (int i = 1; i <= 10; i++) {
			NodeInfo<String> newNode = new NodeInfo<String>(serial.getSaltString(), i, String.valueOf(i));
			list.addBack(newNode);
		}
	} /* end main */
} /* END CLASS */
