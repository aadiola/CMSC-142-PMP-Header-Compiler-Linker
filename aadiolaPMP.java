import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


class aadiolaPMP{

	static ArrayList<String> declared = new ArrayList<String>();
    public static void main(String[] args) {
		Scanner inputString = new Scanner(System.in);
		readFile(inputString.nextLine());
		inputString.close();
    }

	static int readFile(String fileName){
		boolean baseCall = false;
		if(declared.isEmpty()){
			baseCall = true;
		}
		try{
        	BufferedReader source = new BufferedReader(new FileReader(fileName));
			declared.add(fileName);
			String line;
			while((line = source.readLine()) != null){
				String[] tokens = line.split(" ");
				if(tokens[0].equals("#include")){
					String headerFile = tokens[1].substring(1,tokens[1].length()-1);
					if(!declared.contains(headerFile)){
						readFile(headerFile);
					}
					continue;
				}
				System.out.println(line);
			} 
			source.close();
		} catch (FileNotFoundException e){
			System.out.println("File not found!");
			return -1;
		} catch (Exception e){
			System.out.println("Unknown error!");
			return -2;
		}

		if(baseCall){
			declared.clear();
		}

		return 0;
	}
}