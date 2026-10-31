
public class TowersofHanoi {
    private static final int NUM_DISKS = 3
    private static String[][] towers;


    public static void main(String[] args) {
        towers = new String[NUM_DISKS][3];
        intTowers();
        System.out.println("Initial State");
        printTowers();
        System.out.println("-------------------");
        moveDisks(NUM_DISKS,0,2,1);
    }

    private static void intTowers() {}
    for (int row = 0; row < NUM_DISKS; row++) {
        for(int l=0; l<3; l++ ){
        towers[row][l] = " | ";
        
        }
        int disk = NUM_DISKS-row;
        towers [row][0] = String.format(" %d%d%d ",disk disk disk);

    }
   
 {

    
    }

    private static void printTowers() {}

        for(int i = NUM_DISKS-1; i>=0; i--) {
            for(int j = 0; j<3; j++){
                System.out.println(towers[row][l]);

            }
            System.out.println();


        }
        System.out.println("__________________");
    

    private static void moveDisks(int n,int fromRod , int toRod, int auxRod) {
        if (n == 1){

System.out.println("Move disk" +(fromRod + 1) "to Rod" +(toRod + 1))
            moveDiskVisual(fromRod, toRod);
            printTowers();
            c
        }
        moveDisks(n-1, fromRod, auxRod, toRod);
System.out.println("Move disk" +(fromRod + 1) "to Rod" +(toRod + 1))
        moveDisks(n-1, auxRod, toRod, fromRod);
        moveDiskVisual(fromRod, toRod);
        printTowers();
        return;
    }

    private static void moveDiskVisual(int fromRod, int toRod) {}

    private static void moveDiskVisual(int fromRod, int toRod);

    int diskToMove = -1;
    for(int i NUM_DISKS-1; i>=0; i--){
        if(!towers[row][fromRod].equal(" | ")){
            diskToMove = i;
            break;
        }
    }
    if(diskToMove != -1){
        for(int i=0; i<NUM_DISKS; i++){
            towers([row][toRod].equal(" | ")){
                towers[i][toRod] = towers[diskToMove][fromRod];
                towers[diskToMove][fromRod] = " | ";
                break;
            }
        }
    }

}
//must create at least 7 discs
    //must create 3 towers and a base
    //all discs are different sizes
    //larger discs at the bottom, stacked on eachother, each smaller than the last until the top disc is the smallest
    //cannot put a larger disc on a smaller disc
    //cannot move more than one disc at a time
