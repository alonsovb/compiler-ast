package AST;

public abstract class ConstantExpression
{
	public abstract Object visit(Visitor v,Object arg);
}
