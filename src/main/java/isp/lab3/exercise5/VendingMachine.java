package isp.lab3.exercise5;


import java.util.Scanner;

public class VendingMachine {
    String product;
    int credit;
    int totalNumberOfProducts=5;
    int [] price = new int[5];
    int [] numberOfSpecificProduct = new int [5];
    String [] Products = new String[totalNumberOfProducts];
    public VendingMachine(int totalNumberOfProducts){
        for(int i=0;i<totalNumberOfProducts;i++){
            this.Products[i]="Empty";
            this.price[i]=0;
            this.numberOfSpecificProduct[i]=0;
        }
    }
    public VendingMachine(String product,int numberOfSpecificProduct,int price){
        int i=0;
        this.Products[i]=product;
        this.price[i]=price;
        this.numberOfSpecificProduct[i]=numberOfSpecificProduct;
    }
    public void populateVendingMachine(){
            for(int i=0;i<totalNumberOfProducts;i++){
                System.out.println("Introduce the name of the product: ");
                Scanner in = new Scanner(System.in);
                this.Products[i]=in.next();
                System.out.println("Introduce the price: ");
                this.price[i]=in.nextInt();
                System.out.println("Introduce the number of products:");
                this.numberOfSpecificProduct[i]=in.nextInt();
            }
    }
    public void  displayProducts(){
        for(int i=0;i<totalNumberOfProducts;i++)
             System.out.println("Product " + Products[i] + " have id " + i + " ,price " + price[i] + "");
    }
    public void adminMenu(){
        System.out.println("Welcome Admin!");
        Scanner in = new Scanner(System.in);
        int option=0;
        while(true) {
            System.out.println("To add products press 1");
            System.out.println("To show product list press 2");
            System.out.println("To exit press 3");
            option=in.nextInt();
            switch (option){
                case 1:{
                    populateVendingMachine();
                }
                break;
                case 2:{
                    displayProducts();
                }
                break;
                case 3:{
                   userMenu();
                }
                break;
                default:{
                    System.out.println("Wrong option!");
                }
            }
        }
    }
    public String selectProduct(int id){
        if(id>totalNumberOfProducts) {
            System.out.println("The product does not exist!");
            userMenu();
        }
        return Products[id];
    }
    public int insertCoin(int value){
            return credit=value;
    }
    public void displayCredit(){
        System.out.println("Credit: "+credit+"");
    }
    public void userMenu(){
        System.out.println("Welcome customer!");
        Scanner in = new Scanner(System.in);
        int option=0;
        while(true) {

            System.out.println("To pick a product press 1");
            System.out.println("To show product list press 2");
            System.out.println("To show credit press 3");
            System.out.println("To insert coins press 4");
            option=in.nextInt();
            switch (option){
                case 1:{
                    System.out.println("Introduce the id of the product");
                    Scanner in1 = new Scanner(System.in);
                    int id=in1.nextInt();
                    System.out.println(selectProduct(id));
                    int optionForBuy=0;
                    System.out.println("Press 1 to buy or 2 to exit.");
                    Scanner optionForBuyin = new Scanner(System.in);
                    optionForBuy=optionForBuyin.nextInt();
                    switch (optionForBuy){
                        case 1:{
                                    if(price[id]>credit){
                                        System.out.println("Not enough coins!");
                                    }
                                    else {
                                        if(price[id]<=credit){
                                            int optionForRest;
                                            System.out.println("For the rest press 5 and for the menu press 6");
                                            Scanner optionForRestin = new Scanner(System.in);
                                            optionForRest=optionForRestin.nextInt();
                                            switch (optionForRest){
                                                case 5:{
                                                    System.out.println("You rest is "+(credit-price[id])+"");
                                                }
                                                break;
                                                case 6:{
                                                    userMenu();
                                                }
                                            }
                                        }
                                    }
                                }
                        break;
                        case 2:{
                            userMenu();
                        }
                    }
                }
                break;
                case 2:{
                    displayProducts();
                }
                break;
                case 3:{
                        displayCredit();
                }
                break;
                case 4:{
                    Scanner coinsin = new Scanner(System.in);
                    insertCoin(coinsin.nextInt());
                }
                break;
                default:{
                    System.out.println("Wrong option!");
                }

            }
        }
    }

}
