class bankAccount
{
      
     public String Acchname;
     public int Accnumber;
     public float curramount;
    bankAccount(String Acchname, int Accnum,float curramount)
    {
       this.Acchname = Acchname;
       this.Accnumber = Accnumber;
       this.curramount = curramount;
      System.out.println("Enter Account holder name:"+Acchname);
        System.out.println("Enter Account number:"+Accnum);
        System.out.println("Enter current amount:"+curramount);
    }
    public void withdraw(int withdraw)
    {
       if(withdraw>curramount)
       {
             System.out.println("Insufficient Funds");
       }
       else
       {
            curramount = curramount-withdraw;
            System.out.println("withdraw amount is:"+withdraw);
            System.out.println("Current amount is:"+curramount);
       }
   }
   public void deposit(int deposit)
      {
            System.out.println("Deposited amount is :");
            curramount = curramount+deposit;
            System.out.println("Deposited amount is:"+deposit);
            System.out.println("Total current amount is:"+curramount);
       }

       public static void main(String args[])
       {
              
            bankAccount b = new bankAccount("Hari",24210,100000);   
            b.deposit(10000);
            b.withdraw(500);

}}

