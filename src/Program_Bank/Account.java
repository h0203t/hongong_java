package Program_Bank;

public class Account {
    // 상수 선언
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1000000;

    // 필드 선언 (외부 접근 보호)
    private String ano;
    private String owner;
    private int balance;

    // 생성자
    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        setBalance(balance); // 초기 잔고 설정
    }

    // 계좌번호 getter
    public String getAno() {
        return ano;
    }

    // 계좌 소유자 getter
    public String getOwner() {
        return owner;
    }

    // 잔고 getter
    public int getBalance() {
        return balance;
    }

    // 잔고 setter (balance 범위 검증 포함)
    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;
        } else {
            System.out.println("잔고는 0에서 1,000,000원 사이여야 합니다.");
        }
    }

    // 입금 메소드
    public void deposit(int amount) {
        if (balance + amount <= MAX_BALANCE) {
            balance += amount;
        } else {
            System.out.println("최대 잔고를 초과할 수 없습니다.");
        }
    }

    // 출금 메소드
    public void withdraw(int amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
        } else {
            System.out.println("최소 잔고를 유지해야 합니다.");
        }
    }
}