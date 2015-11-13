package compgeo_lib;
/*##############################################################################
	Class TF_Tools -- a helper class for working with Text Files

	getLines(File f) -- returns a String array containing the lines of the file
##############################################################################*/
import java.util.Scanner;
import java.io.*;

public class TF_Tools {

	public static String[] getLines(File f) throws IOException{
		Scanner input = new Scanner(f);
		StringBuilder sb = new StringBuilder();
		while(input.hasNext()) {
			sb.append(input.nextLine() + "\n");
		}
		return sb.toString().split("\\n");
	}
}