import java.io.*;

class SerializedCustomer extends Customer implements Serializable 
{
  String phoneNumber;
  static final long serialVersionUID = 2L;

	public SerializedCustomer() {
		phoneNumber = "27613321";
	}

	private void writeObject(ObjectOutputStream out)
		throws IOException
	{
		out.defaultWriteObject();
		out.writeObject(new Integer(getId()));
		out.writeObject(getName());
		out.writeObject(getAddress());
	}

	private void readObject(ObjectInputStream in)
		throws IOException, ClassNotFoundException
	{
		in.defaultReadObject();			
		setId(((Integer)in.readObject()).intValue());
		setName((String)in.readObject());
		setAddress((String)in.readObject());
	}

	public String toString() {
		String line = "Id= " +getId()+ ", Name= " +getName()+ 
			", Address= " +getAddress()+ ", Phone Number= " +phoneNumber;
		return line;
	}
}

public class SerializationDemo 
{
	public static void main( String [] args ) throws Exception 
{
		SerializedCustomer serCustomer = new SerializedCustomer();
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
		SerializedCustomer newInstance =
 			(SerializedCustomer)ois.readObject();

		System.out.println("After reading from file: " +newInstance);
	}
}
