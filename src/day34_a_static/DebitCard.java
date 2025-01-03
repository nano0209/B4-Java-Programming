package day34_a_static;

public class DebitCard {

    // Instance Variables
    private long cardNumber;
    String holderName;
    private String cardType;
    private int pin;
    double balance;

    // Static variables
    static String accountType;

    // Static block
    static {
        System.out.println("Static block running....");
        accountType = "Debit";
    }


    // Constructor - initialize the card number, the card holder name, and the balance.
    public DebitCard(long cardNumber, String holderName, double balance) {
        //this.cardNumber = cardNumber;
        setCardNumber(cardNumber);
        this.holderName = holderName;
        this.balance = balance;
    }


    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {

        this(cardNumber, holderName, balance); // Constructor chaining
        //this.cardNumber = cardNumber;
        //setCardNumber(cardNumber);
        //this.holderName = holderName;
        //this.cardType = cardType;
        setCardType(cardType);
        //this.pin = pin;
        setPin(pin);
        //this.balance = balance;
    }

    // Instance method SETTER for cardNumber
    // the card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print “Invalid card number”
    public void setCardNumber(long cardNumber) {
        //this.cardNumber = cardNumber;
        if ((cardNumber + "").length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid card number");
        }
    }


    public void setCardType(String cardType) {
        //  MasterCard or Visa
        if (cardType.equalsIgnoreCase("MasterCard") || cardType.equalsIgnoreCase("Visa")) {
            this.cardType = cardType;
        } else {
            System.out.println("Invalid card type");
        }
    }

    public void setPin(int pin) {
        if ((pin + "").length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("Invalid pin length");
        }
    }


    public String toString() {
        return "DebitCard{" +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }
}