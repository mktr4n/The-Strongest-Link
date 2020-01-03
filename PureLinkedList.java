/**
 * will implement a Linked List (without using the Java built-in Linked List
 * class)
 *
 * @author Khanh My Tran
 */
public class PureLinkedList<myType> {
    private myType value;
    private PureLinkedList<myType> tail;

    public PureLinkedList(myType mouse) {
        this.value = mouse;
        this.tail = null;
    }

    public myType getFirst() {
        return this.value;
    }

    public void setFirst(myType a) {
        this.value = a;
    }

    public PureLinkedList<myType> getTail() {
        return this.tail;
    }

    public void setTail(PureLinkedList<myType> otherTail) {
        this.tail = otherTail;
    }

    public myType get(int index) {
        if (index < 0 || index >= this.length()) {
            throw new IndexOutOfBoundsException("Your index is not valid");
        } else if (index == 0) {
            return this.value;
        } else {
            return this.tail.get(index - 1);
        }
    }

    public void set(int index, myType element) {
        if (index < 0 || index >= this.length()) {
            throw new IndexOutOfBoundsException("Your index is is not valid!");
        } else if (index == 0) {
            this.value = element;
        } else {
            this.tail.set(index - 1, element);

        }
    }

    public boolean equals(PureLinkedList<myType> beluga) {
        if (!this.length().equals(beluga.length())) {
            return false;
        }
        if(!this.getFirst().equals(beluga.getFirst())) {
            return false;
        }
         if(this.getFirst().equals(beluga.getFirst())){
                if(this.tail == null){
                    return true;
                }else{
                    return this.tail.equals(beluga.tail);
                }
            }else{
             return false;
         }
    }
        /*if (beluga.equals(null)) {
            throw new NullPointerException("Your input is a skunky monkey");
        } else if ((beluga.getTail().equals(null)) && (this.getTail().equals(null))) {
            if (beluga.getFirst().equals(this.getFirst())){
                return true;
            } else {
                return false;
            }
        }else if(!this.getFirst().equals(beluga.getFirst())){
            return false;
        }else if ((beluga.getTail() == null) || (this.getTail() == null)) {
            return false;
        }else if(!beluga.length().equals(this.length())){
            return false;
        }else if (this.getFirst().equals(beluga.getFirst())){
            if(this.getTail().length().equals(beluga.getTail().length())){ //&&
            // (this.tail.equals(beluga.tail))){
                return this.tail.equals(beluga.tail);
            }else{
                return false;
            }
        } else{
           // return false;
        }
        return true;*/


    public String toString() {
        if (this.tail == null) {
            return "[" + this.value + "]";
        } else {
            String tailString = this.tail.toString();
            String tailMinusLeftBracket = tailString.substring(1);
            return "[" + this.value + ", " + tailMinusLeftBracket;
        }
    }

    public void add(myType mouse) {
        if (tail == null) {
            //value = mouse;
            tail = new PureLinkedList<myType>(mouse);
        } else {
            tail.add(mouse);
        }
    }

    public boolean isLast() {
        if (this.tail == null) {
            return true;
        } else {
            return false;
        }
    }

    public Integer length() {
        if (tail == null) {
            return 1;
        } else {
            return 1 + tail.length();
        }
    }

    public static void main(String[] args) {
        String success = "Test completed successfully!!!!";
        String failure = "Something went wrong!!!!!!";

        //these should cause the terminal to print: 5
        PureLinkedList<Integer> integers = new PureLinkedList<Integer>(1);
        PureLinkedList<Integer> beluga = new PureLinkedList<Integer>(1);
        integers.add(1);
        integers.add(1);
        integers.add(6);
        beluga.add(1);
        beluga.add(1);
        beluga.add(6);
        beluga.add(8);

        // System.out.println("WHat is beluga ? " + beluga.toString());
        // System.out.println(integers.toString());
        //String abc = integers.toString();
        //boolean isCorrect = abc.equals("[5, 6]");
        // System.out.println((isCorrect ? success : failure));

        // System.out.println("This is the length of the list: " + integers
        // .length());
        //System.out.println("Returns the first element in this list: " +
        // integers
        //  .getFirst());
        // integers.setFirst(7);
        //System.out.println("Return a linked list with one less element, " +
        //  "which" +
        // " contains everything except for the first element: " +
        // integers.getTail());
        //System.out.println("get the first number :" + integers.getFirst());
        //integers.setTail(beluga);
        //System.out.println(integers.toString());
        //integers.get(0);
        // System.out.println("What is the third element? " + integers.get(2));
        //integers.set(0,32);
        //integers.set(1,4);
        System.out.println("is this equal? " + integers.equals(beluga));


    }
}