package com.akash.services;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import org.springframework.stereotype.Service;

@Service
public class CodeExecutorService {
	
	public int execute() throws Exception {
		int errorCode = com.sun.tools.javac.Main.compile(new String[] {
                "-classpath", "bin",
                "-d", "J:\\test",
                "J:\\test\\test.java" });

        URLClassLoader classLoader = new URLClassLoader(new URL[]{new File("J:\\test\\").toURI().toURL()});
        // Load the class from the classloader by name....
        Class<?> loadedClass = classLoader.loadClass("test");
        // Create a new instance...
        Object obj = loadedClass.newInstance();
        Method testing = obj.getClass().getMethod("testing");
        testing.invoke(obj);
        return 0;
	}
	
}
