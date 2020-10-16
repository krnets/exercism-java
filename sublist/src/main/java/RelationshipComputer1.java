/*
import java.util.Collections;
import java.util.List;

public class RelationshipComputer<T> {

    public Relationship computeRelationship(List<T> list1, List<T> list2) {

        if (list1.equals(list2))
            return Relationship.EQUAL;

        if (list1.size() < list2.size() && Collections.indexOfSubList(list2, list1) >= 0)
            return Relationship.SUBLIST;

        if (list1.size() > list2.size() && Collections.indexOfSubList(list1, list2) >= 0)
            return Relationship.SUPERLIST;


        return Relationship.UNEQUAL;
    }
}*/
