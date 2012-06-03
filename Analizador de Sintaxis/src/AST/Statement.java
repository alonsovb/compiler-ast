package AST;

public abstract class Statement
{
	public abstract Object visit(Visitor v,Object arg);
}
