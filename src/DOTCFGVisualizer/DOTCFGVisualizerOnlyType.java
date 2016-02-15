package DOTCFGVisualizer;

import org.checkerframework.dataflow.cfg.DOTCFGVisualizer;
import org.checkerframework.dataflow.analysis.AbstractValue;
import org.checkerframework.dataflow.analysis.Analysis;
import org.checkerframework.dataflow.analysis.Store;
import org.checkerframework.dataflow.analysis.TransferFunction;
import org.checkerframework.dataflow.analysis.FlowExpressions;
import org.checkerframework.dataflow.cfg.node.Node;


public class DOTCFGVisualizerOnlyType <A extends AbstractValue<A>,
S extends Store<S>, T extends TransferFunction<A, S>> extends DOTCFGVisualizer<A, S, T> {
	
	@Override
	protected String visualizeBlockNode(Node t, /*@Nullable*/ Analysis<A, S, T> analysis) {
        return prepareString(t.toString()) + "   [ " + visualizeType(t) + " ]" + t.getType();
    }
	
	@Override
	public void visualizeLocalVariable(FlowExpressions.LocalVariable key, A value) {
		this.sbStore.append("  " + key + " > " +
				key.getType()
                + "\\n");
		
	}

	@Override
	public void visualizeFieldValues(FlowExpressions.FieldAccess fieldAccess, A value) {
		this.sbStore.append("  " + fieldAccess + " > " +
				fieldAccess.getType()
                + "\\n");
	}

	@Override
	public void visualizeArrayValue(FlowExpressions.ArrayAccess arrayAccess, A value) {
		this.sbStore.append("  " + arrayAccess + " > " +
				arrayAccess.getType()
                + "\\n");
		
	}

	@Override
	public void visualizeMethodValues(FlowExpressions.PureMethodCall methodCall, A value) {
		this.sbStore.append("  " + methodCall.toString().replace("\"", "\\\"")
                + " > " + methodCall.getType() + "\\n");
		
	}

	@Override
	public void visualizeClassValues(FlowExpressions.ClassName className, A value) {
		this.sbStore.append("  " + className + " > " + className.getType()
                + "\\n");
		
	}

}
