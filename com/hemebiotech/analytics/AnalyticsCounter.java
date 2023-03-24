package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

ISymptomReader reader;
ISymptomWriter writer;

//the constructor of this class takes two parameters 
public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
    this.reader = reader;
	  this.writer = writer;    
 }

public ArrayList<String> getSymptoms() {
  ArrayList<String> listofsymptoms = new ArrayList<String>();
  listofsymptoms = reader.getSymptoms(); 
  return listofsymptoms;
} 

public HashMap<String, Integer> countSymptoms(List<String> symptoms) {

HashMap<String, Integer> occurence = new HashMap<String,Integer>();

for(String line : symptoms){
  occurence.putIfAbsent(line, 0);
  occurence.put(line, occurence.get(line) + 1);
}
return occurence;
}


public TreeMap<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
  TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(symptoms);
  return sorted;
  
 }

public void writeSymptoms(Map<String, Integer> symptoms) { 
  writer.writeSymptoms(symptoms);
}
}
