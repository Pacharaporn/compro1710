
package th.ac.nu.students.u54341710.compro.ch02;

public class ShortCircuitLogicalOperator {
    public static void main(String[] args) {
        int x = 0;
        System.out.println((x != 0) && ((10 / x) > 1)); //false
    }
}
