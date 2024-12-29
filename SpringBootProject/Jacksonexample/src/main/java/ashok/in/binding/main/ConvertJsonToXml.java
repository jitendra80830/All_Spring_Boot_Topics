package ashok.in.binding.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ConvertJsonToXml {
    private static String jsonString = "{\"name\":\"John\", \"age\":20, \"address\":{\"street\":\"Wall Street\", \"city\":\"New York\"}}";
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonString);
        String xml = new XmlMapper().writeValueAsString(jsonNode);
        System.out.println(xml);

    }
}
