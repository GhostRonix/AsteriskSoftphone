package Clases;

import org.asteriskjava.live.AsteriskChannel;
import org.asteriskjava.live.AsteriskQueue;
import org.asteriskjava.live.AsteriskQueueEntry;
import org.asteriskjava.live.AsteriskServer;
import org.asteriskjava.live.AsteriskServerListener;
import org.asteriskjava.live.DefaultAsteriskServer;
import org.asteriskjava.live.ManagerCommunicationException;
import org.asteriskjava.live.MeetMeRoom;
import org.asteriskjava.live.MeetMeUser;
import org.asteriskjava.live.internal.AsteriskAgentImpl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public  class HelloLiveEverything implements AsteriskServerListener, PropertyChangeListener
{
    private AsteriskServer asteriskServer;

    public HelloLiveEverything()
    {
        asteriskServer = new DefaultAsteriskServer("localhost", "manager", "pa55w0rd");
    }

    public void run() throws ManagerCommunicationException
    {
        // listen for new events
        asteriskServer.addAsteriskServerListener(this);

        // add property change listeners to existing objects
        for (AsteriskChannel asteriskChannel : asteriskServer.getChannels())
        {
            System.out.println(asteriskChannel);
            asteriskChannel.addPropertyChangeListener(this);
        }

        for (AsteriskQueue asteriskQueue : asteriskServer.getQueues())
        {
            System.out.println(asteriskQueue);
            for (AsteriskQueueEntry asteriskChannel : asteriskQueue.getEntries())
            {
                asteriskChannel.addPropertyChangeListener(this);
            }
        }

        for (MeetMeRoom meetMeRoom : asteriskServer.getMeetMeRooms())
        {
            System.out.println(meetMeRoom);
            for (MeetMeUser user : meetMeRoom.getUsers())
            {
                user.addPropertyChangeListener(this);
            }
        }
    }

    public void onNewAsteriskChannel(AsteriskChannel channel)
    {
        System.out.println(channel);
        channel.addPropertyChangeListener(this);
    }

    public void onNewMeetMeUser(MeetMeUser user)
    {
        System.out.println(user);
        user.addPropertyChangeListener(this);
    }

    public void propertyChange(PropertyChangeEvent propertyChangeEvent)
    {
        System.out.println(propertyChangeEvent);
    }

    public static void main(String[] args) throws Exception
    {
        HelloLiveEverything helloLiveEverything = new HelloLiveEverything();
        helloLiveEverything.run();
    }

	@Override
	public void onNewAgent(AsteriskAgentImpl arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNewQueueEntry(AsteriskQueueEntry arg0) {
		// TODO Auto-generated method stub
		
	}
}