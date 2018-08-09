package com.hz.design.criteria;

import java.util.List;

/**
 * 且
 *
 * Created by hezhao on 2018-08-09 10:55
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> Items) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(Items);
        return otherCriteria.meetCriteria(firstCriteriaItems);
    }

}
