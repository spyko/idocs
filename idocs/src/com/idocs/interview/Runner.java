package com.idocs.interview;


public class Runner {

	public static void main(String[] args) {
		
//		if(args.length !=3){
//			System.out.println("Wrong number of parameters");
//		}
//		
//		SingletonClass.setBufferedReader1(FileService.openFileForReading(args[0]));
//		SingletonClass.setBufferedReader2(FileService.openFileForReading(args[1]));
//		SingletonClass.setBufferedWriter(FileService.openFileForWriting(args[2]));
		
		SingletonClass.setBufferedReader1(FileService.openFileForReading("/Users/spyko/Desktop/test1.txt"));
		SingletonClass.setBufferedReader2(FileService.openFileForReading("/Users/spyko/Desktop/test2.txt"));
		SingletonClass.setBufferedWriter(FileService.openFileForWriting("/Users/spyko/Desktop/test3.txt"));

		BusinessLogic bl = new BusinessLogic();
		bl.compareFiles(SingletonClass.getBufferedReader1(), SingletonClass.getBufferedReader2());
		
		FileService.writeToFileFromSet(SingletonClass.getBufferedWriter(),bl.getOrderedSet());
		FileService.closeFiles(SingletonClass.getBufferedReader1(),SingletonClass.getBufferedReader2(),SingletonClass.getBufferedWriter());
	}

}
