package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
* This class Contains methods to read a file; file1.
* Also to get a file; file2 with a list of symptoms,  
* in alphabetical order and followed by the number of occurrences in the file1
*/  
public class AnalyticsCounter {

  ISymptomReader reader;
  ISymptomWriter writer;
  /**
  * the constructor takes two parameters. 
  * which assign the values of these two parameters to two class attributes
  */

  public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
    this.reader = reader;
    this.writer = writer;    
  }
  /**
  * Using reader (the instance of ISymptomReader).
  * this method retrieves the list of entries in the file1.
  * @return a list of symptoms existing in the file1 
  */

  public ArrayList<String> getSymptoms() {
    ArrayList<String> listOfSymptoms = new ArrayList<String>();
    listOfSymptoms = reader.getSymptoms(); 
    return listOfSymptoms;
  } 
  /**
   * This method counts the occurrences of each existing symptom.
   */

  public HashMap<String, Integer> countSymptoms(List<String> symptoms) {

    HashMap<String, Integer> occurence = new HashMap<String,Integer>();

    for (String line : symptoms) {
      occurence.putIfAbsent(line, 0);
      occurence.put(line, occurence.get(line) + 1);
    }
    return occurence;
  }

  /**
   * This method sorts the list of symptoms and their occurrences alphabetically.
   */
   
  public TreeMap<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
    TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(symptoms);
    return sorted;
  }

  public void writeSymptoms(Map<String, Integer> symptoms) { 
    writer.writeSymptoms(symptoms);
  }
}
