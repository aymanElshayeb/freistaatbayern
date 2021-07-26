package interview.demo.businessservices;
import com.fasterxml.jackson.databind.ObjectMapper;
import interview.demo.dataacess.EinwohnerDataSource;
import interview.demo.models.Einwohner;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.stream.Collectors;

public class EinwohnerService {
    EinwohnerDataSource einwohnerDataSource = new EinwohnerDataSource();

    public Einwohner getByID(String id) {
        // for simplisty i did not check the Null case
        List<Einwohner> filterList = einwohnerDataSource.getEinwohnerList().stream().filter(e -> e.getID().equals(id)).collect(Collectors.toList());
        if (filterList != null && filterList.size() > 0) {
            return filterList.get(0);
        } else {
            return null;
        }
    }

    public String getEinwohnerAsJson(String id) throws IOException {
        Einwohner einwohner = this.getByID(id);

        if (einwohner != null) {
            ObjectMapper mapper = new ObjectMapper();
            StringWriter outputWriter = new StringWriter();
            mapper.writeValue(outputWriter, einwohner);
            return outputWriter.toString();
        }
        return null;
    }
}
