import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class CustomSet<T> {

    private Set<T> set;

    CustomSet(Collection<T> other) {
        set = new HashSet<>(other.size());
        this.set.addAll(other);
    }

    boolean isEmpty() {
        return set.size() == 0;
    }

    boolean contains(T element) {
        for (T t : set) {
            if (t == element) {
                return true;
            }
        }
        return false;
    }

    boolean isSubset(CustomSet<T> otherSet) {
        for (T t : otherSet.set) {
            if (!(this.set.contains(t))) {
                return false;
            }
        }
        return true;
    }

    boolean isDisjoint(CustomSet<T> otherSet) {
        if (this.isEmpty() || otherSet.isEmpty()) {
            return true;
        }
        return set.stream().noneMatch(otherSet::contains);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomSet<T> otherSet = (CustomSet<T>) obj;

        return this.set.size() == otherSet.set.size() && this.isSubset(otherSet);
    }

    void add(T element) {
        set.add(element);
    }

    CustomSet<T> getIntersection(CustomSet<T> otherSet) {
        List<T> sameElementInBothSets = set.stream()
                .filter(otherSet::contains)
                .collect(Collectors.toList());

        return new CustomSet<>(sameElementInBothSets);
    }

    CustomSet<T> getDifference(CustomSet<T> otherSet) {
        List<T> uniqueElementFromEachSet = set.stream()
                .filter(not(otherSet::contains))
                .collect(Collectors.toList());

        return new CustomSet<>(uniqueElementFromEachSet);
    }

    CustomSet<T> getUnion(CustomSet<T> otherSet) {
        Set<T> union = new HashSet<>();

        union.addAll(this.set);
        union.addAll(otherSet.set);

        return new CustomSet<>(union);
    }

}