package com.hz.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 机场大巴（Aggregate 实现类）
 *
 * 迭代器实现类（ConcreteIterator）：迭代器接口 Iterator 的实现类。可以根据具体情况加以实现。
 *
 * Created by hezhao on 2018-08-09 18:28
 */
public class SkyBus implements Bus {

    private List<Object> list = new ArrayList<>();

    @Override
    public void getOn(Object obj) {
        this.list.add(obj);
    }

    @Override
    public void getOff(Object obj) {
        this.list.remove(obj);
    }

    @Override
    public Conductor conductor() {
        return new BusConductor();
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    // 使用内部类定义迭代器，可以直接使用外部类的属性
    private class BusConductor implements Conductor {

        /**
         * 定义游标用于记录遍历时的位置
         */
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return list.get(cursor++);
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size() - 1;
        }
    }

}
