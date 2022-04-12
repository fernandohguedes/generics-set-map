package introducaoInterfaceSet.exercicios;

import java.util.Date;

public class LogUser {

	private String name;
	private Date timeStamp;

	public LogUser(String name, Date timeStamp) {
		this.name = name;
		this.timeStamp = timeStamp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof LogUser)) return false;

		LogUser logUser = (LogUser) o;

		return name != null ? name.equals(logUser.name) : logUser.name == null;
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "LogUser{" +
				"name='" + name + '\'' +
				", timeStamp=" + timeStamp +
				'}';
	}
}
