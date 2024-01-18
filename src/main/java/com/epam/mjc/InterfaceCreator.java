package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> operation= arg -> {
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < arg.size(); i++) {
                list.add(i,arg.get(i)/divider);
            }
            return list;
        };
            return operation;
    }
}
