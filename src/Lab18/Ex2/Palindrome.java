package Lab18.Ex2;

public class Palindrome {
    public boolean palindromeCheck(String line){
        return (line.equals(new StringBuilder(line).reverse().toString()));
    }
}