package Lab22.Ex2;

import java.util.Comparator;

public class SortingStudentsByGPA{

    Comparator<GettersSetters> comparator = new Comparator<GettersSetters>() {
        @Override
        public int compare(GettersSetters o1, GettersSetters o2) {
            return (o1.getGpa() > o2.getGpa()) ? 1 : -1;
        }
    };
}
