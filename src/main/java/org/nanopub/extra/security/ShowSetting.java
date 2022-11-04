package org.nanopub.extra.security;

import java.io.IOException;

import org.eclipse.rdf4j.RDF4JException;
import org.nanopub.MalformedNanopubException;
import org.nanopub.NanopubImpl;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

public class ShowSetting {

	public static void main(String[] args) {
		NanopubImpl.ensureLoaded();
		ShowSetting obj = new ShowSetting();
		JCommander jc = new JCommander(obj);
		try {
			jc.parse(args);
		} catch (ParameterException ex) {
			jc.usage();
			System.exit(1);
		}
		try {
			obj.run();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.exit(1);
		}
	}

	private void run() throws RDF4JException, MalformedNanopubException, IOException {
		NanopubSetting ns =  NanopubSetting.getLocalSetting();
		System.out.println("setting nanopub: " + ns.getNanopub().getUri());
		System.out.println("name: " + ns.getName());
	}

}
