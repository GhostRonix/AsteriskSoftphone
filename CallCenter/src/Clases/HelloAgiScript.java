package Clases;

import org.asteriskjava.fastagi.*;


public class HelloAgiScript extends BaseAgiScript
{    
    public void service(AgiRequest request, AgiChannel channel)
            throws AgiException
    {
        // Answer the channel...
        answer();
        // ...say hello...
        streamFile("welcome");
        streamFile("tt-monkeys");
        // ...and hangup.
        hangup();               
    }        
}