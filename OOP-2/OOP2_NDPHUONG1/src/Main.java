import oop.recruiment.thread.ExperienceCandidateCreator;
import oop.recruiment.thread.FileReader;
import oop.recruiment.thread.FresherCandidateCreator;

public class Main {
    public static void main(String[] args) {
        Thread experienceThread = new Thread(new ExperienceCandidateCreator());
        Thread fresherThread = new Thread(new FresherCandidateCreator());
        Thread fileReaderThread = new Thread(new FileReader());

        experienceThread.start();
        fresherThread.start();
        fileReaderThread.start();

        try {
            //experienceThread.join();
            fresherThread.join();
            fileReaderThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
