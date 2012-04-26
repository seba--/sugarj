package org.sugarj.common;

import java.util.List;

public interface ErrorLogging {
	public void logError(String error);
	public List<String> getCollectedErrors();
}
