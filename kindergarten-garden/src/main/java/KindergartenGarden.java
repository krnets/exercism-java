import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class KindergartenGarden {

    private final List<String> students = Arrays.asList(
            "Alice", "Bob", "Charlie", "David",
            "Eve", "Fred", "Ginny", "Harriet",
            "Ileana", "Joseph", "Kincaid", "Larry");
    private final String[] rows;

    KindergartenGarden(String garden) {
        rows = garden.split("\n");
    }

    List<Plant> getPlantsOfStudent(String student) {
        var list = new ArrayList<Plant>();
        int i = students.indexOf(student) * 2;

        for (String row : rows) {
            list.add(Plant.getPlant(row.charAt(i)));
            list.add(Plant.getPlant(row.charAt(i + 1)));
        }
        return list;
    }

}
