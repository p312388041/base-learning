package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class SystemLog { 
    private static MessageSource messageSource;
 
    @Autowired
    @SuppressWarnings("java:S2325")
    private synchronized void setMessageSource(MessageSource messageSource) {
        SystemLog.messageSource = messageSource;
    }

    public static void print() {
        System.out.println("------------" + messageSource); 

    }
}
