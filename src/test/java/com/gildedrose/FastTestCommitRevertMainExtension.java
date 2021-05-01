package com.gildedrose;

import com.github.larseckart.tcr.TestCommitRevertMainExtension;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FastTestCommitRevertMainExtension extends TestCommitRevertMainExtension {
    @Override
    protected String getCommitMessage() {
        try {
            Process exec = Runtime.getRuntime().exec("osascript /Users/llewellynfalco/Dialog.scpt");
            exec.waitFor();
            InputStream inputStream = exec.getErrorStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            StringBuffer string = new StringBuffer();
            while (reader.ready()) {
                string.append(reader.readLine());
                string.append("\n");
            }
            reader.close();
            String commitMessage = string.toString();
            System.out.println("message: " + commitMessage);
            return commitMessage;
        } catch (Throwable t) {
            throw throwAsError(t);
        }
    }

    private RuntimeException throwAsError(Throwable t) {
        Error result;
        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        } else if (t instanceof Error) {
            throw (Error) t;
        } else {
            throw new Error(t);
        }
    }
}
