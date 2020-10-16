import java.util.List;
import static java.util.Collections.indexOfSubList;

public class RelationshipComputer<T> {

    public Relationship computeRelationship(List<T> list1, List<T> list2) {

        if (list1.equals(list2))
            return Relationship.EQUAL;

        if (indexOfSubList(list2, list1) >= 0)
            return Relationship.SUBLIST;

        if (indexOfSubList(list1, list2) >= 0)
            return Relationship.SUPERLIST;


        return Relationship.UNEQUAL;
    }
}