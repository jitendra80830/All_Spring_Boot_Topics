import java.io.*;

public class Main {
    public static void main(String[] args) {
       //inputStreamReader();
       //fileReader();
       //byteToCharStream();
       //bufferReader();
       //outputStreamWritter();
       fileWritter();
    }

    private static void fileWritter() {
        File file = new File("C:\\Users\\jitendra.kumar\\Pictures\\note.txt");
        try(FileWriter fr = new FileWriter(file,true)) {
            fr.write(111);
            fr.write("Noida");
            fr.write("Delhi kolkata".toCharArray());
            fr.append("Rakesh");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void outputStreamWritter() {
        try(OutputStreamWriter ow = new OutputStreamWriter(System.out)) {
            ow.write(11);
            ow.write("Jitendra");
            ow.write("JItendr kumar".toCharArray());
            ow.write(222);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void bufferReader() {
        File f = new File("C:\\Users\\jitendra.kumar\\Pictures\\note.txt");
        try(BufferedReader b = new BufferedReader(new FileReader(f))) {
            while (b.ready()){
                System.out.println("File Data:   "+b.readLine());
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void byteToCharStream() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int read = br.read();
            while (br.ready()){
                System.out.println((char) read);
                read = br.read();
            }
            System.out.println();

        }catch (IOException e){

        }

    }

    private static void fileReader() {
        File file = new File("C:\\Users\\jitendra.kumar\\Pictures\\note.txt");
        try(FileReader fl = new FileReader(file)) {
            int letter = fl.read();
            while (fl.ready()){
                System.out.println((char) letter);
                letter = fl.read();
            }
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void inputStreamReader() {
        try(InputStreamReader ip  = new  InputStreamReader(System.in)){
            System.out.println("Enter the some letter: ");
            int letter = ip.read();
            while (ip.ready()){
                System.out.println((char) letter);
                letter = ip.read();
            }
            //ip.close();
            System.out.println();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}