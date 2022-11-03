package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> set = new LinkedHashSet<>();
        timetable.forEach((k,v)->set.addAll(v));
        return set;
    }
}
