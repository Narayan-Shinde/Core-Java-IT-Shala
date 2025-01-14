package classComponents.methods;

public class Assignment3 {
    public static void main(String[] args) {
        System.out.println("is eligible to vote : " + isEligibleToVote(19));
        System.out.println("is eligible to vote : " + isEligibleToVote(17));
    }

    private static boolean isEligibleToVote(int age) {
        return age >= 18;
    }

}
