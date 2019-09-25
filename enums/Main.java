public class Main {
 
    public static void main(String[] args) {
        printState(State.PREPARING);
        printState(State.IN_PROGRESS);
        printState(State.OVER);
        printState(State.ERROR);
    }
 
    public static void printState(State st) {
        System.out.printf(st.getMessage(), st.name());
        System.out.println();
    }
}
