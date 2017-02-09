package com.asait.nymart.web.util;

public class MessageProductorFactory {
	
	public MessageProductor getMessageProductor(){
		System.out.println("getMessageProductor invoke");
		return new MessageProductor();
	}
}

class MessageProductor{
	
}
