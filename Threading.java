class Sbi extends Thread {
    public void run(){
        for(int i=0; i<4; i++){
            System.out.println("Sbi threding");
        }
        
    }
    public void run(int i){
        System.out.println("Sbi threading2"+i);
    }

}
class Threading{
    public static void main(String[] args) {
        Sbi s =new Sbi();
        s.start();
        s.run(10);
        
        for (int i =0; i<4; i++){
            System.out.println("Bank threding");
        }
    }
}