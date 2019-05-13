package lab5_3;


import java.io.*;

public class MainCopy {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/lab5_3/MainCopy.java");
        File outputFile = new File("src/lab5_3/MainCopyOutput.txt");

        BufferedReader in = new BufferedReader(new FileReader(inputFile) );
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));

        StringBuilder stringBuilder = new StringBuilder();
        String s;
        while ( (s = in.readLine()) != null ) {
            stringBuilder.append(s);
            stringBuilder.append("\r\n");
        }

        SubstringReplacer substringReplacer = new SubstringReplacer();
        substringReplacer.setStringToReplace(stringBuilder.toString());
        String result = substringReplacer.replaceWithLongerString("public");
        out.print(result);

        in.close();
        out.close();
    }
}
