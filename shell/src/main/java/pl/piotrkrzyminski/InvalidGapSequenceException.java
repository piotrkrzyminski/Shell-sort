package pl.piotrkrzyminski;

/*
 * Created by Piotr Krzymiński on 18.12.2017
 */

public class InvalidGapSequenceException extends SortException {

    public InvalidGapSequenceException() {
        super();
    }

    public InvalidGapSequenceException(String message) {
        super(message);
    }
}