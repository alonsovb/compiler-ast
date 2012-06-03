package AST;

public abstract class ExpressionList
{
	public abstract Object visit(Visitor v,Object arg);
}
