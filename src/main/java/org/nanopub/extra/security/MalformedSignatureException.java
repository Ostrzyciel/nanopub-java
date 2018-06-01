package org.nanopub.extra.security;

public class MalformedSignatureException extends Exception {

	private static final long serialVersionUID = 3555738230396015129L;

	public MalformedSignatureException(String message) {
		super(message);
	}

	public MalformedSignatureException(Throwable cause) {
		super(cause);
	}

}
