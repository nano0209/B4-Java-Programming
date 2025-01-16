package day40_exception.bank;

public class NotEnoughBalanceException extends RuntimeException{


    // Any class that is child class of RunTimeException class is Unchecked/Runtime exception class
// Any class that is child class of Exception class is checked/CompileTime Exception [except RunTimeException]

        public NotEnoughBalanceException(String message) {
            super(message);
        }
    }

