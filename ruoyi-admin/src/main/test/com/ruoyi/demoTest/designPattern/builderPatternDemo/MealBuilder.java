package com.ruoyi.demoTest.designPattern.builderPatternDemo;

public class MealBuilder {

    //套餐一：素菜汉堡+可口可乐
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    //套餐二：鸡肉汉堡+百事可乐
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    //自定义一个
    public Meal taocan1(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
