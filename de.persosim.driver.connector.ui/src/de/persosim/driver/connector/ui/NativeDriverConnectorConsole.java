package de.persosim.driver.connector.ui;

import java.io.IOException;
import java.net.UnknownHostException;

import de.persosim.driver.connector.NativeDriverConnector;
import de.persosim.driver.connector.PcscPrinter;

/**
 * This class serves as a simple console interface to the native driver
 * connector.
 * 
 * @author mboonk
 *
 */
public class NativeDriverConnectorConsole {

	public static void main(String[] args) throws UnknownHostException,
			IOException {
		NativeDriverConnector connector = new NativeDriverConnector(
				"localhost", 5678, "localhost", 9876);
		connector.addUi(new ConsoleUi());
		connector.addListener(new PcscPrinter());
		connector.connect();

	}

}
