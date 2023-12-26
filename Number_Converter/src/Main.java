import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*This program take a choice from user and according to user's choice it
        converts the number*/

        System.out.println("...Please Enter your choice....");
        System.out.println("1.Conversion of Binary number");
        System.out.println("2.Conversion of Decimal number");
        System.out.println("3.Conversion of Hexadecimal number");
        System.out.println("4.Conversion of Octal number");
        System.out.println("-----------");

       //take input or choice from user
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("....Select your Choice....");
                System.out.println("1.Binary to Decimal");
                System.out.println("2.Binary to Octal");
                System.out.println("3.Binary to Hexadecimal");
                int ch1 = sc.nextInt();
                switch(ch1)
                {
                    case 1:
                        System.out.println("Enter a Binary number:");
                        int bno = sc.nextInt();
                        int decimal =Integer.parseInt(String.valueOf(bno),2);
                        System.out.println("Decimal number of "+bno+ " is "+decimal);
                        break;
                    case 2:
                        System.out.println("Enter a Binary number:");
                        int bno1 = sc.nextInt();
                        int decimal1 =Integer.parseInt(String.valueOf(bno1),2);
                        String octal = Integer.toOctalString(decimal1);
                        System.out.println("Octal number of "+bno1+ " is "+octal);
                        break;
                    case 3:
                        System.out.println("Enter a Binary number:");
                        int bno2 = sc.nextInt();
                        int decimal3 =Integer.parseInt(String.valueOf(bno2),2);
                        String hexa = Integer.toHexString(decimal3);
                        System.out.println("Hexadecimal number of "+bno2+ " is "+hexa);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
                break;
            case 2:
                System.out.println("....Select your Choice....");
                System.out.println("1.Decimal to Binary");
                System.out.println("2.Decimal to Octal");
                System.out.println("3.Decimal to Hexadecimal");
                int ch2 = sc.nextInt();
                switch (ch2)
                {
                    case 1:
                        System.out.println("Enter a Decimal number:");
                        int d1 = sc.nextInt();
                        String binary =Integer.toBinaryString(d1);
                        System.out.println("Binary number of "+d1+ " is "+binary);
                        break;
                    case 2:
                        System.out.println("Enter a Decimal number:");
                        int d2 = sc.nextInt();
                        String octal =Integer.toOctalString(d2);
                        System.out.println("Octal number of "+d2+ " is "+octal);
                        break;
                    case 3:
                        System.out.println("Enter a Decimal number:");
                        int d3 = sc.nextInt();
                        String hexa =Integer.toHexString(d3);
                        System.out.println("Hexadecimal number of "+d3+ " is "+hexa);
                        break;
                    default:
                        System.out.println("Invalid Choice");

                }
                break;

            case 3:
                System.out.println("....Select your Choice....");
                System.out.println("1.Hexadecimal to Decimal");
                System.out.println("2.Hexadecimal to Binary");
                int ch3 = sc.nextInt();
                switch (ch3)
                {
                    case 1:
                        System.out.println("Enter a Hexadecimal number:");
                        String h1 = sc.next();
                        int deci =Integer.parseInt(String.valueOf(h1),16);
                        System.out.println("Decimal number of "+h1+ " is "+deci);
                        break;
                    case 2:
                        System.out.println("Enter a Hexadecimal number:");
                        String h2 = sc.next();
                        int decimal =Integer.parseInt(String.valueOf(h2),16);
                        String hexa = Integer.toBinaryString(decimal);
                        System.out.println("Binary number of "+h2+ " is "+hexa);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
                break;
            case 4:
                System.out.println("....Select your Choice...");
                System.out.println("1.Octal to Decimal");
                System.out.println("2.Octal to Binary");
                int ch4 = sc.nextInt();
                switch (ch4)
                {
                    case 1:
                        System.out.println("Enter a Octal number:");
                        int o1 = sc.nextInt();
                        int decimal = Integer.parseInt(String.valueOf(o1),8);
                        System.out.println("Decimal number of "+o1+ " is "+decimal);
                        break;
                    case 2:
                        System.out.println("Enter a Octal number:");
                        int o2 = sc.nextInt();
                        int decimal1 = Integer.parseInt(String.valueOf(o2),8);
                        String binary = Integer.toBinaryString(decimal1);
                        System.out.println("Decimal number of "+o2+ " is "+binary);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}