/**
 * 
 */
package com.gvdi.a58.alquilerVehiculos.negocio.ws.test;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

import javax.xml.rpc.Stub;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;
import org.apache.log4j.PropertyConfigurator;

import com.gvdi.a58.alquilerVehiculos.negocio.ws.A58AlquilerVehiculos;
import com.gvdi.a58.alquilerVehiculos.negocio.ws.A58AlquilerVehiculosServiceSoapBindingQSServiceLocator;
import com.gvdi.a58.alquilerVehiculos.negocio.ws.EnviarFichero;
import com.gvdi.a58.alquilerVehiculos.negocio.ws.EnviarFicheroResponse;


import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;
/**
 * The Class ClientTestMain.
 */
public class ClientTestMain {

	// Create a trust manager that does not validate certificate chains

//	private static final String ENDPOINT = "http://obuscpre.ejhsgvdi.net:9810/Ertzaintza/ALQVEHICULOS/A58/v2/EnvioFichero";

//private static final String ENDPOINT = "https://servicios.pre.ertzaintza.eus/Ertzaintza/ALQVEHICULOS/A58/v2/EnvioFichero";
//private static final String ENDPOINT = "https://servicios.pre.ertzaintza.eus/Ertzaintza/A19/registroHostelero/EnvioFichero";
//    private static final String ENDPOINT = "https://interno.grupoquae.mx/Ertzaintza/A19/registroHostelero/EnvioFichero";
	private static final String ENDPOINT = "http://localhost:5000";
//	private static final String ENDPOINT = "http://servicios.pre.ertzaintza.euskadi.eus/Ertzaintza/ALQVEHICULOS/A58/v2/EnvioFichero";
//private static final String ENDPOINT = "https://www.ertzaintza.euskadi.eus/Ertzaintza/ALQVEHICULOS/A58/v2/EnvioFichero";
//private static final String ENDPOINT = "https://www.google.com/Ertzaintza/ALQVEHICULOS/A58/v2/EnvioFichero";
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
	public static void main(String[] args) throws NoSuchAlgorithmException, KeyManagementException {
		TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public void checkClientTrusted(X509Certificate[] certs, String authType) {
			}

			public void checkServerTrusted(X509Certificate[] certs, String authType) {
			}
		}
		};

		// Install the all-trusting trust manager
		SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, trustAllCerts, new java.security.SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

		// Create all-trusting host name verifier
		HostnameVerifier allHostsValid = new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		};

		// Install the all-trusting host verifier
		HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		try {
			/*Descomentar para indicar un trustStore distinto a cacerts "EtzPre.crt ha de estar en nuestro trustStore"*/
			//System.setProperty("javax.net.ssl.keyStore", "C:/Users/lucio/PycharmProjects/Salma_Mumtaz_projects/Cloudbeds_integration/A58WSClient/A58WSAxisClient/etc/myTrustStore");
			//System.setProperty("javax.net.ssl.keyStorePassword","changeit");
			System.setProperty("com.sun.net.ssl.checkRevocation","false");
			System.setProperty("com.sun.security.enableAIAcaIssuers","true");
			System.setProperty("com.sun.jndi.ldap.object.disableEndpointIdentification","true");
			System.setProperty("javax.net.ssl.trustStore", "C:/Users/lucio/PycharmProjects/Salma_Mumtaz_projects/Cloudbeds_integration/A58WSClient/A58WSAxisClient/etc/a58des.jks");
			//System.setProperty("javax.net.ssl.trustStorePassword", "sad");
			//System.setProperty("javax.net.ssl.trustStoreType", "JKS");

			//Debug ssl
			System.setProperty("javax.net.debug", "all");
			javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
					new javax.net.ssl.HostnameVerifier(){

						public boolean verify(String hostname,
											  javax.net.ssl.SSLSession sslSession) {
							return true;//hostname.equals("localhost"); // or return true
						}
					});
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
