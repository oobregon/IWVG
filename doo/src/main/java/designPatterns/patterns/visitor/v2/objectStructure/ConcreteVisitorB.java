package designPatterns.patterns.visitor.v2.objectStructure;

public class ConcreteVisitorB implements Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("visitConcreteElementA by ConcreteVisitorB");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("visitConcreteElementB by ConcreteVisitorB");
	}

}
