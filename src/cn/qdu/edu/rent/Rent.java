package cn.qdu.edu.rent;

import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Rent {
	double total=0;
	public void rentMoto() {
	    int num=0 ;
		String[] carType = { "宝马", "奔驰", "奥迪" };
		int[] busType = { 10, 32 };
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎光临本公司租车系统！");
		System.out.println("请输入您要租用的车辆数:");
		num = input.nextInt();
		double[][] vehicle=new double[num][3];
		for (int i = 0; i < num; i++) {
		System.out.println("请输入您想租车的天数");
		int day = input.nextInt();
		vehicle[i][1]=day;
		System.out.println("1、car or 2、bus");
		int sel = input.nextInt();
		if (sel == 1) {
			System.out.println("type 1、bmw 2、audi 3、benc");
			sel = input.nextInt();
			vehicle[i][0]=sel;
			vehicle moto = new Car("鲁 B88888");
			// moto.setType(carType[sel - 1]);
			// 计算租金
			double totalFee = moto.rentFee(day);
			// 输出结果
			vehicle[i][2]=totalFee;
			switch (sel) {
			case 1:
				System.out.println("您租用的车辆为宝马，租用时间为："+vehicle[i][1]+"租用金额为："+vehicle[i][2]);
				    break;
            case 2:
            	System.out.println("您租用的车辆为奥迪，租用时间为："+vehicle[i][1]+"租用金额为："+vehicle[i][2]);
				    break;
				case 3:
				System.out.println("您租用的车辆为奔驰，租用时间为："+vehicle[i][1]+"租用金额为："+vehicle[i][2]);
					break;
			default:
				break;
			}
			
		} else {
			System.out.println("seatCount 1、 < 16 2、 > 16");
			sel = input.nextInt();
			vehicle moto = new Bus("鲁 A88888");
			// 计算租金
			double totalFee = moto.rentFee(day);
			// 输出结果
			vehicle[i][2]=totalFee;
			switch (sel) {
			case 1:
				System.out.println("您租用的车辆为十六座以下客车，租用时间为："+vehicle[i][1]+"租用金额为："+vehicle[i][2]);
				    break;
            case 2:
            	System.out.println("您租用的车辆为十六座以上客车，租用时间为："+vehicle[i][1]+"租用金额为："+vehicle[i][2]);
				    break;
				
			default:
				break;
			}
		for (int j = 0; j < num; j++) {
			total=total+(int)vehicle[i][2];
		}
		System.out.println("您的总花费是："+total);
	}}}
	
	public static void main(String[] args) {
		new Rent().rentMoto();
	}
}
