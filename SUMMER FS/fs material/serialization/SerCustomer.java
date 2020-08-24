import java.io.*;

public class SerCustomer implements Serializable {
	 int 	id;
     String	name ;
	 String	address;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

  public String toString() {
		String line = "Id= " +getId()+ ", Name= " +getName()+ 
			", Address= " +getAddress();
		return line;
	}

  public static void main( String [] args ) throws Exception 
  {
		SerCustomer serCustomer = new SerCustomer();
		serCustomer.setId(1);
		serCustomer.setName("Genesis");
		serCustomer.setAddress("Hyderabad");

		System.out.println("Before Writing to file: " +serCustomer);

 		FileOutputStream fos = new FileOutputStream("Customer.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(serCustomer);
		oos.flush(); 

		FileInputStream fis = new FileInputStream("Customer.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerCustomer newInstance =
 			(SerCustomer)ois.readObject();

		System.out.println("After reading from file: " +newInstance);
	}
}
