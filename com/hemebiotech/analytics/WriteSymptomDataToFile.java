package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * this class implementes the interface ISymptomWriter.
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

  private String fileName;
          
  /**
   * this constructor with no args is used here to intialise the fileName with a value.
   * When we will call the class, the constructor will be called
   */
  public WriteSymptomDataToFile() {
    this.fileName = "result.out";
  }
  /**
    * This method generate a new file and write a map of symptoms, and their occurences, in it.
    * @param symptom a list of symptoms and their occurences 
    */

  @Override
  public void writeSymptoms(Map<String, Integer> symptom) {

    try (FileWriter file = new FileWriter(fileName)) {
      BufferedWriter result = new BufferedWriter(file);
      /**
       * Iterator is used to iterate over our map symptom.
       * entrySet is used to extract the Set of entries from our map
       * Symptoms are the key of our map
       * the number of occurences of symptomps in the file are the value of our map    
       */
      Iterator<Map.Entry<String, Integer>> iterator = symptom.entrySet().iterator();
      while (iterator.hasNext()) {
        Map.Entry<String, Integer> entry = iterator.next();
        result.write(entry.getKey());
        result.write(" : " + entry.getValue() + "\n");
      } 
      result.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
