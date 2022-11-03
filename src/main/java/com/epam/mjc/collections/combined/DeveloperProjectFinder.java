package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry: projects.entrySet()) {
            Set<String> set = entry.getValue();
            if(set.contains(developer))list.add(entry.getKey());
        }
        Comparator<String> comparator = (o1, o2) -> {
            if(o1.length()==o2.length()){
                return o2.compareTo(o1);
            }else{
                return o1.compareTo(o2);
            }
        };
        Collections.sort(list,comparator);
        return list;
    }
}
