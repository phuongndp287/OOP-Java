package oop.recruiment.candidate;

import java.io.Serializable;
import java.time.LocalDate;

public class FresherCandidate extends Candidate implements Serializable {
    private static final long serialVersionUID = 1L;
    private LocalDate  graduationDate;
    private String graduationRank;
    private String education;

    public FresherCandidate() {
        super();
    }

    public FresherCandidate(String firstName, String lastName, int birthDate, String address, String phone,
                            String email, LocalDate graduationDate, String graduationRank, String education) {
        super(firstName, lastName, birthDate, address, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    /**
     * @return the graduationDate
     */
    public LocalDate  getGraduationDate() {
        return graduationDate;
    }

    /**
     * @param graduationDate the graduationDate to set
     */
    public void setGraduationDate(LocalDate  graduationDate) {
        this.graduationDate = graduationDate;
    }

    /**
     * @return the graduationRank
     */
    public String getGraduationRank() {
        return graduationRank;
    }

    /**
     * @param graduationRank the graduationRank to set
     */
    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    /**
     * @return the education
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education the education to set
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "FresherCandidate [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank
                + ", education=" + education + ", toString()=" + super.toString() + "]";
    }
}
