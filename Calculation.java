import java.util.*;

public class Calculation {
	static float ROX;
	static double IBW;
	static double ETT;

	public static void cal(int a, float b, int c) {

		ROX = ((a / b) / c);
		System.out.println("the ROX index value = " + ROX);
		if (ROX >= 4.88) {
			Scanner s = new Scanner(System.in);
			Scanner s1 = new Scanner(System.in);
			Scanner s2 = new Scanner(System.in);

			System.out.println("ALERT!!!!!!!   patient requires oxygen supply ");
			System.out.println("TIDAL VOLUME NEED TO BE CALCULATED TO SUPPLY REQUIRED AMOUNT OXYGEN");
			System.out.println("enter the patient's gender  M-male or F-female");
			String gender = s.nextLine();
			if (gender == "M") {
				System.out.println("enter the height of patient in cms");
				float h = s1.nextFloat();
				IBW = (50 + 0.9 * (h - 152));
				System.out.println("THE LUNG CAPACITY OF THE PATIENT is " + IBW + " ml");
				float min = (float) (6 * IBW);
				float max = (float) (8 * IBW);
				System.out.println("THE MINIMUM TIDAL VOLUME SHOULD BE= " + min + " ml");
				System.out.println("THE MAXIMUM TIDAL VOLUME SHOULD BE= " + max + " ml");

			} else {
				System.out.println("enter the height of patient in cms");
				float h1 = s2.nextFloat();
				IBW = 45.5 + 0.9 * (h1 - 152);
				System.out.println("THE LUNG CAPACITY OF THE PATIENT IS " + IBW + " ml");
				float min = (float) (6 * IBW);
				float max = (float) (8 * IBW);
				System.out.println("THE MINIMUM TIDAL VOLUME SHOULD BE = " + min + " ml");
				System.out.println("THE MAXIMUM TIDAL VOLUME SHOULD BE = " + max + " ml");

			}
		} else if (ROX < 3.85) {
			System.out.println("patient needs INTUBATION!!!!!!");
			System.out.println("enter the height of patient in cms");
			Scanner k = new Scanner(System.in);
			double h2 = k.nextDouble();
			ETT = 0.1 * h2 + 4;
			System.out.println("the estimated depth is ETT = " + ETT + " cms ");

		} else {
			System.out.println("patient normal no oxygen required !!!!!!");
		}

	}

	public static void main(String[] args) {

		beep beepobject = new beep();
		Scanner myObj = new Scanner(System.in);
		Scanner myObj1 = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Enter a spO2 value between the range (max=99) and (min<=95)");
		int spo2 = myObj.nextInt();
		System.out.println("Enter a fio2 value ");

		float fio2 = myObj.nextFloat();
		System.out.println("enter a  rr value range >=50,35-40,25-34");
		int rr = myObj.nextInt();
		if (spo2 >= 95) {
			System.out.println("patient saturation level is normal oxygen supply not required!!!!!");
		} else if (spo2 > 85 && spo2 < 90) {
			System.out.println("initiating hardware to  supply oxygen  to patient.........");
			cal(spo2, fio2, rr);
		} else {
			System.out.println("patient condition critical oxygen pressure increased and monitoring needed!!!!!!");
			beepobject.alert();
			cal(spo2, fio2, rr);

		}

	}

}
