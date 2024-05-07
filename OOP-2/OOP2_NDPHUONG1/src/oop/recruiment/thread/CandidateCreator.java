package oop.recruiment.thread;

import oop.recruiment.candidate.Candidate;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class CandidateCreator {
    private static final Object fileLock = new Object();

    protected abstract String getFileName();

    protected void saveCandidate(Candidate candidate) {
        synchronized (fileLock) {
            try (FileOutputStream fileOut = new FileOutputStream(getFileName(), true);
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(candidate);
                System.out.println("Candidate saved to: " + getFileName());
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        }
    }
}
