package packComparatorZad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainDruzynaPilkarska {
    public static void main(String[] args) {
        System.out.println();

        DruzynaPilkarska dp1 = new DruzynaPilkarska("Wisla", 7, 5, 4, 3, 8);
        DruzynaPilkarska dp2 = new DruzynaPilkarska("Legia", 2, 5, 3, 5, 4);
        DruzynaPilkarska dp3 = new DruzynaPilkarska("Lechia", 12, 8, 3, 2, 4);
        DruzynaPilkarska dp4 = new DruzynaPilkarska("Lech", 5, 1, 4, 1, 3);

        List<DruzynaPilkarska> listaDruzyn = new ArrayList<DruzynaPilkarska>();
        listaDruzyn.add(dp4);
        listaDruzyn.add(dp2);
        listaDruzyn.add(dp1);
        listaDruzyn.add(dp3);

        for (DruzynaPilkarska druzynaPilkarska : listaDruzyn) {
            System.out.println(druzynaPilkarska);
        }

        System.out.println();
        Collections.sort(listaDruzyn, new DruzynaPilkarskaComparator());
        for (DruzynaPilkarska druzynaPilkarska : listaDruzyn) {
            System.out.println(druzynaPilkarska);
        }


    }
}
