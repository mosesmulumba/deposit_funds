public class AccountDeposit{
    public static void main(String [] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        Account centenaryAccount = new Account(10000.00);
        Account stanbicAccount = new Account(20000.00);
        Account dfcuAccount = new Account(15000.00);
        Account cairoAccount = new Account(-900.00);

        System.out.printf("The initial amount on the Centenary Account is : UGX %.2f\n" , centenaryAccount.getBalance());
        System.out.printf("The initial amount on the Stanbic Account is : UGX %.2f\n" , stanbicAccount.getBalance());
        System.out.printf("The initial amount on the DFCU Account is : UGX %.2f\n" , dfcuAccount.getBalance());
        System.out.printf("The initial amount on the Cairo Account is : UGX %.2f\n" , cairoAccount.getBalance());

        System.out.println();
        System.out.println("Hello, there!, which account do you want to deposit on.");
        System.out.println("Enter 1 for Centenary Account , 2 for Stanbic Account , 3 for DFCU Account and 4 for Cairo Account.");
        System.out.println("Thanks for using the sarams-services !");

        int choice;
        choice = input.nextInt();

        switch(choice){
            case 1:
                 // prompt user to deposit to centenary Account
                double depositAmount;
                System.out.println("Enter the money you want to deposit onto the Centenary Account : ");
                depositAmount = input.nextDouble();
                centenaryAccount.credit(depositAmount);
                System.out.printf("\nadding %.2f to the Centenary Account .\n" , depositAmount);
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println();

                // display the changed and unchanged accounts
                System.out.printf("The current amount on the Centenary Account is : UGX %.2f\n\n" , centenaryAccount.getBalance());
                System.out.printf("The current amount on the Stanbic Account is : UGX %.2f\n\n" , stanbicAccount.getBalance());
                System.out.printf("The current amount on the DFCU Account is : UGX %.2f\n\n" , dfcuAccount.getBalance());
                System.out.printf("The current amount on the Cairo Account is : UGX %.2f\n\n" , cairoAccount.getBalance());
                break;

            case 2:
                // prompt user to deposit onto the stanbic account
                System.out.println("Enter the money you want to deposit onto the Stanbic Account : ");
                depositAmount = input.nextDouble();
                stanbicAccount.credit(depositAmount);
                System.out.printf("\nadding %.2f to the Stanbic Account .\n" , depositAmount);
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println();

                 // display the changed and unchanged accounts
                System.out.printf("The current amount on the Centenary Account is : UGX %.2f\n\n" , centenaryAccount.getBalance());
                System.out.printf("The current amount on the Stanbic Account is : UGX %.2f\n\n" , stanbicAccount.getBalance());
                System.out.printf("The current amount on the DFCU Account is : UGX %.2f\n\n" , dfcuAccount.getBalance());
                System.out.printf("The current amount on the Cairo Account is : UGX %.2f\n\n" , cairoAccount.getBalance());
                break;

            case 3:
                 // prompt user to deposit onto the dfcu account
                System.out.println("Enter the money you want to deposit onto the DFCU Account : ");
                depositAmount = input.nextDouble();
                dfcuAccount.credit(depositAmount);
                System.out.printf("\nadding %.2f to the DFCU Account .\n" , depositAmount);
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println();

                 // display the changed and unchanged accounts
                System.out.printf("The current amount on the Centenary Account is : UGX %.2f\n\n" , centenaryAccount.getBalance());
                System.out.printf("The current amount on the Stanbic Account is : UGX %.2f\n\n" , stanbicAccount.getBalance());
                System.out.printf("The current amount on the DFCU Account is : UGX %.2f\n\n" , dfcuAccount.getBalance());
                System.out.printf("The current amount on the Cairo Account is : UGX %.2f\n\n" , cairoAccount.getBalance());
                break;

            case 4:
                 // prompt user to deposit onto the CAIRO account
                System.out.println("Enter the money you want to deposit onto the Cairo Account : ");
                depositAmount = input.nextDouble();
                cairoAccount.credit(depositAmount);
                System.out.printf("\nadding %.2f to the Cairo Account .\n" , depositAmount);
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println();

                 // display the changed and unchanged accounts
                System.out.printf("The current amount on the Centenary Account is : UGX %.2f\n\n" , centenaryAccount.getBalance());
                System.out.printf("The current amount on the Stanbic Account is : UGX %.2f\n\n" , stanbicAccount.getBalance());
                System.out.printf("The current amount on the DFCU Account is : UGX %.2f\n\n" , dfcuAccount.getBalance());
                System.out.printf("The current amount on the Cairo Account is : UGX %.2f\n\n" , cairoAccount.getBalance());
                break;

            default:
                System.out.printf("The current amount on the Centenary Account is : UGX %.2f\n\n" , centenaryAccount.getBalance());
                System.out.printf("The current amount on the Stanbic Account is : UGX %.2f\n\n" , stanbicAccount.getBalance());
                System.out.printf("The current amount on the DFCU Account is : UGX %.2f\n\n" , dfcuAccount.getBalance());
                System.out.printf("The current amount on the Cairo Account is : UGX %.2f\n\n" , cairoAccount.getBalance());


        }
        
    }
}