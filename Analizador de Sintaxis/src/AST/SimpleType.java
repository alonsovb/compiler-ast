package AST;

public abstract class SimpleType
{
	public abstract Object visit(Visitor v,Object arg);
}
