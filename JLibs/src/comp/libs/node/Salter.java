/**
 * SerialIDGenerator.java :: comp.libs.node in JLibs
 *
 * 		@author: Dylan Hall
 * 		@date: Jul 7, 2017
 * 		@lang: Java
 *
 * //TODO Project Description
 */
package comp.libs.node;

import java.util.Random;

public class Salter {
	public String getSaltString() {
		String SALTCHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		int i = 0, k = 0;
		while (salt.length() < 23) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
			i++;
			if(i == 7 && k != 2) {
				salt.append("-");
				i = 0; k++;
			}
		}
		String saltStr = salt.toString();
		System.out.println(saltStr);
		return saltStr;
	} /* END */

} /* END CLASS */
