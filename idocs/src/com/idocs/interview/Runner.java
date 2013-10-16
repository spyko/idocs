package com.idocs.interview;


public class Runner {

	public static void main(String[] args) {
		
		if(args.length !=3){
			System.out.println("Wrong number of parameters");
		}
		
		SingletonClass.setBufferedReader1(FileService.openFileForReading(args[0]));
		SingletonClass.setBufferedReader2(FileService.openFileForReading(args[1]));
		SingletonClass.setBufferedWriter(FileService.openFileForWriting(args[2]));
		
		BusinessLogic bl = new BusinessLogic();
		bl.compareFiles(SingletonClass.getBufferedReader1(), SingletonClass.getBufferedReader2());
		
		FileService.writeToFileFromSet(SingletonClass.getBufferedWriter(),bl.getOrderedSet());
		FileService.closeFiles(SingletonClass.getBufferedReader1(),SingletonClass.getBufferedReader2(),SingletonClass.getBufferedWriter());
	}

}
