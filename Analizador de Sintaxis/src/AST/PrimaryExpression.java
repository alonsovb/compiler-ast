package AST;

public abstract class PrimaryExpression
{
	public abstract Object visit(Visitor v,Object arg);
}
