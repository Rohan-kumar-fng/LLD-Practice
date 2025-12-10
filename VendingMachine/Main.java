public class Main{
    public static void main(String[] args){
        MachineController machineController = new MachineController();
        machineController.start();

        // Mistake sI have done
        // 1. Never Create Product inside the main Calss
        // 2. Creating MAchine is fine
        // 3. All things related to product happened inside the machinecontroller class
    }
}