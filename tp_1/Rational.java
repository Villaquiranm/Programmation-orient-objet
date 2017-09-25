class Rational {    

    public int num;
    public int den;
    public Rational(int num, int den){
        if (den==0) {
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }
        this.num=num;
        this.den=den;
	this.reduire();

    }
    public String toString(){
       return (String.valueOf(this.num)+"/"+String.valueOf(this.den));
    
    }
    public void mult(Rational d){
    this.num=this.num*d.num;
    this.den=this.den*d.den;
    }
    public void suma(Rational d){
    this.num=this.num*d.den+d.num+this.den;
    this.den=this.den*d.den;
    }
    private void reduire(){
        int n=1;
        while (n!=0){
           n=pgcd(this.num,this.den);
	   if (n!=0){
	  	 this.num=this.num/n;
	  	 this.den=this.den/n;
	   }
        }
    }
    private int pgcd(int a,int b){
        int n=0;
        if (a>=b){
            for (int i=2;i<=b;i++){
                if (a%i==0 && b%i==0){
                    n=i;
                }
            }
        }
        else{
            for (int i=2;i<=a;i++){
                if (a%i==0 && b%i==0){
                    n=i;
                }
            }
        }
        return n;
    }
    public void setnumden(int num,int den){
    	this.num=num;
	this.den=den;
    }
    public Rational mult(Rational a, Rational b){
    	Rational c = new Rational(1,1);
	c.setnumden(a.num*b.num,a.den*b.den);
	return c;
    }
} //Cierre de la clase
