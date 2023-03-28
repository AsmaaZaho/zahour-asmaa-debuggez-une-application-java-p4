package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  /** 
   * main method is used to recall all methods in order to execute the different treatments.
   * @param args String[]
   */
  public static void main(String[] args) {
    ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
    ISymptomWriter writer = new WriteSymptomDataToFile();

    AnalyticsCounter treatments = new AnalyticsCounter(reader, writer);

    ArrayList<String> listOfSymptoms = treatments.getSymptoms();

    Map<String, Integer> occurenceSymptoms = treatments.countSymptoms(listOfSymptoms);

    Map<String, Integer> sortedSymptoms = treatments.sortSymptoms(occurenceSymptoms);

    treatments.writeSymptoms(sortedSymptoms);
  }
}