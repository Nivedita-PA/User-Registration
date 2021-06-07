package UserRegistration;

public class InvalidValidationException extends RuntimeException{

    public enum ExceptionType {
        Null_Type,Empty_Type;
    }
    public ExceptionType type;
    public InvalidValidationException(String message) {
        super(message);
        this.message = message;
    }
    public String message;
    public InvalidValidationException(ExceptionType type, String message){
        super(message);
        this.message = message;
        this.type = type;
    }

}