package com.optionalClass;

import java.util.Optional;

public class User {

	public String getUserName(int id) {
		if (id == 101) {
			return "chandra";
		} else if (id == 102) {
			return "sekhar";
		} else if (id == 103) {
			return "lingisetti";
		} else {
			return null;
		}
	}

	public Optional<String> getUser(int id) {
		String name = null;
		if (id == 101) {
			name = "chandra";
		} else if (id == 102) {
			name = "sekhar";
		} else if (id == 103) {
			name = "lingisetti";
		}
		return Optional.ofNullable(name);

	}

}
