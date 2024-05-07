package oop.recruiment.thread;

import oop.recruiment.candidate.Candidate;
import oop.recruiment.candidate.FresherCandidate;
import oop.recruiment.utils.Constant;
import oop.recruiment.utils.InputValidator;

import java.time.LocalDate;

public class FresherCandidateCreator extends CandidateCreator implements Runnable {

    private InputValidator inputValidator;

    public FresherCandidateCreator() {
        this.inputValidator = new InputValidator();
    }

    @Override
    public void run() {
        String firstName = inputValidator.inputString("Fresher Enter first name:");
        String lastName = inputValidator.inputString("Fresher Enter last name:");
        int birthYear = inputValidator.inputYear("Fresher Enter birth year (yyyy):");
        String address = inputValidator.inputString("Fresher Enter address:");
        String phone = inputValidator.inputPhone("Fresher Enter phone (at least 7 positive numbers):");
        String email = inputValidator.inputEmail("Fresher Enter email:");
        LocalDate graduationDate = inputValidator.inputDate("Fresher Enter graduation date (yyyy-mm-dd):");
        String graduationRank = inputValidator.inputGraduationRank("Fresher Enter graduation rank (Excellence, Good, Fair, Poor):");
        String education = inputValidator.inputString("Fresher Enter education:");
        // Create a FresherCandidate object
        Candidate candidate = new FresherCandidate(firstName, lastName, birthYear, address, phone, email, graduationDate, graduationRank, education);
        // Save to file
        saveCandidate(candidate);
        inputValidator.closeScanner();
    }

    @Override
    protected String getFileName() {
        return Constant.FILE_FRESHER_CANDIDATE;
    }
}
