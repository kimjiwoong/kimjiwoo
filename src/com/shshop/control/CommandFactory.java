package com.shshop.control;

import com.shshop.command.Command;
import com.shshop.command.LoginCommand;

public class CommandFactory {
	public static Command createCommand(String pathInfo) {
		switch (pathInfo) {
		case "/login":
			return new LoginCommand();
		default:
			return null;
		}
	}
}
