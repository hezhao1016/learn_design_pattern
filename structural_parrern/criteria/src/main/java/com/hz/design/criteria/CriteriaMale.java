package com.hz.design.criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 男人
 *
 * Created by hezhao on 2018-08-09 09:31
 */
public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(e -> e.getGender().equalsIgnoreCase("男")).collect(Collectors.toList());
    }

}
