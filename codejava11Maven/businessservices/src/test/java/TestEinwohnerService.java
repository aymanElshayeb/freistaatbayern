import interview.demo.businessservices.EinwohnerService;
import interview.demo.models.Einwohner;
import org.junit.Assert;
import org.junit.Test;

public class TestEinwohnerService {
    @Test
    public void testGetEinwohnerByID() {
        EinwohnerService einwohnerService = new EinwohnerService();
        Einwohner einwohner = einwohnerService.getByID("0001");
        Assert.assertEquals(einwohner.getID(), "0001");
        Assert.assertEquals(einwohner.getVorname(), "Peter");
        Assert.assertEquals(einwohner.getNachname(), "Mueller");
    }
}
