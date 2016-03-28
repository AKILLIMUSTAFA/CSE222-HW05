package tr.edu.gtu.mustafa.akilli.cse222.hw05;

import java.util.Stack;

/**
 * HW05_131044017_Mustafa_Akilli
 *
 * File:   GameTowerOfHanoi
 *
 * Description:
 *
 * Class that solves Tower Of Hanoi problem
 *
 * @author Mustafa_Akilli
 * @since Sunday 26 March 2016 by Mustafa_Akilli
 */
public class GameTowerOfHanoi {

    private Stack<Character> stackOfMoves; /* is Stack of moves */

    /**
     * No Parameter Constructor
     */
    public GameTowerOfHanoi(){}// end Four Parameter Constructor

    /**
     * Recursive Method for "moving" disks
     *
     * @param disksize is the number of disk
     * @param src is the starting peg
     * @param dst is the destination peg
     * @param aux is the auxiliary peg
     */
    public void TowerOfHanoi(int disksize,String src, String dst, String aux){

        if(disksize == 1){

            System.out.println("*Move Disk 1 from peg " + src + " to peg " + dst);

        }
        else{

            TowerOfHanoi(disksize-1,src,aux,dst);
            System.out.println("Move Disk " + disksize + " from peg " + src + " to peg " + dst + "\n");
            TowerOfHanoi(disksize-1,aux,dst,src);

        }







    }// end method TowerOfHanoi


    /**
     * Iterative Method for "moving" disks
     *
     * @param disksize is the number of disk
     * @param src is the starting peg
     * @param dst is the destination peg
     * @param aux is the auxiliary peg
     */
    public void TowerOfHanoiIterative(int disksize,String src, String dst, String aux){
        int index;
        int count;

        /*for(index=1; index <= disksize ; ++index){
            if(index == 1){
                System.out.println("*Move Disk 1 from peg " + src + " to peg " + dst);
            }

            else{
                System.out.println("Move Disk " + index + " from peg " + src + " to peg " + aux + "\n");

                for(int inIndex=1; inIndex < disksize ; ++inIndex){

                    if(inIndex == 1){
                        System.out.println("*Move Disk 1 from peg " + dst + " to peg " + aux);
                    }

                    else {
                        System.out.println("Move Disk " + index + " from peg " + aux + " to peg " + src + "\n");
                    }
                }
            }

        }*/

        /*for(index=disksize; index >= 1 ; --index){

            if(index == disksize){
                System.out.println("*Move Disk 1 from peg " + src + " to peg " + dst);
            }

            else{
                System.out.println("Move Disk " + (index) + " from peg " + src + " to peg " + aux + "\n");

                for(int inIndex=1; inIndex < disksize ; ++inIndex){

                    if(inIndex == 1){
                        System.out.println("*Move Disk 1 from peg " + dst + " to peg " + aux);
                    }

                    else {
                        System.out.println("Move Disk " + inIndex + " from peg " + aux + " to peg " + src + "\n");
                    }
                }
            }

        }*/

        /*int limit= 2*disksize-1,count1=1,count2=1,count3=1;

        for(int i=0; i<disksize; i++){


            if(disksize == 1){

                System.out.println("*Move Disk 1 from peg " + src + " to peg " + dst);

            }
            else{

                if(count1>1){
                    TowerOfHanoi(disksize-1,src,aux,dst);
                    ++count1;
                }


                if(count2>1)
                    System.out.println("Move Disk " + disksize + " from peg " + src + " to peg " + dst + "\n");

                if(count3>1)
                    TowerOfHanoi(disksize-1,aux,dst,src);

            }

        }*/

    }

    /**
     * Get Stack Of Moves
     *
     * @return Stack of moves
     */
    public Stack<Character> getStackOfMoves() {
        return stackOfMoves;
    }

    /**
     * Set Stack Of Moves
     */
    public void setStackOfMoves() {
        this.stackOfMoves = new Stack<Character>();
    }

}
