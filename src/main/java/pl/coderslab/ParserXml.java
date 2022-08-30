package pl.coderslab;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class ParserXml {

    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        Artist[] artists = xmlMapper.readValue(new File("/home/artur/Dokumenty/GitHub/ParseXml/src/main/resources/artists.xml"), Artist[].class);
        List<Artist> artistsList = xmlMapper.readValue(new File("/home/artur/Dokumenty/GitHub/ParseXml/src/main/resources/artists.xml"),
                new TypeReference<List<Artist>>() {
                });
        artistsList.stream().forEach(s-> System.out.println(s));
//        Arrays.stream(artists).forEach
//                (s-> System.out.println(s));
//        (s -> log.info("artist {}", s));

        ObjectMapper om = new ObjectMapper();
        File json = new File("/home/artur/Dokumenty/GitHub/ParseXml/src/main/resources/artists.json");
        om.writeValue(json, artistsList);
    }
}
