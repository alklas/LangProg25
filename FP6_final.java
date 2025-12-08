lapTimes.add(31.0)
lapTimes.add(20.9)
lapTimes.add(21.1)
lapTimes.add(21.3)
static double avgTime(List<Double> lapTimes) {
	double time = totalTime(lapTimes);
	List<Double> withoutWarmUp = new ArrayList<>(lapTimes);
	withoutWarmUp.remove(0); //удаление прогревочного круга

	int laps = withoutWarmUp.size();
	return time/laps;
}
lapTimes
List <Double> lapTimes = new ArrayList<>();
lapTimes.add(31.0)
lapTimes.add(20.9)
lapTimes.add(21.1)
lapTimes.add(21.3)
totalTime(lapTimes)
avgTime(lapTimes)
lapTimes
	static double totalTime(List<Double> lapTimes) {
		List<Double> withoutWarmUp = new ArrayList<>(lapTimes);
		withoutWarmUp.remove(0); //удаление показаний прогревочного круга
		double sum = 0;
		for (double x: withoutWarmUp) {
			sum += x;
		}
		return sum;
	}
totalTime(lapTimes)
avgTime(lapTimes)