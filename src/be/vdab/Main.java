package be.vdab;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        var afbeeldingen = Path.of("/data/afbeeldingen");
        System.out.println(afbeeldingen.getParent());
        var huidigeDirectory = Path.of("plaatselijk");
        System.out.println(huidigeDirectory.toAbsolutePath());*//*
        System.out.println(Files.exists(Path.of("/data")));*/
/*        var data = Path.of("/data");
        System.out.println(Files.isDirectory(data));
        System.out.println(Files.isRegularFile(data));*/

/*        try (var reader =
                     Files.newBufferedReader(Path.of("/data/insecten1.csv")))
        {
            for (String regel; (regel = reader.readLine()) != null;) {
                System.out.println(regel);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
*/

/*        var scanner = new Scanner(System.in);
        System.out.println("Tik getallen. Tik 0 om te stoppen:");
        try (var writer = new PrintWriter(Files.newBufferedWriter(Path.of("/data/getallen.txt")))) {
            for (int getal; (getal = scanner.nextInt()) != 0; ) {
                writer.println(getal);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }*/

       /* try (var scanner = new Scanner(
                Files.newBufferedReader(Path.of("/data/getallen.txt")))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextInt());
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }*/

 /*       try (var input =
                Files.newInputStream(Path.of("/data/images/duimop.jpg"));
        var output = Files.newOutputStream(Path.of("/data/images/thumbup.jpg"))) {
            for (int eenByte; (eenByte = input.read()) != -1;) {
                output.write(eenByte);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }*/

/*        try (var stream =
                Files.newDirectoryStream(Path.of("/data"))) {
            for (var path : stream) {
                System.out.print(path);
                System.out.println(Files.isDirectory(path) ? ":directory" : ":bestand");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }*/
/*        try (var stream = new ObjectOutputStream(
                Files.newOutputStream(Path.of("/data/punt.ser")))) {
            stream.writeObject(new Punt(10, 20));
        } catch (IOException ex) {
            System.out.println(ex);
        }*/

        try (var stream =
                new ObjectInputStream(Files.newInputStream(Path.of("/data/punt.ser")));) {
            var punt = (Punt) stream.readObject();
            System.out.println(punt);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
