package com.kodilla.fileintegration;

import java.io.File;
import java.io.IOException;

public class FileTransformer {

    public String transformFile(String fileName) throws IOException {
        String name = new File(fileName).getName();
        StringBuilder result = new StringBuilder();

        result.append(name + "\n");

        return result.toString();
    }

}
