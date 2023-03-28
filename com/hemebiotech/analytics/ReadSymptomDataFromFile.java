package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation.
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

  private String filepath;

  
  //@param filepath a full or partial path to file with symptom strings in it, one per line
  public ReadSymptomDataFromFile(String filepath) {
    this.filepath = filepath;
  }

  /**
   * If we have a data in this file, it gives the possibility to read this file line per line.
   * @return a list of symptoms contained in this file
   */
  @Override
  public ArrayList<String> getSymptoms() {
    ArrayList<String> result = new ArrayList<String>();

    if (filepath != null) {
      try {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        String line = reader.readLine();
        while (line != null) {
          result.add(line);
          line = reader.readLine();
        }
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return result;
  }
}
