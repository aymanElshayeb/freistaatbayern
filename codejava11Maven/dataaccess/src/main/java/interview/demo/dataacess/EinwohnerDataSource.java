package interview.demo.dataacess;
import interview.demo.models.Einwohner;
import java.util.Arrays;
import java.util.List;

public class EinwohnerDataSource {
    public List<Einwohner> getEinwohnerList() {
        return Arrays.asList(new Einwohner("0001", "Peter", "Mueller")
                , new Einwohner("0002", "Petra", "Wind")
                , new Einwohner("0003", "Marcos", "Stein"));
    }
}
