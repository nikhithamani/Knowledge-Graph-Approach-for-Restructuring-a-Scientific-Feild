/*
 Code to covert entire entire data in to Sentences - Preprocessing
 */
package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class split {
    public static void main(String args[]){
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("X.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("X.csv")));
            String s = null;
            while((s=br.readLine())!=null){
                
                StringTokenizer st = new StringTokenizer(s, ".");
                ArrayList<String> sents = new ArrayList<>();
                while(st.hasMoreTokens()){
                    sents.add(st.nextToken());
                }
                for(String sent : sents){
                    System.out.println(sent);
                    sent = sent.replaceAll(",", "");
                    bw.write(sent);
                    bw.newLine();
                }
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
