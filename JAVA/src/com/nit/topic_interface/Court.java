package com.nit.topic_interface;

public class Court {

	public static void main(String[] args) {
		ApproveDocument a1=new ApproveDocument();
		a1.writeContent();
		a1.approveDocument();

	}

}
interface DocumentWorkFlow{
	public abstract void writeContent();
	public abstract void approveDocument();
	
	
}
abstract class DraftDocument implements DocumentWorkFlow{
	@Override
	public  void writeContent() {
		System.out.println("Writing content completed!");
	}

}
 class ApproveDocument extends DraftDocument{
	 @Override
	public void approveDocument(){
		System.out.println("Approved content Successfully !");
	}
}