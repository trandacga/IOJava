package basic.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// thông tin đối tượng student
		String name;
		int id;
		String cmnd;
		String nameschool;
		String nameclass;
		float dtb;
		
		// thông tin đối tượng Worker
		String nameWorker;
		String nameaddress;
		String phone;
		float coefficient;
		
		// thông tin xe car
		String namecar;
		String nameManufactuner;
		float price;
		String color;
		
		name = " Nguyen Quang hao";
		id = 2060062;
		cmnd = " 197371293";
		nameschool= " HueIC";
		nameclass = "20cdth11";
		dtb = 9.6f;
		
		// thông tin đối tượng Worker
		nameWorker = "tran dac ga";
		nameaddress = "thua thien hue";
		phone = "0367036579";
		coefficient = 3.9f;
		
		//thông tin xe car
		namecar = "Winner x";
		nameManufactuner = "yamaha";
		price = 45000000;
		
		// đối tượng sinh viên
		System.out.println("NAME =" + name);
		System.out.println("IB = "+id);
		System.out.println("CMND = "+ cmnd);
		System.out.println(" NAMESCHOOL = " + nameschool);
		System.out.println("NAMECLASS =" + nameclass);
		System.out.println("DTB = " + dtb);
		
		// thông tin đối tượng worker
		System.out.println("NAMEWORKER = " + nameWorker);
		System.out.println("NAMEADDRESS = "+ nameaddress);
		System.out.println("PHONE ="+ phone);
		System.out.println("COEFFICENT = "+ coefficient);
		
		// thông tin car
		System.out.println("NAMECAR = "+ namecar);
		System.out.println("NAMEMANÙACTUNER = "+ nameManufactuner);
		System.out.println("PRICE = "+ price);

	}

}
