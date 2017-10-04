package com.mdc.aop;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @see https://www.safaribooksonline.com/library/view/mockito-for-spring/9781783983780/ch01s07.html
 */
public class AOPTest {
    public static void main(String[] args) {
        MessageWriter target = new MessageWriter();
        // create the proxy
        ProxyFactory pf = new ProxyFactory();
        // Add the given AOP Alliance advice to the tail
        // of the advice (interceptor) chain
        pf.addAdvice(new MessageDecorator());
        // Set the given object as target
        pf.setTarget(target);
        // Create a new proxy according to the
        // settings in this factory
        MessageWriter proxy = (MessageWriter)
                pf.getProxy();
        // write the messages
        target.writeMessage();
        System.out.println("");
        // use the proxy
        proxy.writeMessage();
    }
}
