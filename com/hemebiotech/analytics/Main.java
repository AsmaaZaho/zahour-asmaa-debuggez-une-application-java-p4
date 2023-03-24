package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

// WRITE YOUR CODE HERE
public class Main{
	public static void main(String[] args){
    ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
    ISymptomWriter writer = new WriteSymptomDataToFile();

    
    AnalyticsCounter treatments = new AnalyticsCounter(reader, writer);

    ArrayList<String> Listofsymptoms = new ArrayList<String>();
    Listofsymptoms = treatments.getSymptoms();

    Map<String, Integer> occurencesymptoms = new HashMap<String, Integer>();

    occurencesymptoms = treatments.countSymptoms(Listofsymptoms);

    Map<String, Integer> sortedsymptoms = new HashMap<String, Integer>();

    sortedsymptoms = treatments.sortSymptoms(occurencesymptoms);

    treatments.writeSymptoms(sortedsymptoms);
  
	}

}