public class Usage {

        public static void main(String[] args) {
             Rational numero= new Rational(30,20);
             System.out.println("el numerador es:"+String.valueOf(numero.num)+" y el numerador es: "+String.valueOf(numero.den));
             System.out.println(numero.toString());
             try{
                 Rational pasPossible= new Rational(3,1);
                 System.out.println(pasPossible.toString());
                 numero.mult(pasPossible);}
             catch(Exception e){
                 System.out.println(e.getMessage());
             }

             System.out.println(numero.toString());
             Rational a=new Rational(1,2);
             Rational b=new Rational(2,3);
             a.suma(b);
	     a.setnumden(10,2);
             System.out.println("Este"+a.toString()+"este");
             Rational c=new Rational(20,5);
             System.out.println(c.toString());
             Rational d=null;
	     d=Rational.mult(a,b);
             System.out.println(d.toString());
             }
                                               }
            
                
