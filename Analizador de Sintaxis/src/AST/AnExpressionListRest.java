package AST;

public class AnExpressionListRest extends ExpressionList {
 public AnExpressionList el0;
 public AnExpressionRest er1;

 public AnExpressionListRest(AnExpressionList EL0, AnExpressionRest ER1) {
  el0 = EL0;
  er1 = ER1;
 }

 public Object visit(Visitor v, Object arg) {
  return v.visitAnExpressionListRest(this,arg);
 }
}

