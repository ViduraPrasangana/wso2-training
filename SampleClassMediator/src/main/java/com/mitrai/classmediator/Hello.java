package com.mitrai.classmediator;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class Hello extends AbstractMediator { 

	public boolean mediate(MessageContext context) { 
		System.out.println("the class mediator"+context);
		context.setProperty("fromClass", "This is the value");
		String val = (String) context.getProperty("fromSequence");
		System.out.println(val);
		return true;
	}
}
