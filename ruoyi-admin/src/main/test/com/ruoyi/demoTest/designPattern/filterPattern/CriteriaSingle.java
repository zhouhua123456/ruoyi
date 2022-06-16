package com.ruoyi.demoTest.designPattern.filterPattern;

import java.util.ArrayList;
import java.util.List;

//单身标准
public class CriteriaSingle implements  Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
