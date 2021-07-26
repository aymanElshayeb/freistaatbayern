package interview.demo;

import interview.demo.businessservices.EinwohnerService;
import java.io.IOException;

public class Executor {
    public static void main(String[] args) throws IOException {
        EinwohnerService einwohnerService = new EinwohnerService();
        System.out.println(einwohnerService.getEinwohnerAsJson("0001"));
        System.out.println(einwohnerService.getEinwohnerAsJson("0002"));
        System.out.println(einwohnerService.getEinwohnerAsJson("0003"));
    }
}
