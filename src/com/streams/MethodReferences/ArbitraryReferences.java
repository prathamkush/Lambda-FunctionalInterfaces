package com.streams.MethodReferences;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Company{
    String companyName;
    int year;

    Company(String companyName, int year){
        this.companyName = companyName.toString();
        this.year = year;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return "Company{"+
                "Company Name = '"+ companyName + '\''+
                ", Company Year = "+ year +
                "}";

    }
}



public class ArbitraryReferences {

    public static void main(String[] args) {
        List<Company>  list = new ArrayList<>();
        list.add(new Company("Google",24));
        list.add(new Company("Microsoft",47));
        list.add(new Company("Blue Yonder",37));


        //Getting the year of the company in a stream
        int totalNumberOfYears = list.stream().mapToInt(s -> s.getYear()).sum();
        System.out.println(totalNumberOfYears);

        System.out.println("-------------");

        // Method Reference
        int totalNumberOfYearsWithMethodReference = list.stream().mapToInt(Company::getYear).sum();
        System.out.println(totalNumberOfYearsWithMethodReference);

    }
}
