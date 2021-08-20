class account(idNumber:String,accountNumber:Int,accountBalance:Double){
	var nicNumber=idNumber;
	var accNumber=accountNumber;
	var accBalance=accountBalance;

	def withdraw(amount:Double)=if(accBalance>amount) accBalance=accBalance-amount else println("Your account balnce is not sufficient.");
	def deposit(amount:Double)=accBalance=accBalance+amount;
	def transfer(acc:List[account],amount:Double)={
		if(accBalance>amount){
			accBalance=accBalance-amount;
			acc.head.accBalance=acc.head.accBalance+amount;
		}
		else{
			println("Your account balnce is not sufficient.");
		}
	}	
}

object Q3{
	def main(args:Array[String]){
		println("\t   Bank Tranfer");

		var acc1=new account("S123",1000,25000);
		var acc2=new account("S124",1001,10000);
		val bank:List[account]=List(acc1,acc2);
		
		val x=find(1001,bank);
		acc1.transfer(x,10000);

		println("Transferd account balance : Rs."+acc1.accBalance);
		println("Received account balance  : Rs."+x.head.accBalance);
	}
	val find=(accNumber:Int,list:List[account])=>list.filter(x=>x.accNumber.equals(accNumber));
}
