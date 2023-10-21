package unicodeEncoding;

import org.apache.commons.text.StringEscapeUtils;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RuJsonDecoder {
    File unprocessedRussianJson = new File("src/test/java/unicodeEncoding/json/unprocessedRussian.json");
    File processedRussianJson = new File("src/test/java/unicodeEncoding/json/processedRussian.json");

    public static void main(String[] args) throws IOException {
        // Load the original JSON from the file
        String originalJson = loadJsonFromFile(new File("src/test/java/unicodeEncoding/json/unprocessedRussian.json"));

        // Decode the original JSON
        String decodedJson = StringEscapeUtils.unescapeJava(originalJson);

        // Ensure each pair is on a single line and separated by a comma
        String formattedJson = formatJson(decodedJson);

        // Save the decoded JSON to the processed file
        saveJsonToFile(formattedJson, new File("src/test/java/unicodeEncoding/json/processedRussian.json"));
    }

    // Load JSON from a file
    private static String loadJsonFromFile(File file) throws IOException {
        StringBuilder json = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                json.append(line).append("\n");
            }
        }
        return json.toString();
    }

    // Save JSON to a file
    private static void saveJsonToFile(String json, File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(json);
        }
    }

    // Ensure each pair is on a single line and separated by a comma
    private static String formatJson(String json) {
        Pattern pattern = Pattern.compile("\"[^\"]+\": \"[^\"]+\"");
        Matcher matcher = pattern.matcher(json);
        StringBuilder formattedJson = new StringBuilder();

        while (matcher.find()) {
            String match = matcher.group();
            // Replace newlines within values with a space
            match = match.replaceAll("\n", " ");
            formattedJson.append(match).append(",\n");
        }

        // Remove the trailing comma and newline from the last line
        if (formattedJson.length() > 0) {
            formattedJson.setLength(formattedJson.length() - 2);
        }

        return "{\n" + formattedJson.toString() + "\n}";
    }
}
