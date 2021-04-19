package NoSwearing;

import java.util.ArrayList;

public class messageQueue {

	private ArrayList<String> messages = new ArrayList<String>();
	private int queueLength = 10;

	public messageQueue (int stack)
	{
		queueLength = stack;
	}
	
	public String getText() {

		String sb = "";

		for (String msg : messages) {
			sb = sb.concat(msg).concat("  ");
		}
		return sb;
	}

	public void setMessages(String b) {

		messages.add(b);
		int counter=messages.size();
		
		if (counter > queueLength)
		{
			messages.remove(0);
		}

	}
	
	public String getLast()
	{
		
		int counter=messages.size();
		return messages.get(counter-1);
		
	}
		
	public void clear()
	{
		messages.clear();	
	}

}
