/**
 * 
 */
package com.gvdi.a58.alquilerVehiculos.negocio.ws.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.xml.rpc.Stub;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;
import org.apache.log4j.PropertyConfigurator;

import com.gvdi.a58.alquilerVehiculos.negocio.ws.A58AlquilerVehiculos;
import com.gvdi.a58.alquilerVehiculos.negocio.ws.A58AlquilerVehiculosServiceSoapBindingQSServiceLocator;
import com.gvdi.a58.alquilerVehiculos.negocio.ws.EnviarFichero;
import com.gvdi.a58.alquilerVehiculos.negocio.ws.EnviarFicheroResponse;

/**
 * The Class ClientTestMain.
 */
public class ClientTestMain {

//	private static final String ENDPOINT = "http://obuscpre.ejhsgvdi.net:9810/Ertzaintza/ALQVEHICULOS/A58/v2/EnvioFichero";

	private static final String ENDPOINT = "https://servicios.pre.ertzaintza.eus/Ertzaintza/ALQVEHICULOS/A58/v2/EnvioFichero";
//	private static final String ENDPOINT = "http://obuscdesa1.ejhsgvdi.net:9810/Ertzaintza/ALQVEHICULOS/A58/v2/EnvioFichero";
//	private static final String ENDPOINT = "http://obuscpre.ejhsgvdi.net:9810/Ertzaintza/ALQVEHICULOS/A58/v2/EnvioFichero";

	private static final String WSDD_PATH = "etc/client_deploy.wsdd";

	private static final String ALIAS = "A58DES";
	private static final String PASSWORD = "sad";
	private static final String KEYSTORE = "etc/a58des.jks";

	/**
	 * Instantiates a new client test main.
	 */
	public ClientTestMain() {
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		try {
			/*Descomentar para indicar un trustStore distinto a cacerts "EtzPre.crt ha de estar en nuestro trustStore"*/
//			System.setProperty("javax.net.ssl.trustStore", TRUSTSTORE);
//			System.setProperty("javax.net.ssl.trustStorePassword", TRUSTSTOREPASSWORD);
//			System.setProperty("javax.net.ssl.trustStoreType", "JKS");

			//Debug ssl
			System.setProperty("javax.net.debug", "all");
			
			//Si necesitamos definir un proxy
//			System.setProperty("socksProxyHost", "127.0.0.1");
//			System.setProperty("socksProxyPort", "3130");

			configureLogging();

			new ClientTestMain().enviarFichero();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Configure logging.
	 */
	public static void configureLogging() {
		Properties p = new Properties();
		p.put("log4j.rootLogger", "INFO, A1");
		p.put("log4j.appender.A1", "org.apache.log4j.ConsoleAppender");
		p.put("log4j.appender.A1.layout", "org.apache.log4j.PatternLayout");
		p.put("log4j.appender.A1.layout.ConversionPattern", "%-4r [%t] %-5p %c %x - %m%n");
		PropertyConfigurator.configure(p);
	}

	/**
	 * Gets the censo service.
	 *
	 * @return A50CensoDEV_PortType
	 * @throws Exception
	 *             the exception
	 */
	public A58AlquilerVehiculos getA58AlquilerVehiculosService() throws Exception {
		EngineConfiguration config = new FileProvider(WSDD_PATH);
		A58AlquilerVehiculosServiceSoapBindingQSServiceLocator locator = new A58AlquilerVehiculosServiceSoapBindingQSServiceLocator(config);
		A58AlquilerVehiculos service = (A58AlquilerVehiculos) locator.getA58AlquilerVehiculosServiceSoapBindingQSPort();
		configureStub((Stub) service);
		((Stub) service)._setProperty(Stub.ENDPOINT_ADDRESS_PROPERTY, ENDPOINT);
		return service;
	}

	/**
	 * Configure stub.
	 *
	 * @param service
	 *            the service
	 */
	private void configureStub(Stub service) {

		Properties propertiesCert = new Properties();
		propertiesCert.put("org.apache.ws.security.crypto.provider", "org.apache.ws.security.components.crypto.Merlin");
		propertiesCert.put("org.apache.ws.security.crypto.merlin.keystore.type", "JKS");
		propertiesCert.put("org.apache.ws.security.crypto.merlin.file", KEYSTORE);
		propertiesCert.put("org.apache.ws.security.crypto.merlin.keystore.password", PASSWORD);

		service._setProperty("KEY_CRYPTO_PROPERTIES", propertiesCert);
		service._setProperty("action", "Timestamp Signature");
		service._setProperty("SignaturePropRefId", "KEY_CRYPTO_PROPERTIES");
		service._setProperty("signatureKeyIdentifier", "DirectReference");
		service._setProperty("user", ALIAS);
		service._setProperty("passwordCallbackRef", new PWCallback(PASSWORD));
		service._setProperty(org.apache.axis.client.Call.CHECK_MUST_UNDERSTAND, Boolean.FALSE);
	}

	/**
	 * Invoca operacion enviarFichero del WS 
	 *
	 * @throws Exception
	 *             the exception
	 */
	public void enviarFichero() throws Exception {
		try {
			A58AlquilerVehiculos ws = getA58AlquilerVehiculosService();
			Properties configuration = new Properties();
			configuration.load(new FileInputStream(new File("etc/ws.properties")));

			String strToken = configuration.getProperty("ws.cdataXML");
			EnviarFichero ef = new EnviarFichero();
			ef.setFichero(strToken);
			EnviarFicheroResponse efr = ws.enviarFichero(ef);
			System.out.println("Respuesta obtenida");
			System.out.println("NumRegistros: "+efr.getRespuesta().getNumRegistros());
			System.out.println("CodError: " + efr.getRespuesta().getFileError().getCodError());
			System.out.println("DescEs: " + efr.getRespuesta().getFileError().getDescEs());
			System.out.println("DescEu: " + efr.getRespuesta().getFileError().getDescEu());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
