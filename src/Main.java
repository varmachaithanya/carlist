import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int ch=0;
        int num=9;
        Vehicle[] list = new Vehicle[20];


        do{

        Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to car parking");
            System.out.println("1: To insert car details " + "\n" + "2: To display the cars lot" + "\n" + "3: To find a car");
            int choice = sc.nextInt();


            Vehicle v1 = new Vehicle("ABC101", "Tata", "Red");
            Vehicle v2 = new Vehicle("ABC102", "Hundai", "Black");
            Vehicle v3 = new Vehicle("ABC103", "Toyota", "White");
            Vehicle v4 = new Vehicle("ABC104", "Audi", "Blue");
            Vehicle v5 = new Vehicle("ABC105", "Volvo", "Orange");
            Vehicle v6 = new Vehicle("ABC106", "BMW", "Red");
            Vehicle v7 = new Vehicle("ABC107", "Tata", "Black");
            Vehicle v8 = new Vehicle("ABC108", "Audi", "Red");
            Vehicle v9 = new Vehicle("ABC109", "Toyota", "White");
            Vehicle v10 = new Vehicle("ABC110", "Tata", "Blue");

            list[0] = v1;
            list[1] = v2;
            list[2] = v3;
            list[3] = v4;
            list[4] = v5;
            list[5] = v6;
            list[6] = v7;
            list[7] = v8;
            list[8] = v9;
            list[9] = v10;


                switch (choice){
                    case 1:
                        System.out.println("Enter the license number");
                        String license_plate = sc.next();
                        System.out.println("Enter the brand name");
                        String brand = sc.next();
                        System.out.println("Enter the colour");
                        String color = sc.next();
                        num++;
                        list[num] = new Vehicle(license_plate, brand, color);
                        System.out.println(list[num]);
                        break;
                    case 2:
                        System.out.println("Cars in the lot are");
                        for (int i = 0; i < num+1; i++) {
                            System.out.println(list[i]);
                        }
                        break;
                    case 3:
                        System.out.println("Enter license plate number");
                        String check = sc.next();
                        for (int i = 0; i < num+1; i++) {
                            if (list[i].license_plate.equals(check)) {
                                System.out.println(list[i]);
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid option");
                }




            System.out.println("To stop the process press 1:");
            ch= sc.nextInt();
        }while(ch!=1);
    }
}
