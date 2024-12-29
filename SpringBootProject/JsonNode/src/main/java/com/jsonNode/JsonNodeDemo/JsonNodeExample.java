package com.jsonNode.JsonNodeDemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonNodeExample {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\n" +
                "   \"Name\":\"Craig\",\n" +
                "   \"Age\":10,\n" +
                "   \"BookInterests\":[\n" +
                "      {\n" +
                "         \"Book\":\"The Kite Runner\",\n" +
                "         \"Author\":\"Khaled Hosseini\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"Book\":\"Harry Potter\",\n" +
                "         \"Author\":\"J. K. Rowling\"\n" +
                "      }\n" +
                "   ],\n" +
                "   \"FoodInterests\":{\n" +
                "      \"Breakfast\":[\n" +
                "         {\n" +
                "            \"Bread\":\"Whole wheat\",\n" +
                "            \"Beverage\":\"Fruit juice\"\n" +
                "         },\n" +
                "         {\n" +
                "            \"Sandwich\":\"Vegetable Sandwich\",\n" +
                "            \"Beverage\":\"Coffee\"\n" +
                "         }\n" +
                "      ]\n" +
                "   }\n" +
                "}";
        List<String> keys = getKeysInJsonUsingJsonNodeFieldNames(json);
        keys.stream().forEach(e-> System.out.println(e));
    }

    private static List<String> getKeysInJsonUsingJsonNodeFieldNames(String json) throws JsonMappingException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        List<String> keys = new ArrayList<>();

        JsonNode jsonNode = mapper.readTree(json);

        Iterator<String> iterator = jsonNode.fieldNames();
        iterator.forEachRemaining(e -> keys.add(e));
        return keys;
    }
}
