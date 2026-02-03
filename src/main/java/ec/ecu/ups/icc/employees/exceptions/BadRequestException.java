package ec.ecu.ups.icc.employees.exceptions;

public class BadRequestException extends RuntimeException {  
    public BadRequestException(String message) {
        super(message);
    }
}