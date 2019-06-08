package packComparatorZad3;

/*
Stwórz komparator porównujący drużyny piłkarskie zgodnie z zasadami FIFA. Tj.
Pola klasy DrużynaPiłkarska:
- nazwa drużyny
- bramki stracone,
- bramki trafione,
- mecze wygrane,
- mecze przegrane,
- mecze zremisowane,
- liczba punktów
Kryteria klasyfikacji/sortowania:
- kryterium punktów (im więcej tym lepiej)
- kryterium bramek trafionych (im więcej tym lepiej)
- kryterium bramek straconych (im mniej tym lepiej)
- kryterium ... nazwy drużyny - alfabetycznie sortuje i wygrywa drużyna której nazwa (sortując alfabetycznie) byłaby pierwsza.
Po kolei:
- sortujemy drużyny po ilości punktów
- jeśli liczba punktów którejś drużyny jest wyższa to wygrywa, jeśli liczby punktów są jednakowe porównujemy dalej,
- jeśli liczba zdobytych bramek którejś drużyny jest wyższa to wygrywa, jeśli liczby punktów są jednakowe porównujemy dalej,
- jeśli liczba straconych bramek którejś drużyny jest wyższa to przegrywa, jeśli liczby punktów są jednakowe porównujemy dalej,
- porównujemy nazwy drużyny, wygrywa alfabetyczny (leksykograficzny) zwycięzca.
- jeśli drużyny mają taką samą nazwę, to drużyny zremisowały.
 */
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class DruzynaPilkarska {

    String nazwaDruzyny;
    int bramkiStracone;
    int bramkiTrafione;
    int meczeWygrane;
    int meczePrzegrane;
    // int meczeZremisowane;
    int liczbaPunktow;

}
