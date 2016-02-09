package DOTCFGVisualizer;

import org.checkerframework.dataflow.cfg.DOTCFGVisualizer;

import org.checkerframework.dataflow.analysis.AbstractValue;
import org.checkerframework.dataflow.analysis.Analysis;
import org.checkerframework.dataflow.analysis.Store;
import org.checkerframework.dataflow.analysis.TransferFunction;
import org.checkerframework.dataflow.cfg.block.Block;

public class DOTCFGVisualizerOnlyBlock <A extends AbstractValue<A>,
S extends Store<S>, T extends TransferFunction<A, S>> extends DOTCFGVisualizer<A, S, T> {
	@Override
	protected void visualizeBlockTransferInput(Block bb, Analysis<A, S, T> analysis,
    		StringBuilder sbBlockContent) {
	}
}
