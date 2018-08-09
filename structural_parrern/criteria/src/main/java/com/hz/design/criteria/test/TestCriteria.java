package com.hz.design.criteria.test;

import com.google.common.collect.Lists;
import com.hz.design.criteria.*;

import java.util.List;

/**
 * 测试 过滤器模式
 *
 * Created by hezhao on 2018-08-08 16:01
 */
public class TestCriteria {

    public static void main(String[] args) {

        List<Person> persons = Lists.newArrayList(
                new Person("张三", "男", "未婚"),
                new Person("李四", "男", "已婚"),
                new Person("王五", "女", "离异"),
                new Person("赵六", "女", "未婚"),
                new Person("麻子", "男", "未婚"),
                new Person("欧阳锋", "男", "未婚")
        );

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("男性: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\n女性: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\n未婚男性: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\n未婚 或 女性: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
