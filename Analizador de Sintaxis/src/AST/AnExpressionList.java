package AST;

public class AnExpressionList extends ExpressionList {
	public Expression e0;
        public AnExpressionRest er;

	public AnExpressionList(Expression E0, AnExpressionRest ER) {
		e0 = E0;
                er = ER;
	}

	public Object visit(Visitor v, Object arg) {
		return v.visitAnExpressionList(this,arg);
	}
}

