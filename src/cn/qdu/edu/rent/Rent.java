package cn.qdu.edu.rent;

import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Rent {
	double total=0;
	public void rentMoto() {
	    int num=0 ;
		String[] carType = { "����", "����", "�µ�" };
		int[] busType = { 10, 32 };
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ���ٱ���˾�⳵ϵͳ��");
		System.out.println("��������Ҫ���õĳ�����:");
		num = input.nextInt();
		double[][] vehicle=new double[num][3];
		for (int i = 0; i < num; i++) {
		System.out.println("�����������⳵������");
		int day = input.nextInt();
		vehicle[i][1]=day;
		System.out.println("1��car or 2��bus");
		int sel = input.nextInt();
		if (sel == 1) {
			System.out.println("type 1��bmw 2��audi 3��benc");
			sel = input.nextInt();
			vehicle[i][0]=sel;
			vehicle moto = new Car("³ B88888");
			// moto.setType(carType[sel - 1]);
			// �������
			double totalFee = moto.rentFee(day);
			// ������
			vehicle[i][2]=totalFee;
			switch (sel) {
			case 1:
				System.out.println("�����õĳ���Ϊ��������ʱ��Ϊ��"+vehicle[i][1]+"���ý��Ϊ��"+vehicle[i][2]);
				    break;
            case 2:
            	System.out.println("�����õĳ���Ϊ�µϣ�����ʱ��Ϊ��"+vehicle[i][1]+"���ý��Ϊ��"+vehicle[i][2]);
				    break;
				case 3:
				System.out.println("�����õĳ���Ϊ���ۣ�����ʱ��Ϊ��"+vehicle[i][1]+"���ý��Ϊ��"+vehicle[i][2]);
					break;
			default:
				break;
			}
			
		} else {
			System.out.println("seatCount 1�� < 16 2�� > 16");
			sel = input.nextInt();
			vehicle moto = new Bus("³ A88888");
			// �������
			double totalFee = moto.rentFee(day);
			// ������
			vehicle[i][2]=totalFee;
			switch (sel) {
			case 1:
				System.out.println("�����õĳ���Ϊʮ�������¿ͳ�������ʱ��Ϊ��"+vehicle[i][1]+"���ý��Ϊ��"+vehicle[i][2]);
				    break;
            case 2:
            	System.out.println("�����õĳ���Ϊʮ�������Ͽͳ�������ʱ��Ϊ��"+vehicle[i][1]+"���ý��Ϊ��"+vehicle[i][2]);
				    break;
				
			default:
				break;
			}
		for (int j = 0; j < num; j++) {
			total=total+(int)vehicle[i][2];
		}
		System.out.println("�����ܻ����ǣ�"+total);
	}}}
	
	public static void main(String[] args) {
		new Rent().rentMoto();
	}
}
