package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
   private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        switch (name.toLowerCase()) {
            case "ann": return annsTasks;
            case "bob": return bobsTasks;
            case "carol": return carolsTasks;
            case "all": return unassignedTasks;
            default: return Set.of();
        }
    }
    public Set<Task> getUnion(Set<Task> a, Set<Task> b) {
        Set<Task> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public Set<Task> getIntersection(Set<Task> a, Set<Task> b) {
        Set<Task> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public Set<Task> getDifferences(Set<Task> a, Set<Task> b) {
        Set<Task> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }

}
