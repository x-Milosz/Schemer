import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.SchemaMapper;
import org.junit.Before;
import org.junit.Test;
import su.nextserver.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * @author Miłosz Nowaczyk
 * Created on 05.05.2021
 */

public class generalTest {

    private static final File  file = new File("src/test/resources/testSourceJSONFiles/139d-assembly-1.json");
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Before
    public void configureMapper(){
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Test
    public void parsePairsTest() {
        try {
            Pairs pairs = objectMapper.readValue(file, Pairs.class);
            for(Pair pair : pairs.getPairs()){
                System.out.println(pair.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // OK
    @Test
    public void parseHelicesTest() {
        try {
            Helices helices = objectMapper.readValue(new File("/home/milosz/Pobrane/helicesExample.json"), Helices.class);
            for(Helice helice : helices.getHelices()){
                System.out.println(helice.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ok
    @Test
    public void parseMultipletsTest() {
        try {
            Multiplets multiplets = objectMapper.readValue(file, Multiplets.class);
            for(Multiplet multiplet : multiplets.getMultiplets()) {
                System.out.println(multiplet.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ok
    @Test
    public void parseStacks() {
        try {
            Stacks stacks = objectMapper.readValue(file, Stacks.class);
            for(Stack stack : stacks.getStacks()){
                System.out.println(stack.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ok
    @Test
    public void parseSsSegmentssTest() {
        try {
            SsSegments ssSegments = objectMapper.readValue(file, SsSegments.class);
            for(SsSegment ssSegment : ssSegments.getSsSegments()) {
                System.out.println(ssSegment.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ok
    @Test
    public void parseG4tetrads() {
        try {
            G4tetrads g4tetrads = objectMapper.readValue(file, G4tetrads.class);
            for(G4tetrad g4tetrad : g4tetrads.getG4tetrads()) {
                System.out.println(g4tetrad.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ok
    @Test
    public void parseDbnTest() {
        try {
            DbnContainer dbnContainer = objectMapper.readValue(file, DbnContainer.class);
             Dbn dbn = dbnContainer.getDbn();
             System.out.println(dbn.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ok
    @Test
    public void parseChainsTest() {
        try {
            Chains chains = objectMapper.readValue(file, Chains.class);
            System.out.println(chains.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Ok
    @Test
    public void parseNtsTest() {
        try {
            Nts nts = objectMapper.readValue(file, Nts.class);
            System.out.println(nts.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ok
    @Test
    public void parseHbonds() {
        try {
            Hbonds hbonds = objectMapper.readValue(file, Hbonds.class);
            for(Hbond hbond : hbonds.getHbonds()){
                System.out.println(hbond.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ok
    @Test
    public void parseMetadataTest() {
        try {
            Metadata metadata = objectMapper.readValue(file, Metadata.class);
            System.out.println(metadata.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
