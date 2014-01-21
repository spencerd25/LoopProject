package loop.controller;

import loop.model.Looper;
import loop.view.LoopFrame;

public class LoopController
{
		private LoopFrame appFrame;
		private Looper myLooper;
		
		public LoopController()
		{
			myLooper = new Looper();
		}

		public void start()
		{
			appFrame = new LoopFrame(this);
		}
		
		public String getLoopResults()
		{
			String results = "";
			
			results = myLooper.loopTestOne();
			
			return results;
		}
}
