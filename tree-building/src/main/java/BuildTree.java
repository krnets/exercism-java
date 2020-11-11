import java.util.ArrayList;
import java.util.Comparator;

class BuildTree {

    TreeNode buildTree(ArrayList<Record> records) throws InvalidRecordsException {
        int size = records.size();
        if (size == 0) return null;

        records.sort(Comparator.comparing(Record::getRecordId));

        if (records.get(0).getRecordId() > 0 || records.get(size - 1).getRecordId() >= size) {
            throw new InvalidRecordsException("Invalid Records");
        }
        TreeNode[] nodes = new TreeNode[size];

        for (Record record : records) {
            int i = record.getRecordId();
            int p = record.getParentId();

            if (i < p) {
                throw new InvalidRecordsException("Invalid Records");
            }
            nodes[i] = new TreeNode(i);

            if (i != p) {
                TreeNode parent = nodes[p];
                parent.addChild(nodes[i]);
            }
        }
        return nodes[0];
    }
}

