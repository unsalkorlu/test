package com.ukorlu;

import com.ukorlu.utility.FileUtil;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		for (String string : args) {
			builder.append(string + "\r\n");
		}
		FileUtil.writeFile("C:/data/out.txt", builder.toString());
	}
}
