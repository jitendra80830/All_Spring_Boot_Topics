public class JavaFeature11 {
    public static void main(String[] args) {

        //strip
        String str = " java ";
        System.out.println(str.strip());
        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());

        //repeat
        System.out.println("Java".repeat(5));


        //lines
        String data = """
        Java
        Spring Boot
        Microservices
        Kafka
        """;
        data.lines().forEach(System.out::println);
    }
}
