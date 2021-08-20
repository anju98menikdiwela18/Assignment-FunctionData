class rationalNum(x:Int,y:Int){
	require(y>0,"y must be greater than zero");
    def numer=x/gcd(x,y);
    def denom=y/gcd(x,y);
    def this(x:Int)=this(x,1);
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
    def neg=new rationalNum(-this.numer,this.denom);
    override def toString= numer+"/"+denom;
}

object Q1{
	def main(args:Array[String]) {
		println("Rational-->Negetion");
    		val ratNum1=new rationalNum(7,11);
		val ratNum2=ratNum1.neg
		println("Number   : "+ratNum1);
		println("Negetion : "+ratNum2);
	}
}
