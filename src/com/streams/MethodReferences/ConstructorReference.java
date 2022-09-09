package com.streams.MethodReferences;

import java.util.ArrayList;
import java.util.List;

class Company1{
    String companyName;

    Company1(String companyName){
        this.companyName = companyName.toString();
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString(){
        return "Company{"+
                "Company Name = '"+ companyName + '\''+
                "}";

    }
}

public class ConstructorReference {

    public static void main(String[] args) {
        List<String>  list = new ArrayList<>();
        list.add("Google");
        list.add("Blue Yonder");
        list.add("Microsoft");
        list.add("PayPal");

        // Constructor Object Method Reference
        list.stream().map(Company1:: new ).forEach(System.out::println);

        // WITHOUT CONSTRUCTOR OBJECT REFERENCE
        list.stream().map(name -> new Company1(name)).forEach(System.out::println);

    }
}
