package com.practice.accessmodifier;

public class AccessModifier {
	public static void main(String[] args) {
		AccessModifier acc = new AccessModifier();
     acc.returnPrivateName();
     }
	public void returnPublicName() {
		System.out.println("I am within Public Method");
	}
	protected void returnProtectedName() {
		System.out.println("I am within Protected Method");
	}
	private void returnPrivateName() {
		System.out.println("I am within Private Method");
	}
}
