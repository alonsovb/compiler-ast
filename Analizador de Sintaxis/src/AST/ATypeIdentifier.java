package AST;

public class ATypeIdentifier extends Type {

	public ATypeIdentifier() {
	}

	public Object visit(Visitor v, Object arg) {
		return v.visitATypeIdentifier(this,arg);
	}
}

