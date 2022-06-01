package volioback.exceptions;


public class CandidateNotFoundException extends Throwable {
    public CandidateNotFoundException(String id) {
        super("Cannot found candidate number [" + id + "]");
    }
}
