package com.hemebiotech.analytics;

import java.util.Map;


/**
 * Anything the will write symptom data on a valid data output format
 *
 */
public interface ISymptomWriter {
  /**
	 * 
	 * @symptom a map of symptoms with their occurence in a new file
	 */
   
  public void writeSymptoms(Map<String, Integer> symptom);
}
