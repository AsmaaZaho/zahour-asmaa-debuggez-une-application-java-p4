package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter{

        private String filename;
          
          /**
           * @param filename a full or partial path to an empty file already existed
           */

           //l'erreur que tu as vient de là, le test n'a pas de param dans cette méthode
           //en gros c'est pas à l'user de choisir le fichier de sortie, mais plutôt une valeur par défaut
           //donc juste WriteSymptomDataToFile()
          public WriteSymptomDataToFile () {
              this.filename = "result.out";
          }
          /**
           * @param map of strings and their occurence
         */
        @Override
        public void writeSymptoms(Map<String, Integer> symptom) {

          symptom = new HashMap<String, Integer>();

          try (FileWriter file = new FileWriter(filename)) {
            BufferedWriter result = new BufferedWriter (file);

              Iterator<Map.Entry<String, Integer>> iterator = symptom.entrySet().iterator();
                while(iterator.hasNext()) {
                  Map.Entry<String, Integer> entry = iterator.next();
                  result.write(entry.getKey());
                  result.write(entry.getValue());
                  } 
                result.close();
              }
              catch (IOException e) {
                e.printStackTrace();
              }
          }
        }
