

public class TraficSignals {
    public static void main(String[] args) {
    
        String signal="YELLOW";
        switch (signal) {
            case "RED":
                System.out.println("🔴 STOP! Wait until the light turns green.");
                break;
            case "YELLOW":
                System.out.println("🟡 GET READY! The signal will change soon.");
                break;
            case "GREEN":
                System.out.println("🟢 GO! You can move now.");
                break;
            default:
                
        }

        
    }
}
