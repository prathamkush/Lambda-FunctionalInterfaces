package com.Introduction;

// cannot use same name default methods
public class Methods implements Company, Tata, Mahindra{


    public void insertCompany() {
        System.out.println("Inserting a company");
    }

    @Override
    public void updateCompany(){
        System.out.println("Overriding updateCompany");
    }

    //abstract method
    public void display() {
        System.out.println("Displaying the x Company");
    }

    public static void main(String[] args) {
        Methods obj1 = new Methods();

        obj1.insertCompany();
        obj1.updateCompany();
        obj1.display();


        Methods obj2 = new Methods();
        obj2.insertCompany();

        //static method
        Company.deleteCompany();

        // Class Amazon
        // Object -> OrderPage,Checkout, (has a status and a full life cycle)
        // Properties -> Email, Address,
        // Methods -> Verify, Send email
    }
}