package com.halimahsya.chapter17_BinaryIO.tugas;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class exercise4_ConvertATextFileIntoUTF {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("usage : java exercise_17_04 SourceFile TargetFile");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println(" the file " + args[0] + "does not exist.");
            System.exit(2);
        }
        try (
            Scanner input = new Scanner(file);
            DataOutputStream output = new DataOutputStream(new FileOutputStream(args[1]));
        ) {
            while (input.hasNext())
                output.writeUTF(input.nextLine());
        }

    }
}
