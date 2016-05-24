package DOTCFGVisualizer;

import org.checkerframework.dataflow.cfg.DOTCFGVisualizer;

import org.checkerframework.dataflow.analysis.AbstractValue;
import org.checkerframework.dataflow.analysis.Analysis;
import org.checkerframework.dataflow.analysis.Store;
import org.checkerframework.dataflow.analysis.TransferFunction;
import org.checkerframework.dataflow.cfg.block.Block;
import org.checkerframework.dataflow.cfg.block.SpecialBlock;
import org.checkerframework.dataflow.cfg.block.Block.BlockType;

public class DOTCFGVisualizerTopLevel<A extends AbstractValue<A>,
S extends Store<S>, T extends TransferFunction<A, S>> extends DOTCFGVisualizer<A, S, T> {
    @Override
    public void visualizeBlock(
            Block bb,
            /*@Nullable*/ Analysis<A, S, T> analysis) {
        this.sbBlock.setLength(0);
        if (bb.getType() == BlockType.SPECIAL_BLOCK) {
            visualizeSpecialBlock((SpecialBlock) bb);
        }

        this.sbDigraph.append(this.sbBlock.toString().replace("\\n", "\\l") + " \",];\n");
    }

}
