package com.ruoyi.demoTest.designPattern.filterPattern;

import java.util.List;

//为标准（Criteria）创建一个接口。
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
