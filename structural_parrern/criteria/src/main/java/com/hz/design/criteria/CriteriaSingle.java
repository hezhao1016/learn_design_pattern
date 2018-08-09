package com.hz.design.criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 单身
 *
 * Created by hezhao on 2018-08-09 10:17
 */
public class CriteriaSingle implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(e -> e.getMaritalStatus().equalsIgnoreCase("未婚")).collect(Collectors.toList());
    }

}
