package com.epam.mjc.collections.combined;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry: sourceMap.entrySet()) {
            int length = entry.getKey().length();
            if(map.containsKey(length)){
                Set<String> set = map.get(length);
                set.add(entry.getKey());
                map.computeIfPresent(length, (k,v)->set);
            }else{
                Set<String> set = map.computeIfAbsent(length,k -> new LinkedHashSet<>());
                set.add(entry.getKey());
            }
        }
        return map;
    }
}
