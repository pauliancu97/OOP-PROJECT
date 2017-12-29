import java.util.*;
import java.io.*;

public class FileHandler<T extends Serializable> {
	private String fileName;
	
	public FileHandler(String fileName) {
		this.fileName = fileName;
	}
	
	public void write(T obj) {
		ArrayList<T> prevList = null;
		prevList = read();
		if(prevList == null)
			prevList = new ArrayList<T>();
		prevList.add(obj);
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(prevList);
			oos.close();
		}catch(IOException e) {
			
		}
	}
	
	public ArrayList<T> read(){
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<T> list = (ArrayList<T>) ois.readObject();
			ois.close();
			return list;
		}catch(IOException e) {
			return null;
		} catch (ClassNotFoundException e) {
			return null;
		}
	}
}
