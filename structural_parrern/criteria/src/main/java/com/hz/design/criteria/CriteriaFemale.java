package com.hz.design.criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 女人
 *
 * Created by hezhao on 2018-08-09 10:17
 */
public class CriteriaFemale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(e -> e.getGender().equalsIgnoreCase("女")).collect(Collectors.toList());
    }

}
