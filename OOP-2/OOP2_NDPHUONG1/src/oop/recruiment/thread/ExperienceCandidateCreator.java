package oop.recruiment.thread;

import oop.recruiment.candidate.Candidate;
import oop.recruiment.candidate.ExperienceCandidate;
import oop.recruiment.utils.Constant;
import oop.recruiment.utils.InputValidator;

public class ExperienceCandidateCreator extends CandidateCreator implements Runnable {

    private InputValidator inputValidator;

    public ExperienceCandidateCreator() {
        this.inputValidator = new InputValidator();
    }

    @Override
    public void run() {
        String firstName = inputValidator.inputString("Experience Enter first name:");
        String lastName = inputValidator.inputString("Experience Enter last name:");
        int birthYear = inputValidator.inputYear("Experience Enter birth year (yyyy):");
        String address = inputValidator.inputString("Experience Enter address:");
        String phone = inputValidator.inputPhone("Experience Enter phone (at least 7 positive numbers):");
        String email = inputValidator.inputEmail("Experience Enter email:");
        int yearsExperience = inputValidator.inputInt("Experience Enter years of experience:");
        String professionalSkill = inputValidator.inputString("Experience Enter professional skill:");
        // Create an ExperienceCandidate object
        Candidate candidate = new ExperienceCandidate(firstName, lastName, birthYear, address, phone, email, yearsExperience, professionalSkill);
        // Save to file
        saveCandidate(candidate);
        inputValidator.closeScanner();
    }

    @Override
    protected String getFileName() {
        return Constant.FILE_EXPERIENCE_CANDIDATE;
    }
}
