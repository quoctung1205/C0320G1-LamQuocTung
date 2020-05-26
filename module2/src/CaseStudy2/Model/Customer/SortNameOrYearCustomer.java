package CaseStudy2.Model.Customer;

import java.util.Comparator;

public class SortNameOrYearCustomer implements Comparator<Customer>{

    @Override
    public int compare(Customer s1, Customer s2) {
        int resultComparatorName = s1.getNameCustomer().compareTo(s2.getNameCustomer());
        if(resultComparatorName == 0){
            return compareYear(s1,s2);
        }
        return resultComparatorName;
    }

    private int compareYear(Customer s1, Customer s2){
        int yearCustomer1 =Integer.parseInt(s1.getDayOfBirth().substring(6,10));
        int yearCustomer2 = Integer.parseInt(s2.getDayOfBirth().substring(6,10));
        if(yearCustomer1 == yearCustomer2){
            return 0;
        }else if(yearCustomer1 > yearCustomer2){
            return 1;
        }else return -1;
    }
    
}