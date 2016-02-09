package DOTCFGVisualizer;

import javax.lang.model.element.Element;

import org.checkerframework.dataflow.cfg.DOTCFGVisualizer;
import org.checkerframework.dataflow.analysis.AbstractValue;
import org.checkerframework.dataflow.analysis.Analysis;
import org.checkerframework.dataflow.analysis.Store;
import org.checkerframework.dataflow.analysis.TransferFunction;
import org.checkerframework.dataflow.analysis.FlowExpressions.ArrayAccess;
import org.checkerframework.dataflow.analysis.FlowExpressions.ClassName;
import org.checkerframework.dataflow.analysis.FlowExpressions.FieldAccess;
import org.checkerframework.dataflow.analysis.FlowExpressions.PureMethodCall;
import org.checkerframework.dataflow.cfg.node.Node;


public class DOTCFGVisualizerOnlyType <A extends AbstractValue<A>,
S extends Store<S>, T extends TransferFunction<A, S>> extends DOTCFGVisualizer<A, S, T> {
	
	@Override
	protected String visualizeBlockNode(Node t, /*@Nullable*/ Analysis<A, S, T> analysis) {
        return prepareString(t.toString()) + "   [ " + visualizeType(t) + " ]" + t.getType();
    }
	
	@Override
	public void visualizeLocalVariable(Element key, A value) {
		this.sbStore.append("  " + key + " > " +
				key.asType()
                + "\\n");
		
	}

	@Override
	public void visualizeFieldValues(FieldAccess fieldAccess, A value) {
		this.sbStore.append("  " + fieldAccess + " > " +
				fieldAccess.getType()
                + "\\n");
	}

	@Override
	public void visualizeArrayAccess(ArrayAccess arrayAccess, A value) {
		this.sbStore.append("  " + arrayAccess + " > " +
				arrayAccess.getType()
                + "\\n");
		
	}

	@Override
	public void visualizeMethodValues(PureMethodCall methodCall, A value) {
		this.sbStore.append("  " + methodCall.toString().replace("\"", "\\\"")
                + " > " + methodCall.getType() + "\\n");
		
	}

	@Override
	public void visualizeClassValues(ClassName className, A value) {
		this.sbStore.append("  " + className + " > " + className.getType()
                + "\\n");
		
	}

}
