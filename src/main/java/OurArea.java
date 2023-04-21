/**
 * Provides the base model implementation for the Area class.
 * Represents a Window constructed out of 64 x 64 tiles.
 * @author jddevaughnbrown
 *
 */
@SuppressWarnings("serial")
public class OurArea extends Area {

    /*
     * Variables from the parent class we have access to

  // The trees that are scattered around the area.
  Tree[] trees;

  // The area tile map, with each tile represented as an integer.
  int[][] tiles;

  // The tile values for grass (0) and stone (1) tiles.
  int GRASS;
  int STONE;

  // The number of tiles on the x-axis, and y-axis.
  int NUM_TILES_X;
  int NUM_TILES_Y;

  // The maximum position of a tree on the x-axis and y-axis.
  // Note: The minimum is simply (0, 0).
  double MAX_TREE_X;
  double MAX_TREE_Y;
     */

    /**
     * Constructs the OurArea.
     * @param numberOfTrees - the number of trees to place in the area
     */
    public OurArea(int numberOfTrees) {
        super(); 
        //* Exercise #1. Setup the tree objects at random locations.
        
        //*/

        //* Exercise #3. Initialize the tiles.
        

        // Exercise #5: Draw two stones at specific locations.
        
        //*/
    }

    @Override
    protected void drawTrees() {
        //* Exercise #2. Draw the trees.
        
        //*/
    }

    @Override
    protected void drawTiles() {
        //* Exercise #4. Draw the tiles.
        
    }
}
