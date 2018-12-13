import java.text.NumberFormat;

public class RaceTrack implements IRacer
{

	public static void main(String[] args)
	{

		RaceCar car1 = new RaceCar("Demon", 70.0, 5.0);
		RaceCar car2 = new RaceCar("Death", 100.0, 10.0);
		RaceCar car3 = new RaceCar("Hellfire", 250.0, 50.0);

		double FINISH_LINE1 = 10;
		double FINISH_LINE2 = 50;
		double FINISH_LINE3 = 100;

		raceToFinish(FINISH_LINE1,car1,car2,car3);
		raceToFinish(FINISH_LINE2,car1,car2,car3);
		raceToFinish(FINISH_LINE3,car1,car2,car3);
	}

	private static void raceToFinish(double finishLine, IRacer car1, IRacer car2, IRacer car3)
	{
		double fastestFinishTime;
		double currentFinishTime;

		car1.resetCurrentSpeed();
		car2.resetCurrentSpeed();
		car3.resetCurrentSpeed();

		System.out.println("Racing to distance of: " + finishLine);

		IRacer fastestCar = car1;

		currentFinishTime = race(finishLine, car1);

		fastestFinishTime = currentFinishTime;

		currentFinishTime = race(finishLine, car2);

		if (currentFinishTime < fastestFinishTime)
		{

			fastestFinishTime = currentFinishTime;

			fastestCar = car2;
		}

		currentFinishTime = race(finishLine, car3);

		if (currentFinishTime < fastestFinishTime)
		{

			fastestFinishTime = currentFinishTime;

			fastestCar = car3;
		}

		System.out.println(fastestCar.getName() + " is the winner!");
		System.out.println("");
	}

	private static double race(double finishLine, IRacer racer)
	{
		System.out.print(String.format("%20s",racer.getName()));
		System.out.print(": ");

		long startTimeMilliseconds = System.currentTimeMillis();

		double currentPosition = 0;
		long currentColumn = 0;
		double lastStepOverage = 0;
		double lastSpeed = 0;

		while (currentPosition < finishLine)
		{

			racer.accelerate();

			lastSpeed = racer.getCurrentSpeed();

			currentPosition += lastSpeed;

			if (currentPosition >= finishLine)
			{

				lastStepOverage = currentPosition - finishLine;

				currentPosition = finishLine;
			}

			if (currentPosition > currentColumn)
			{

				for (int i=0; i<((long)currentPosition - currentColumn); i++)
				{
					System.out.print("=");
				}

				currentColumn = (long)currentPosition;
			}

			long now = System.currentTimeMillis();
			while ((now + 1000) > System.currentTimeMillis())
			{
			}

		}

		long stopTimeMilliseconds = System.currentTimeMillis();

		double elapsedMilliseconds = (stopTimeMilliseconds - startTimeMilliseconds);

		elapsedMilliseconds -= (lastStepOverage / lastSpeed) * 1000;

		double elapsedSeconds = elapsedMilliseconds / 1000;

		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);

		System.out.println(": Finished in " + nf.format(elapsedSeconds) + " seconds");

		return elapsedSeconds;
	}

}
