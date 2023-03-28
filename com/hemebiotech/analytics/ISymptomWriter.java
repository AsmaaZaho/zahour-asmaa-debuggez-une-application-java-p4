package com.hemebiotech.analytics;

import java.util.Map;


/**
 * the purpose is to generate a new text file which lists each symptom.
 * the method declared in this interface is by default abstract; no body
 */
public interface ISymptomWriter {
  /**
   * If no data is available, we have an empty file.
   * @param symptom list of symptoms with their occurences
   */
  public void writeSymptoms(Map<String, Integer> symptom);
}
