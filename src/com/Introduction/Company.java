package com.Introduction;

public interface Company {
    void insertCompany();

    default void updateCompany(){
        System.out.println("Updating the company details");
    }

    static void deleteCompany(){
        System.out.println("I am deleting the company details!!");
    }
}
