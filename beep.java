

	
	 //* This snippet shows how to produce series of Beep sounds.
	public class beep {

		/**
		 * main(.) method
		 * @param args
		 */
		public void alert() {

			int beepCount = 10;
			for (int i = 0; i < beepCount; ++i) {
				//System.out.println("Beep : " + i);
				// Ring the bell again using the Toolkit 
				java.awt.Toolkit.getDefaultToolkit().beep();
				try {
					Thread.sleep(1000); // introduce delay
				} catch (InterruptedException e) {
				}
			}

		} // end of main( )
	} // end of Beep Producer


