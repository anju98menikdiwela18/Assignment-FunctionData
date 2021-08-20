class rationalNum(x:Int,y:Int){
	require(y>0,"y must be greater than zero");
    def numer=x/gcd(x,y);
    def denom=y/gcd(x,y);
    def this(x:Int)=this(x,1);
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
    def +(r:rationalNum)=new rationalNum(this.numer*r.denom + this.denom*r.numer,this.denom*r.denom);
    def neg=new rationalNum(-this.numer,this.denom);
    def -(r:rationalNum)=this+r.neg;
    override def toString= numer+"/"+denom;
}

object Q2{
	def main(args:Array[String]){
		println("\tSubstraction-->X-Y-Z");

		val ratNum1=new rationalNum(3,4);
		val ratNum2=new rationalNum(5,8);
		val ratNum3=new rationalNum(2,7);
		val ratNum4=ratNum1-ratNum2-ratNum3;
		println("X-Y-Z = "+ratNum4);
	}
}
