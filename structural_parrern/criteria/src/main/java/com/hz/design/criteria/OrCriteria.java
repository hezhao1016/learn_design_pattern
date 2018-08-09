package com.hz.design.criteria;

import java.util.List;

/**
 * 或
 *
 * Created by hezhao on 2018-08-09 10:55
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        otherCriteriaItems.stream().forEach(e -> {
            if (!firstCriteriaItems.contains(e)) {
                firstCriteriaItems.add(e);
            }
        });

        return firstCriteriaItems;
    }

}
