package FileIODemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathsDemo {

	public static void main(String[] args) throws IOException {

		// relative path
		// depends where you are
		Path path1 = Paths.get("relative-file1.txt");
		// will put it right into the project folder

		// how to actually create the file
		// only creates file if it isn't created already
		if (!Files.exists(path1)) {
			Files.createFile(path1);
		}

		// another example putting file in source folder this time
		Path path2 = Paths.get("src/rel-file2.txt");
		if (Files.notExists(path2)) {
			Files.createFile(path2);
		}

		// absolute path
		// given exact location
		// this will make a file on the desktop
		Path path3 = Paths.get("C:/Users/Anon/Desktop/abs-file3.txt");
		if (Files.notExists(path3)) {
			Files.createFile(path3);
		}

		// this creates a path based on the users computer rather than an absolute path
		Path path4 = Paths.get(System.getProperty("user.home") + "/Desktop/abs-file4.txt");
		System.out.println(path4);

	}

}
