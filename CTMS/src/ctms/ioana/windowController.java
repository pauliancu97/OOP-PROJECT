package ctms.ioana;

import java.util.ArrayList;

public class windowController {
	
	private movieWindow view;
	private bookingWindow view1;
	
	public windowController() {
		this.view = new movieWindow();
		this.view1 = new bookingWindow();
		
		this.view.addNew3(e->{ 
			
			this.view1.setVisible(true);
			this.view.setVisible(false);
		});
		
		this.view1.addNew(e->{
			ArrayList<String> mymovieData = new ArrayList<>();
			mymovieData.add("COCO MOVIE");
			mymovieData.add("Ceva Data1");
			mymovieData.add("Ceva Data2");
			mymovieData.add("Ceva Data3");
			mymovieData.add("Ceva Data4");
			mymovieData.add("Ceva Data1");
			mymovieData.add("Ceva Data2");
			mymovieData.add("Ceva Data3");
			mymovieData.add("Ceva Data4");
			mymovieData.add("Ceva Data1");
			mymovieData.add("Ceva Data2");
			mymovieData.add("Ceva Data3");
			mymovieData.add("Ceva Data4");
			mymovieData.add("Ceva Data1");
			mymovieData.add("Ceva Data2");
			mymovieData.add("Ceva Data3");
			mymovieData.add("Ceva Data4");
			mymovieData.add("Ceva Data1");
			mymovieData.add("Ceva Data2");
			mymovieData.add("Ceva Data3");
			mymovieData.add("Ceva Data4");
			this.view.setTextField(mymovieData);
			this.view1.setVisible(false);
			this.view.setLocation(this.view1.getLocation().x,this.view1.getLocation().y);
			this.view.setVisible(true);
		});
		
	}

}
