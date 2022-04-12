package introducaoInterfaceSet.exercios;

import java.time.LocalDateTime;
import java.util.Objects;

public class LogUser {

	private String name;
	private LocalDateTime timeStamp;

	public LogUser(String name, LocalDateTime timeStamp) {
		this.name = name;
		this.timeStamp = timeStamp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LogUser logUser = (LogUser) o;
		return Objects.equals(name, logUser.name) && Objects.equals(timeStamp, logUser.timeStamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, timeStamp);
	}

	@Override
	public String toString() {
		return "LogUser{" +
				"name='" + name + '\'' +
				", timeStamp=" + timeStamp +
				'}';
	}
}
