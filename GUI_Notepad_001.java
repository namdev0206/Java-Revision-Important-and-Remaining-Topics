import java.awt.*;
import java.awt.event.*;

class MenuTest extends Frame implements ActionListener
{
	Frame frame;
	MenuBar mb; //MenuBar
	Menu mFile, nEdit, oSearch, pView; //Menu List
	MenuItem miNew, miOpen, miSave, miExit; //File
	MenuItem niCut, niCopy, niPaste, niSelectAll; //Edit
	MenuItem oiFind, oiNext, oiPrevious, oiGoTo; //Search
	MenuItem piZoom, piMove, piTab; //View
	PopupMenu pm; //Popup
	MenuItem miRed, miGreen, miBlue; //MenuItem
	TextArea t1; //TextField
	
	
	public MenuTest()
	{
		mb = new MenuBar();
		mFile = new Menu("File");  //First Menu
		miNew = new MenuItem("New");
		miOpen = new MenuItem("Open..");
		miSave = new MenuItem("Save");
		miExit = new MenuItem("Exit");
		nEdit = new Menu("Edit");  //Second Menu
		niCut = new MenuItem("Cut");
		niCopy = new MenuItem("Copy");
		niPaste = new MenuItem("Paste");
		niSelectAll = new MenuItem("Select All");
		oSearch = new Menu("Search");  //Third Menu
		oiFind = new MenuItem("Find..");
		oiNext = new MenuItem("Next");
		oiPrevious = new MenuItem("Previous");
		oiGoTo = new MenuItem("Go To...");
		pView = new Menu("View");  //Fourth Menu
		piZoom = new MenuItem("Zoom");
		piMove = new MenuItem("Move");
		piTab = new MenuItem("Tab");
		t1 = new TextArea();
		miExit.addActionListener(this);
		
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add("-");
		mFile.add(miExit);
		mb.add(mFile);
		
		nEdit.add(niCut);
		nEdit.add(niCopy);
		nEdit.add(niPaste);
		nEdit.add(niSelectAll);
		mb.add(nEdit);
		
		oSearch.add(oiFind);
		oSearch.add(oiNext);
		oSearch.add(oiPrevious);
		oSearch.add(oiGoTo);
		mb.add(oSearch);
		
		pView.add(piZoom);
		pView.add(piMove);
		pView.add(piTab);
		mb.add(pView);
		
		//frame.add(t1);
		add(t1);
		
		pm = new PopupMenu();
		miRed = new MenuItem("Red");
		miGreen = new MenuItem("Green");
		miBlue = new MenuItem("Blue");
		pm.add(miRed);
		pm.add(miGreen);
		pm.add(miBlue);
		
		add(pm);
		setMenuBar(mb);
		
		addMouseListener(new ML());
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new MenuTest();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
	
	class ML extends MouseAdapter
	{
		public void mouseReleased(MouseEvent e)
		{
			if(e.isPopupTrigger())
				pm.show(e.getComponent(), e.getX(), e.getY());
		}
	}
}