package oop.recruiment.thread;

import oop.recruiment.candidate.ExperienceCandidate;
import oop.recruiment.candidate.FresherCandidate;
import oop.recruiment.utils.Constant;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class FileReader implements Runnable {
    private static final Object experienceFileLock = new Object();
    private static final Object fresherFileLock = new Object();

    private void readExperienceCandidates() {
        synchronized (experienceFileLock) {
            try (FileInputStream fileIn = new FileInputStream(Constant.FILE_EXPERIENCE_CANDIDATE);
                 ObjectInputStream in = new ObjectInputStream(fileIn)) {
                System.out.println("\nExperience Candidates show:");
                while (true) {
                    try {
                        ExperienceCandidate candidate = (ExperienceCandidate) in.readObject();
                        System.out.println(candidate);
                    } catch (EOFException e) {
                        break; // End of file
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        }
    }

    private void readFresherCandidates() {
        synchronized (fresherFileLock) {
            try (FileInputStream fileIn = new FileInputStream(Constant.FILE_FRESHER_CANDIDATE);
                 ObjectInputStream in = new ObjectInputStream(fileIn)) {
                System.out.println("\nFresher Candidates show:");
                while (true) {
                    try {
                        FresherCandidate candidate = (FresherCandidate) in.readObject();
                        System.out.println(candidate);
                    } catch (EOFException e) {
                        break; // End of file
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        }
    }

    @Override
    public void run() {
        readExperienceCandidates();
        readFresherCandidates();
    }
}
