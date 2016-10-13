package quickCoding3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ThreeException extends Exception{
	public ThreeException(){
		super("3�ڸ� �Ѿ");
	}
}

public class QuickCoding3main {

	public static void main(String[] args) throws IOException {
		InputStreamReader br = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(br);
		
		String strnum1, strnum2;
		
		int intnum1, intnum2;
		
		try {
			System.out.print("�Է� :");
			strnum1 = in.readLine();
			
			System.out.print("�Է� :");
			strnum2 = in.readLine();
			
			intnum1 = Integer.parseInt(strnum1);
			intnum2 = Integer.parseInt(strnum2);
			
			if((intnum1 >=1000) || (intnum2 > 1000)){
				throw new ThreeException();
			}
			else
			{
				System.out.print(intnum1 / intnum2);
			}
			
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ����.");
		} catch (NumberFormatException e){
			System.out.println("���� �ƴ�");
		} catch (ThreeException e){
			System.out.println("3�ڸ� ����");
		}

	}

}