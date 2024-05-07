package oop.recruiment.candidate;

import oop.recruiment.candidate.Candidate;

import java.io.Serializable;

public class ExperienceCandidate extends Candidate implements Serializable {
    private static final long serialVersionUID = 1L;
    private int yearExperience;
    private String professionalSkill;

    public ExperienceCandidate() {
        super();
    }

    public ExperienceCandidate(String firstName, String lastName, int birthDate, String address, String phone,
                               String email, int yearExperience, String professionalSkill) {
        super(firstName, lastName, birthDate, address, phone, email);
        this.yearExperience = yearExperience;
        this.professionalSkill = professionalSkill;
    }

    /**
     * @return the yearExperience
     */
    public int getYearExperience() {
        return yearExperience;
    }

    /**
     * @param yearExperience the yearExperience to set
     */
    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    /**
     * @return the professionalSkill
     */
    public String getProfessionalSkill() {
        return professionalSkill;
    }

    /**
     * @param professionalSkill the professionalSkill to set
     */
    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ExperienceCandidate [yearExperience=" + yearExperience + ", professionalSkill=" + professionalSkill
                + ", toString()=" + super.toString() + "]";
    }
}
