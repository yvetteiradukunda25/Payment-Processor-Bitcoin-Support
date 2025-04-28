import java.util.Date;

public class Bitcoin {

    private String transactionID;
    private Date transactionDate;

    public Bitcoin(String transactionID){
        this.transactionID = transactionID;
        this.transactionDate = new Date();

    }

    public String getTransactionID() {
        return transactionID;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    @Override
    public String toString() {
        return "Bitcoin: " +
                "transactionID= '" + transactionID + '\'' +
                ", transactionDate= " + transactionDate.toString();
    }
}
