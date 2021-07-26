import interview.demo.businessservices.EinwohnerService;
import interview.demo.models.Einwohner;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestExecutor {
    @Test
    public void testGetEinwohnerByID() throws IOException {
        EinwohnerService einwohnerService = new EinwohnerService();
        System.out.println(einwohnerService.getEinwohnerAsJson("0001"));
        System.out.println(einwohnerService.getEinwohnerAsJson("0002"));
        System.out.println(einwohnerService.getEinwohnerAsJson("0003"));
    }
}
