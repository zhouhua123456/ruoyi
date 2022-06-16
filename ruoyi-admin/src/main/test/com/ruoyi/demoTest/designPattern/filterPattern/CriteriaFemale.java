package com.ruoyi.demoTest.designPattern.filterPattern;

import java.util.ArrayList;
import java.util.List;

//女性标准
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            //equalsIgnoreCase 比较字符串的时候会自动忽略大小写
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
