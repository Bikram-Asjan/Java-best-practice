package com.no.of.available.words.in.textfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndWrite_File {

	public static void main(String[] args) {
		// to write to a new file
		BufferedWriter bw = null; 
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your sentence: ");
			String myContent = br.readLine();
			File file = new File("G:/normal.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(myContent);
		} catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
		} finally {
			if(br != null && bw!= null){
				try {
					br.close();
					bw.close();
				} catch (IOException e) {
					System.out.println("Excoeption in closing the BufferedReader "+e.getMessage());
				}
			}
			
			}
		}

	}


