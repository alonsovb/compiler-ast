package AST;

public abstract class Type
{
	public abstract Object visit(Visitor v,Object arg);
}
