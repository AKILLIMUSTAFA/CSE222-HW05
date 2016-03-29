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

    private Stack<Integer> stackStartingPeg; /* is Stack of Starting Peg */
    private Stack<Integer> stackDestinationPeg; /* is Stack of Destination Peg */
    private Stack<Integer> stackAuxiliaryPeg; /* is Stack of Auxiliary Peg */

    /**
     * No Parameter Constructor
     */
    public GameTowerOfHanoi(){
        setStackAuxiliaryPeg();
        setStackStartingPeg();
        setStackDestinationPeg();
    }// end No Parameter Constructor

    /**
     * Iterative Method for "moving" disks
     *
     * @param disksize is the number of disk
     * @param src is the starting peg
     * @param dst is the destination peg
     * @param aux is the auxiliary peg
     */
    public void TowerOfHanoiIterative(int disksize, Character src, Character dst, Character aux){

        /* if disksize small then 3 */
        if(disksize < 3)
            System.out.println("DiskSize is to small");

        /* if Poles Names are same characters*/
        else if(src.compareTo(dst) == 0 || src.compareTo(aux) == 0 || aux.compareTo(dst) == 0)
            System.out.println("Poles Names must be different characters");

        /* if not exist any problem. */
        else {
            /* Find Loop Size */
            int loopSize = ((int) Math.pow(2, disksize)) - 1;

            /* fill in the stack of */
            for(int index = disksize; index > 0 ; --index)
                getStackStartingPeg().push((index));

            /* if disksize is even number then switch the char aux and char dst */
            if (disksize % 2 == 0) {
                Character temp = dst;
                dst = aux;
                aux = temp;
            }

            /* İterative Loop */
            for (int index = 1; index <= loopSize; ++index) {

                /* Check aux pole and dst pole. Make appropriate push */
                if (index % 3 == 0) {checkAuxPegAndDstPeg(aux,dst);}

                /* Check dst pole and src pole. Make appropriate push  */
                else if (index % 3 == 1) {checkDstPegAndSrcPeg(dst,src);}

                /* Check aux pole and src pole. Make appropriate push  */
                else if (index % 3 == 2) { checkAuxPegAndSrcPeg(aux,src);}
            }
        }

    }// end method TowerOfHanoiIterative

    /**
     * Get Stack Destination Peg
     *
     * @return Stack of Destination Peg
     */
    private Stack<Integer> getStackDestinationPeg() {
        return stackDestinationPeg;
    }

    /**
     * Set Stack Destination Peg
     */
    private void setStackDestinationPeg() {
        this.stackDestinationPeg = new Stack<Integer>();
    }

    /**
     * Get Stack Starting Peg
     *
     * @return Stack of Starting Peg
     */
    private Stack<Integer> getStackStartingPeg() {
        return stackStartingPeg;
    }

    /**
     * Set Stack Starting Peg
     */
    private void setStackStartingPeg() {
        this.stackStartingPeg = new Stack<Integer>();
    }

    /**
     * Get Stack Auxiliary Peg
     *
     * @return Stack of Auxiliary Peg
     */
    private Stack<Integer> getStackAuxiliaryPeg() {
        return stackAuxiliaryPeg;
    }

    /**
     * Set Stack Auxiliary Peg
     */
    private void setStackAuxiliaryPeg() {
        this.stackAuxiliaryPeg = new Stack<Integer>();
    }

    /**
     * Check Aux Peg And Dst Peg
     *
     * @param aux char
     * @param dst char
     */
    private void checkAuxPegAndDstPeg(char aux, char dst){

        /* if Aux Peg not empty and if Drc Peg empty */
        if(getStackAuxiliaryPeg().size() != 0 && getStackDestinationPeg().size() == 0){
            System.out.println("Move Disk " + getStackAuxiliaryPeg().peek() + " from peg " + aux + " to peg " + dst);
            getStackDestinationPeg().push(getStackAuxiliaryPeg().pop());
        }

        /* if Aux Peg empty and if Drc Peg not empty */
        else if(getStackAuxiliaryPeg().size() == 0 && getStackDestinationPeg().size() != 0){
            System.out.println("Move Disk " + getStackDestinationPeg().peek() + " from peg " + dst + " to peg " + aux);
            getStackAuxiliaryPeg().push(getStackDestinationPeg().pop());
        }

        /* if Aux Peg empty and if Drc Peg empty */
        else if(getStackAuxiliaryPeg().size() == 0 && getStackAuxiliaryPeg().size() == 0){
                        /* Do not anything */
        }

        /* if Aux Peg not empty and if Drc Peg not empty */
        else{
            if(getStackAuxiliaryPeg().peek() < getStackDestinationPeg().peek()){
                System.out.println("Move Disk " + getStackAuxiliaryPeg().peek() + " from peg " + aux + " to peg " + dst);
                getStackDestinationPeg().push(getStackAuxiliaryPeg().pop());
            }
            else{
                System.out.println("Move Disk " + getStackDestinationPeg().peek() + " from peg " + dst + " to peg " + aux);
                getStackAuxiliaryPeg().push(getStackDestinationPeg().pop());
            }
        }
    }

    /**
     * Check Dst Peg And Src Peg
     *
     * @param dst char
     * @param src char
     */
    private void checkDstPegAndSrcPeg(char dst, char src){

        /* if Src Peg not empty and if Drc Peg empty */
        if(getStackStartingPeg().size() != 0 && getStackDestinationPeg().size() == 0){
            System.out.println("Move Disk " + getStackStartingPeg().peek() + " from peg " + src + " to peg " + dst);
            getStackDestinationPeg().push(getStackStartingPeg().pop());
        }

        /* if Src Peg empty and if Drc Peg not empty */
        else if(getStackStartingPeg().size() == 0 && getStackDestinationPeg().size() != 0){
            System.out.println("Move Disk " + getStackDestinationPeg().peek() + " from peg " + dst + " to peg " + src);
            getStackStartingPeg().push(getStackDestinationPeg().pop());
        }

        /* if Src Peg empty and if Drc Peg empty */
        else if(getStackStartingPeg().size() == 0 && getStackStartingPeg().size() == 0){
            /* Do not anything */
        }

        /* if Src Peg not empty and if Drc Peg not empty */
        else{
            if(getStackStartingPeg().peek() < getStackDestinationPeg().peek()){
                System.out.println("Move Disk " + getStackStartingPeg().peek() + " from peg " + src + " to peg " + dst);
                getStackDestinationPeg().push(getStackStartingPeg().pop());
            }
            else{
                System.out.println("Move Disk " + getStackDestinationPeg().peek() + " from peg " + dst + " to peg " + src);
                getStackStartingPeg().push(getStackDestinationPeg().pop());
            }
        }
    }

    /**
     * Check Aux Peg And Src Peg
     *
     * @param aux char
     * @param src char
     */
    private void checkAuxPegAndSrcPeg(char aux, char src){

        if(getStackStartingPeg().size() != 0 && getStackAuxiliaryPeg().size() == 0){
            System.out.println("Move Disk " + getStackStartingPeg().peek() + " from peg " + src + " to peg " + aux);
            getStackAuxiliaryPeg().push(getStackStartingPeg().pop());
        }

        else if(getStackStartingPeg().size() == 0 && getStackAuxiliaryPeg().size() != 0){
            System.out.println("Move Disk " + getStackAuxiliaryPeg().peek() + " from peg " + aux + " to peg " + src);
            getStackStartingPeg().push(getStackAuxiliaryPeg().pop());
        }

        else if(getStackStartingPeg().size() == 0 && getStackStartingPeg().size() == 0){
                        /* Do not anything */
        }

        else{
            if(getStackStartingPeg().peek() < getStackAuxiliaryPeg().peek()){
                System.out.println("Move Disk " + getStackStartingPeg().peek() + " from peg " + src + " to peg " + aux);
                getStackAuxiliaryPeg().push(getStackStartingPeg().pop());
            }
            else{
                System.out.println("Move Disk " + getStackAuxiliaryPeg().peek() + " from peg " + aux + " to peg " + src);
                getStackStartingPeg().push(getStackAuxiliaryPeg().pop());
            }
        }

    }
}


