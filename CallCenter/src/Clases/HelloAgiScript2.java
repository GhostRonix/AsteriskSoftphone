package Clases;

import org.asteriskjava.fastagi.*;



public class HelloAgiScript2 extends BaseAgiScript {
    private static int counter = 0;
    public void service(AgiRequest request, AgiChannel channel)
            throws AgiException {
        try {        
            setVariable("myvar", "Hello World!");
            // Answer the channel...
            
            answer();
            
            // ...say hello...
            streamFile("welcome");
            
            //streamFile("tt-monkeys");       
            
            channel.exec("Verbose", "2, Hola Mundo");
            verbose("hola mundo", 2);            
            System.out.println("call count :" + counter + channel.getChannelStatus());
        } catch (org.asteriskjava.fastagi.AgiHangupException e) {
            System.out.println("Ha colgado el cabrón!!");
            setVariable("myvar", "Ha colgado el cabrón!!");
        }
        counter++;
    }
}