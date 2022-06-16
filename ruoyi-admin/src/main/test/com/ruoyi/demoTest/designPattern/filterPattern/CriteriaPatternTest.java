package com.ruoyi.demoTest.designPattern.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternTest {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        //查男性的都有谁
/*        Criteria criteriaMale = new CriteriaMale();
        List<Person> peoples = criteriaMale.meetCriteria(persons);
        for(Person people:peoples){
            System.out.println(people);
        }*/

        //查女性的都有谁
/*        Criteria criteriaMale = new CriteriaFemale();
        List<Person> peoples = criteriaMale.meetCriteria(persons);
        for(Person people:peoples){
            System.out.println(people);
        }*/

        //查男性并且光棍的都有谁
        Criteria criteriaMale = new AndCriteria(new CriteriaMale(),new CriteriaSingle());
        List<Person> peoples = criteriaMale.meetCriteria(persons);
        for(Person people:peoples){
            System.out.println(people);
        }


        //查男性或者单身
/*        OrCriteria orCriteria = new OrCriteria(new CriteriaMale(), new CriteriaSingle());
        List<Person> peoples = orCriteria.meetCriteria(persons);
        for(Person people: peoples){
            System.out.println(people);
        }*/


    }
}
