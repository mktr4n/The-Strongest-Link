public class PathMyopicColPlayer extends Player<PathMyopicCol> {
    // if you are in the uncolored, check the psace before if its your own color.
// If its not your color, you can move there. If get 0 == uncolored, move the
// color there
    public PathMyopicColPlayer() {
    }

    @Override
    public String toString() {
        return "SuperMyTran";
    }

    @Override
    public PathMyopicCol getMove(PathMyopicCol position, int playerId) {
        PureLinkedList<Integer> animal = position.getPath();
        if (playerId == CombinatorialGame.LEFT) { //blue player:0
            for (int i = 0; i < animal.length(); i++) {
                if ((animal.get(0).equals(PathMyopicCol.UNCOLORED) && (animal.get(i + 1).equals(CombinatorialGame.RIGHT)))) {
                    animal.set(0, CombinatorialGame.LEFT);
                    break;
                } else if ((animal.get(0).equals(PathMyopicCol.UNCOLORED)) && (animal.get(i + 1).equals(PathMyopicCol.UNCOLORED))) {
                    animal.set(0, CombinatorialGame.LEFT); //|U|U > |R|U
                    break;


                } else if ((animal.get(animal.length() - 1).equals(PathMyopicCol.UNCOLORED) && (animal.get(animal.length() - 2).equals(PathMyopicCol.UNCOLORED)))) {
                    animal.set(animal.length() - 1, CombinatorialGame.LEFT); //U
                    // |U| > U|R|
                    break;
                } else if ((animal.get(animal.length() - 1).equals(PathMyopicCol.UNCOLORED) && (animal.get(animal.length() - 2).equals(CombinatorialGame.RIGHT)))) {
                    animal.set(animal.length() - 1, CombinatorialGame.LEFT); //B
                    // |U| > B|R|
                    break;


                } else if (animal.get(animal.length() / 2).equals(PathMyopicCol.UNCOLORED) && (animal.get((animal.length() / 2) - 1).equals(CombinatorialGame.RIGHT))) {
                    animal.set(animal.length() / 2, CombinatorialGame.LEFT);
                    //|U|B|R|U|U
                    break;
                } else if (animal.get(animal.length() / 2).equals(PathMyopicCol.UNCOLORED) && (animal.get((animal.length() / 2) - 1).equals(PathMyopicCol.UNCOLORED))) {
                    animal.set(animal.length() / 2, CombinatorialGame.LEFT);
                    //|U|R|U|
                    break;


                } else if (animal.get(i).equals(PathMyopicCol.UNCOLORED) && (animal.get(i - 1).equals(CombinatorialGame.RIGHT)) && (animal.get(i + 1).equals(CombinatorialGame.RIGHT))) {
                    animal.set(i, CombinatorialGame.LEFT); //B|U|B > B|R|B
                    break;
                } else if (animal.get(i).equals(PathMyopicCol.UNCOLORED) && (animal.get(i - 1).equals(PathMyopicCol.UNCOLORED)) && (animal.get(i + 1).equals(CombinatorialGame.RIGHT))) {
                    animal.set(i, CombinatorialGame.LEFT); //U|U|B > U|R|B
                    break;




                } else if (animal.get(i).equals(PathMyopicCol.UNCOLORED) && (animal.get(i - 1).equals(CombinatorialGame.RIGHT)) && (animal.get(i + 1).equals(CombinatorialGame.RIGHT))) {
                    animal.set(i, CombinatorialGame.LEFT); //R|U|R > R|B|R
                    break;
                }else if (animal.get(i).equals(PathMyopicCol.UNCOLORED) && (animal.get(i - 1).equals(CombinatorialGame.RIGHT)) && (animal.get(i + 1).equals(PathMyopicCol.UNCOLORED))) {
                    animal.set(i, CombinatorialGame.LEFT); //R|U|U > R|B|U
                    break;
                } else if (animal.get(i).equals(PathMyopicCol.UNCOLORED) && (animal.get(i - 1).equals(PathMyopicCol.UNCOLORED)) && (animal.get(i + 1).equals(PathMyopicCol.UNCOLORED))) {
                    animal.set(i, CombinatorialGame.LEFT); //U|U|U > U|B|U
                    break;
                } else if (animal.get(i).equals(PathMyopicCol.UNCOLORED) && (animal.get(i - 1).equals(PathMyopicCol.UNCOLORED)) && (animal.get(i + 1).equals(CombinatorialGame.LEFT))) {
                    animal.set(i, CombinatorialGame.LEFT); //U|U|B > U|B|B
                    break;
                } else if (animal.get(i).equals(PathMyopicCol.UNCOLORED) && (animal.get(i - 1).equals(PathMyopicCol.UNCOLORED)) && (animal.get(i + 1).equals(CombinatorialGame.RIGHT))) {
                animal.set(i, CombinatorialGame.LEFT); //U|U|R > U|B|R
                break;
                }
            }

        } else if (playerId == CombinatorialGame.RIGHT) { //player 1 //red
            for (int i = 0; i < animal.length(); i++) {
                //The first element
                if ((animal.get(0).equals(PathMyopicCol.UNCOLORED) && (animal.get(i + 1).equals(CombinatorialGame.LEFT)))) {
                    animal.set(0, CombinatorialGame.RIGHT); //|U|B > |R|B
                    break;
                } else if ((animal.get(0).equals(PathMyopicCol.UNCOLORED)) && (animal.get(i + 1).equals(PathMyopicCol.UNCOLORED))) {
                    animal.set(0, CombinatorialGame.RIGHT); //|U|U > |R|U
                    break;

                    //The last element
               } else if ((animal.get(animal.length() - 1).equals(PathMyopicCol.UNCOLORED) && (animal.get(animal.length() - 2).equals(PathMyopicCol.UNCOLORED)))) {
                    animal.set(animal.length() - 1, CombinatorialGame.RIGHT); //U|U| > U|R|
                    break;
                } else if ((animal.get(animal.length() - 1).equals(PathMyopicCol.UNCOLORED) && (animal.get(animal.length() - 2).equals(CombinatorialGame.LEFT)))) {
                    animal.set(animal.length() - 1, CombinatorialGame.RIGHT); //B|U| > B|R|
                    break;

                    //The middle element
                } else if (animal.get(animal.length() / 2).equals(PathMyopicCol.UNCOLORED) && (animal.get((animal.length() / 2) - 1).equals(CombinatorialGame.LEFT))) {
                    animal.set(animal.length() / 2, CombinatorialGame.RIGHT); //|U|B|R|U|U
                    break;
                } else if (animal.get(animal.length() / 2).equals(PathMyopicCol.UNCOLORED) && (animal.get((animal.length() / 2) - 1).equals(PathMyopicCol.UNCOLORED))) {
                    animal.set(animal.length() / 2, CombinatorialGame.RIGHT); //|U|R|U|
                    break;

                    //OTHER
                }else if (animal.get(i).equals(PathMyopicCol.UNCOLORED) && (animal.get(i - 1).equals(CombinatorialGame.LEFT)) && (animal.get(i + 1).equals(CombinatorialGame.LEFT))) {
                    animal.set(i, CombinatorialGame.RIGHT); //B|U|B > B|R|B
                    break;
                }else if (animal.get(i).equals(PathMyopicCol.UNCOLORED) && (animal.get(i - 1).equals(CombinatorialGame.LEFT)) && (animal.get(i + 1).equals(PathMyopicCol.UNCOLORED))) {
                    animal.set(i, CombinatorialGame.RIGHT); //B|U|U > B|R|U
                    break;
                } else if (animal.get(i).equals(PathMyopicCol.UNCOLORED) && (animal.get(i - 1).equals(PathMyopicCol.UNCOLORED)) && (animal.get(i + 1).equals(PathMyopicCol.UNCOLORED))) {
                    animal.set(i, CombinatorialGame.RIGHT); //U|U|U > U|R|U
                    break;
                } else if (animal.get(i).equals(PathMyopicCol.UNCOLORED) && (animal.get(i - 1).equals(PathMyopicCol.UNCOLORED)) && (animal.get(i + 1).equals(CombinatorialGame.RIGHT))) {
                    animal.set(i, CombinatorialGame.RIGHT); //U|U|R > U|R|R
                    break;
                } else if (animal.get(i).equals(PathMyopicCol.UNCOLORED) && (animal.get(i - 1).equals(PathMyopicCol.UNCOLORED)) && (animal.get(i + 1).equals(CombinatorialGame.LEFT))) {
                    animal.set(i, CombinatorialGame.RIGHT); //U|U|B > U|R|B
                    break;

                }
            }
        }
    return new PathMyopicCol(animal);

}

    public static void main(String[] args) {
        //Player<PathMyopicCol> random = new RandomPlayer<PathMyopicCol>();
        Player<PathMyopicCol> easy = new PathMyopicColEasyPlayer();
        Player<PathMyopicCol> me = new PathMyopicColPlayer();
        int minSize = 10;
        int maxSize = 15;
        double density = .2;
        PositionFactory<PathMyopicCol> positionGenerator = new PathMyopicCol.PositionBuilder(minSize, maxSize, density);
        Referee ref = new Referee(easy, me, positionGenerator);
        ref.call();
        ref.gauntlet(100000);
    }
}
