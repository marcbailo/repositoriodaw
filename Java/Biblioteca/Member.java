java
public class Member {
    private String name;
    private String lastname;
    private int memberId;



}  

public Member(String firstName, String lastName, int memberId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberId = memberId;
    }

public void requestLoan(Book book, String loanDate) {
        System.out.println("Loan requested by " + firstName + " " + lastName + ", Member ID: " + memberId);
        Loan loan = new Loan(book, this);
        loan.registerLoan(loanDate);
    }    

public void returnLoan(Book book) {
        System.out.println("Returning loan by " + firstName + " " + lastName + ", Member ID: " + memberId);
        Loan loan = new Loan(book, this);
        loan.returnLoan();
    }  
    
 public void info() {
        System.out.println("Book: " + book.getTitle() + ", Member: " + member.getFirstName() + " " + member.getLastName());
    }      