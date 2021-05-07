import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import su.nextserver.*;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * @author Miłosz Nowaczyk
 * Created on 07.05.2021
 */
public class AcceptanceTests {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final Path path = Paths.get("src/test/resources/testSourceJSONFiles/acceptanceTestJsons");

    @Before
    public void configureMapper(){
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Test
    public void parseAllFilesTest(){

        try {
            List<File> files =  Files.walk(path, 1)
                    .map(n -> n.toFile())
                    .collect(Collectors.toList());
            files.remove(0);
            for(File nFile : files){
                System.out.println(objectMapper.readValue(nFile, PairContainer.class).toString());
                System.out.println(objectMapper.readValue(nFile, HelixContainer.class).toString());
                System.out.println(objectMapper.readValue(nFile, MultipletContainer.class).toString());
                System.out.println(objectMapper.readValue(nFile, StackContainer.class).toString());
                System.out.println(objectMapper.readValue(nFile, SsSegmentContainer.class).toString());
                System.out.println(objectMapper.readValue(nFile, G4tetradContainer.class).toString());
                System.out.println(objectMapper.readValue(nFile, DbnContainer.class).toString());
                System.out.println(objectMapper.readValue(nFile, NtContainer.class).toString());
                System.out.println(objectMapper.readValue(nFile, HbondContainer.class).toString());
                System.out.println(objectMapper.readValue(nFile, Metadata.class).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
