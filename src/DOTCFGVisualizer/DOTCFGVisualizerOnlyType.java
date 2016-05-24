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
    public void visualizeBlockNode(Node t, /*@Nullable*/ Analysis<A, S, T> analysis) {
        this.sbBlock.append(prepareString(t.toString()) + "   [ " + prepareNodeType(t) + " ]" + t.getType());
    }

    @Override
    public void visualizeStoreLocalVar(FlowExpressions.LocalVariable key, A value) {
        this.sbStore.append("  " + key + " > " +
                key.getType()
                + "\\n");
    }

    @Override
    public void visualizeStoreFieldVals(FlowExpressions.FieldAccess fieldAccess, A value) {
        this.sbStore.append("  " + fieldAccess + " > " +
                fieldAccess.getType()
                + "\\n");
    }

    @Override
    public void visualizeStoreArrayVal(FlowExpressions.ArrayAccess arrayAccess, A value) {
        this.sbStore.append("  " + arrayAccess + " > " +
                arrayAccess.getType()
                + "\\n");
    }

    @Override
    public void visualizeStoreMethodVals(FlowExpressions.MethodCall methodCall, A value) {
            this.sbStore.append("  " + methodCall.toString().replace("\"", "\\\"")
                + " > " + methodCall.getType() + "\\n");
    }

    @Override
    public void visualizeStoreClassVals(FlowExpressions.ClassName className, A value) {
        this.sbStore.append("  " + className + " > " + className.getType()
                + "\\n");
    }

}
