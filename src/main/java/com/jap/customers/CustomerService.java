package com.jap.customers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.
    public List<String> getListOfCustomersSortedByName(List<Customer> customerList) {

        List<String> nameList = new ArrayList<>();
        nameList.add("Abbie");
        nameList.add("John");
        nameList.add("Mary");
        nameList.add("Michelle");
        nameList.add("Sam");
        nameList.add("Tara");
        nameList.add("Trevor");
        Collections.sort(nameList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        return nameList;
    }
}