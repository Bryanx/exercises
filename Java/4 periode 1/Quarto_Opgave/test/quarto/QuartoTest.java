package quarto;

import org.junit.Test;
import quarto.QuartoBlock;
import quarto.QuartoFactory;
import static org.junit.Assert.assertEquals;

/**
 * @author Jan de Rijke.
 */
public class QuartoTest {
	@Test public void createBlock(){
		QuartoBlock b1 = QuartoBlock.createBlock(
			QuartoBlock.Length.SHORT,
			QuartoBlock.Color.DARK,
			QuartoBlock.Shape.CIRCULAR,
			QuartoBlock.Volume.HOLLOW);

		QuartoBlock b2 = QuartoBlock.createBlock(
			QuartoBlock.Length.SHORT,
			QuartoBlock.Color.LIGHT,
			QuartoBlock.Shape.CIRCULAR,
			QuartoBlock.Volume.SOLID);

		QuartoBlock b3 = QuartoBlock.createBlock(
			QuartoBlock.Length.SHORT,
			QuartoBlock.Color.DARK,
			QuartoBlock.Shape.CIRCULAR,
			QuartoBlock.Volume.HOLLOW);

		QuartoBlock b4 = QuartoBlock.createBlock(
			QuartoBlock.Length.TALL,
			QuartoBlock.Color.DARK,
			QuartoBlock.Shape.SQUARE,
			QuartoBlock.Volume.HOLLOW);

		QuartoBlock b5 = QuartoBlock.createBlock(
			QuartoBlock.Length.TALL,
			QuartoBlock.Color.DARK,
			QuartoBlock.Shape.CIRCULAR,
			QuartoBlock.Volume.HOLLOW)	;
		assertEquals(5,QuartoBlock.countBlocks());
		assertEquals(b1,b3);
	}
}
