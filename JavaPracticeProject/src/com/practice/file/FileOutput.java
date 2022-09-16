package com.practice.file;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
	public final static String FILE_LOCATION = "E:\\FileWorkspace\\";

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The File Name With Extension");
		String filename = sc.nextLine();
		/**
		 * To create new file we are using this method
		 */
		// create(filename);

		/**
		 * To read a existing file
		 */

		//readFile(filename);

		/**
		 * To edit a exising file
		 */
		// editFile(fileName);

		/**
		 * To delete a existing file
		 */
		deleteFile(filename);
		sc.close();
	}

	public static void create(String fileName) throws IOException {
		String fileNameWithLocation = FILE_LOCATION + fileName;
		File file = new File(fileNameWithLocation);
		if (file.exists()) {
			System.out.println("File already Exists");
		} else {
			file.createNewFile();
			System.out.println("New File Created");
		}
	}

	public static void readFile(String fileName) throws FileNotFoundException {
		String fileNameWithLocation = FILE_LOCATION + fileName;
		File file = new File(fileNameWithLocation);
		if (file.exists()) {
			Scanner read = new Scanner(file);
			while (read.hasNextLine()) {
				String data = read.nextLine();
				System.out.println(data);
			}
			read.close();
		} else {
			System.out.println("File does not exist");
		}
	}

	public static void editFile(String fileName) throws IOException {
		String fileNameWithLocation = FILE_LOCATION + fileName;
		File file = new File(fileNameWithLocation);
		if (file.exists()) {
			Scanner read = new Scanner(file);
			FileWriter writer = new FileWriter(file);
			String data = "";
			while (read.hasNextLine()) {
				data = data + read.nextLine() + "\n";
			}
			String input = data + "I am a gamer";
			writer.write(input);
			System.out.println("File successfully updated ");
			writer.close();
			read.close();
		} else {
			System.out.println("File does not exist");
		}
	}

	public static void deleteFile(String fileName) {
		String fileNameWithLocation = FILE_LOCATION + fileName;
		File file = new File(fileNameWithLocation);
		if (file.exists()) {
			file.delete();
			System.out.println("Your file is deleted");
		} else {
			System.out.println("File does not exist");
		}

	}

}
