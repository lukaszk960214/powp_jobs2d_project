package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;


public class Job2dDriverTest {
	private static Job2dDriver driver = new StubDriver();

	
	public static void main(String[] args) {
		FiguresJoe.figureScript1(driver);
	}

	private static class StubDriver implements Job2dDriver {

		@Override
		public void operateTo(int x, int y) {
			System.out.println("operateTo ");
		}

		@Override
		public void setPosition(int x, int y) {
			System.out.println("setPosition ");
		}
	};
}
