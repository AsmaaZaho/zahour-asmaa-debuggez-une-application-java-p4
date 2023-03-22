package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

ISymptomReader reader;
ISymptomWriter writer;

//the constructor of this class takes two parameters 
public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
    this.reader = reader;
	this.writer = writer;    
 }

/*public List<String> getSymptoms() {
  String filepath;
  reader = new ReadSymptomDataFromFile(filepath);
  //return reader;
  List<String> res = new List<String>();
  return res;
} 

public Map<String, Integer> countSymtoms(List<String> symptoms) {

Map<String, Integer> occurence = new HashMap<String,Integer>();

for(String line : symptoms){
  occurence.putIfAbsent(line, 0);
  occurence.put(line, occurence.get(line) + 1);
}
return occurence;
}


public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {

  Map<String, Integer> sortedlistofsymptom= new LinkedHashMap<String, Integer>();

  
 }*/
}
