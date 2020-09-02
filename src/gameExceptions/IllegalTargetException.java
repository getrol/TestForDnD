package gameExceptions;


/*
    If something or someone try to do an action, that is not applicable
    for that target
 */
public class IllegalTargetException extends Throwable {
    public IllegalTargetException(String message) {
        super(message);
    }
}
