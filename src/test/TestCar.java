package test;

import main.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
//        Tạo các đối tượng xe và nhập thông tin
//        Xuất bảng kê khai tiền thuế của các xe.
//        Thoát

        System.out.print("Nhập số lượng xe: ");
        int n = new Scanner(System.in).nextInt();
        List<Car> listCar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Car car = new Car();

            System.out.println("Nhập thông tin của xe thứ " + (i + 1));
            System.out.print("Price: ");
            car.setPrice(new Scanner(System.in).nextDouble());

            System.out.print("Volume: ");
            car.setVolume(new Scanner(System.in).nextInt());
            listCar.add(car);


        }
        System.out.println("Option 1: Tạo các đối tượng xe và nhập thông tin");
        System.out.println("Option 2: Xuất bảng kê khai tiền thuế của các xe.");
        System.out.println("Option 3: Exit");
        System.out.println("Nhập lựa chon:");
        int select = new Scanner(System.in).nextInt();

        switch (select) {
            case 1:
                System.out.println("List car");
                System.out.println();
                for (int i = 0; i < listCar.size(); i++) {
                    System.out.println(" Thông tin của xe thứ " + (i + 1) + "là: ");
                    System.out.println("Price: " + listCar.get(i).getPrice());
                    System.out.println("Volume: " + listCar.get(i).getVolume());
                }
                break;
            case 2:
                for (int i = 0; i < listCar.size(); i++) {
                    System.out.println("Tiền thuế của xe thứ " + (i + 1) + " là: " + listCar.get(i).getTax());
                }
                break;
            default:
                System.out.println("Exist!");
        }
    }
}
