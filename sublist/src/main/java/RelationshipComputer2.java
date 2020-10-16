/*
import java.util.List;

public class RelationshipComputer<T> {

    public Relationship computeRelationship(List<T> list1, List<T> list2) {

        if (list1.equals(list2))
            return Relationship.EQUAL;

        if (list1.size() < list2.size() && isSubList(list2, list1))
            return Relationship.SUBLIST;

        if (list1.size() > list2.size() && isSubList(list1, list2))
            return Relationship.SUPERLIST;


        return Relationship.UNEQUAL;
    }

    private boolean isSubList(List<T> largerList, List<T> smallerList) {
        if (smallerList.isEmpty()) {
            return true;
        }
        for (int i = 0, j = 0; i < largerList.size(); i++) {
            if (largerList.get(i).equals(smallerList.get(j))) {

                for (int k = i; k < smallerList.size(); k++, j++) {
                    if (!largerList.get(k).equals(smallerList.get(j))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
*/
