package AST;

public class AnExpressionRest extends AST {
        public AnExpressionRest er;
        public Expression e0;

	public AnExpressionRest(AnExpressionRest ER, Expression E0) {
                er = ER;
		e0 = E0;
	}

	public Object visit(Visitor v, Object arg) {
		return v.visitAnExpressionRest(this,arg);
	}
}

