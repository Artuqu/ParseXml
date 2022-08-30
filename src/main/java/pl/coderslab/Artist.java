package pl.coderslab;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Artist {

    private Long id;
    @JacksonXmlProperty(localName = "firstname")
    private String firstName;
    @JacksonXmlProperty(localName = "lastname")
    private String lastName;
    private String pseudonym;
    private String profession;
    @JsonProperty("active")
    @JacksonXmlProperty(localName = "alive")
    private boolean alive;
}
