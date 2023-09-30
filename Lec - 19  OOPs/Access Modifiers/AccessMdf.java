public class AccessMdf {
    public static void main(String[] args) {
        BankAccount myACC = new BankAccount();
        myACC.username = "dhanaraj";
        myACC.password = "abcdefghi";
        myACC.setPassword("abcdefghiklmno");
    }
}
    
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String newPwd){
        password = newPwd;
        System.out.println(password);
    }
} 