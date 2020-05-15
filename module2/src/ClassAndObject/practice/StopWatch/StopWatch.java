package ClassAndObject.practice.StopWatch;

public class StopWatch {
    private long starTime,endTime;
    StopWatch(){
    }
    public long getStarTime() {
		return this.starTime;
	}

	public long getEndTime() {
		return this.endTime;
    }
    public void start(){
        this.starTime = System.currentTimeMillis();
    }
    public void end(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.starTime - this.starTime;
    }
}