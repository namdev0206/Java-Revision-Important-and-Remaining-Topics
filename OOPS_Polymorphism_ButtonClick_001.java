// OOPS - Polymorphism

interface ButtonClickListener
{
	void onClick();
}

class Button
{
	private ButtonClickListener listener;
	
	public void setClickListener(ButtonClickListener listener)
	{
		this.listener = listener;
	}
	
	public void click()
	{
		if(listener != null)
		{
			listener.onClick();
		}
	}
}

//Main
class ButtonClick
{
	public static void main(String args[])
	{
		Button button = new Button();
		
		
	}
}