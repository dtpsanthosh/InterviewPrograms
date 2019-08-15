package Practice;
class Hai
			{
			
				public synchronized void m1()
				{
					System.out.println("Hai");
				}
				public synchronized void m2()
				{
					System.out.println("Bye");
				}
				public void m3()
				{
					System.out.println("Hai Bye");
				}
				
			}
			
			class SyncSampl
			{
				public static void main(String[] args)
				{
					Hai t1 = new Hai(); //Gets lock of SyncSampl and starts executing m1()
					t1.m1();
					
					Hai t2 = new Hai(); //Dosent get chance to execute m2(), as lock is holded by t1
					t2.m2();
					
					Hai t3 = new Hai();  //Dosent get chance to execute m2(), as lock is holded by t1
					t3.m2();
					
					Hai t4 = new Hai();  // it can execute m3() as it is not a synchronized method
					t4.m3();
				}
			}