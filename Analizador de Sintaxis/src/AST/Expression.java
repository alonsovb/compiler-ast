package AST;

public abstract class Expression
{
	public abstract Object visit(Visitor v,Object arg);
}
