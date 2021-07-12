package java1;

public class Threading {

			static int n = 9;

			static class fibo extends Thread {
//				int n;
//
//				fibo(int n)
//				{
//					this.n = n;
//				}

				int a = 0, b = 1, c, sum = 0;

				@Override
				public void run() {

					for (int i = 0; i < n; i++) {
						sum += a;
						c = a + b;
						a = b;
						b = c;
					}
					System.out.println("Sum is " + sum);
				}
			}

			static class patt extends Thread {

				int a = 0, b = 1, c, s = 0;

				@Override
				public void run() {

					for (int i = 0; i < n; i++) // 1 + 1 + 2 + 3 + 5 + 8 + 13 = ?
					{

						c = a + b;
						a = b;
						b = c;
						System.out.println(s + " + " + a + " = " + (a + s));
						s = a + s;
					}
					// System.out.println("Sum is "+c);
				}

			}

			public static void main(String[] args) throws InterruptedException {
				fibo f1 = new fibo();
				f1.start();
				f1.join();
				patt f2 = new patt();
				f2.start();
			}

		

}


