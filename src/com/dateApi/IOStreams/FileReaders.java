package com.dateApi.IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileReaders {

	public static void main(String[] args) throws Exception {

		// before 1.8 featuree read the data from the file
//		FileReader fr =new FileReader("temp\\info.txt");
//		BufferedReader br=new BufferedReader(fr);
//		String line=br.readLine();
//		
//		while(line !=null) {
//			System.out.println(line);
//			line=br.readLine();
//		}
//		br.close();

		String filename = "temp\\info.txt";

		List<String> lines = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(filename))) {

//			stream.forEach(line -> System.out.println(line));
			stream.filter(line -> line.startsWith("h")).forEach(line -> System.out.println(line));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
