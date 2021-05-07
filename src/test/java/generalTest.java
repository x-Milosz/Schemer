import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.junit.Before;
import org.junit.Test;
import su.nextserver.*;

import java.io.File;
import java.io.IOException;

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
            PairContainer pairs = objectMapper.readValue(file, PairContainer.class);
            for(Pair pair : pairs.getPairs()){
                System.out.println(pair.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parseHelicesTest() {
        try {
            HelixContainer helices = objectMapper.readValue(file, HelixContainer.class);
            for(Helix helix : helices.getHelices()){
                System.out.println(helix.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parseMultipletsTest() {
        try {
            MultipletContainer multiplets = objectMapper.readValue(file, MultipletContainer.class);
            for(Multiplet multiplet : multiplets.getMultiplets()) {
                System.out.println(multiplet.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parseStacks() {
        try {
            StackContainer stacks = objectMapper.readValue(file, StackContainer.class);
            for(Stack stack : stacks.getStacks()){
                System.out.println(stack.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parseSsSegmentssTest() {
        try {
            SsSegmentContainer ssSegments = objectMapper.readValue(file, SsSegmentContainer.class);
            for(SsSegment ssSegment : ssSegments.getSsSegments()) {
                System.out.println(ssSegment.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parseG4tetrads() {
        try {
            G4tetradContainer g4tetrads = objectMapper.readValue(file, G4tetradContainer.class);
            for(G4tetrad g4tetrad : g4tetrads.getG4tetrads()) {
                System.out.println(g4tetrad.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parseDbnTest() {
        try {
             DbnContainer dbn = objectMapper.readValue(file, su.nextserver.DbnContainer.class);
             System.out.println(dbn.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ok
    @Test
    public void parseChainsTest() {
        try {
            ChainContainer chains = objectMapper.readValue(file, ChainContainer.class);
            System.out.println(chains.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Ok
    @Test
    public void parseNtsTest() {
        try {
            NtContainer nts = objectMapper.readValue(file, NtContainer.class);
            System.out.println(nts.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ok
    @Test
    public void parseHbonds() {
        try {
            HbondContainer hbonds = objectMapper.readValue(file, HbondContainer.class);
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
