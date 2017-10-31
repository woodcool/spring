package com.briup.theory.aop.cglib;

public class TestCglibProxy {
	public static void main(String[] args) {  
        MyCglibProxyFactory factory = new MyCglibProxyFactory();  
        
        BookService proxy= 
        	(BookService)factory.getInstance(BookService.class);  
        
        proxy.addBook();  
        
        System.out.println("------------------");
        System.out.println(proxy.getClass());
    }  
}
