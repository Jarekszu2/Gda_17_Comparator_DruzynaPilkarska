package packComparatorZad3;

import java.util.Comparator;

public class DruzynaPilkarskaComparator implements Comparator<DruzynaPilkarska> {
    public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
        if (o1.liczbaPunktow > o2.getLiczbaPunktow()) {
            return -1;
        } else if (o1.liczbaPunktow < o2.getLiczbaPunktow()) {
            return 1;
        }

        if (o1.getBramkiTrafione() > o2.getBramkiTrafione()) {
            return -1;
        } else if (o1.getBramkiTrafione() < o2.getBramkiTrafione()) {
            return 1;
        }
        return 0;
    }
}
