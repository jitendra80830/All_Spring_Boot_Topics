package ashok.in.binding.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.Stack;

public class XmlToJsonConversion {
    public static final String xml = "<Flower>\n" +
            "    <name>Poppy</name>\n" +
            "    <color>RED</color>\n" +
            "    <petals>9</petals>\n" +
            "</Flower>\n";
    public static void main(String[] args) throws JsonProcessingException {
        convertXmlToJsonWithJavaClass();
        convertXmlToJsonWithoutJavaClass();


    }

    private static void convertXmlToJsonWithoutJavaClass() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        JsonNode jsonNode = xmlMapper.readTree(xml);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(jsonNode);
        System.out.println("Way2");
        System.out.println(json);
    }

    private static void convertXmlToJsonWithJavaClass() {
        try {

            //Way1 to convert xml to json
            XmlMapper xmlMapper = new XmlMapper();
            Flower flower = xmlMapper.readValue(xml, Flower.class);

            ObjectMapper objectMapper = new ObjectMapper();
            String josn = objectMapper.writeValueAsString(flower);
            System.out.println(josn);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
