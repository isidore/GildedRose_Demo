package com.gildedrose;

import com.github.larseckart.tcr.TestCommitRevertMainExtension;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class FastTestCommitRevertMainExtension extends TestCommitRevertMainExtension {

    public static final String SCRIPT_PATH = "Dialog.scpt";

    @Override
    protected String getCommitMessage() {
        try {
            ensureApplescript();
            Process exec = Runtime.getRuntime().exec("osascript " + SCRIPT_PATH);
            exec.waitFor();
            InputStream inputStream = exec.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            StringBuffer string = new StringBuffer();
            while (reader.ready()) {
                string.append(reader.readLine());
            }
            reader.close();
            String commitMessage = string.toString().trim();
            System.out.println("message: " + commitMessage);
            return commitMessage;
        } catch (Throwable t) {
            throw throwAsError(t);
        }
    }

    private void ensureApplescript() throws IOException {
        File script = new File(SCRIPT_PATH);
        if (!script.exists())
        {
            String text = "set theResponse to display dialog \"Commit Message?\" default answer \"\" with icon note buttons {\"Cancel\", \"Continue\"} default button \"Continue\"\n" +
                    "--> {button returned:\"Continue\", text returned:\"Jen\"}\n" +
                    "copy (text returned of theResponse) to stdout";
            Files.writeString(script.toPath(), text);
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
