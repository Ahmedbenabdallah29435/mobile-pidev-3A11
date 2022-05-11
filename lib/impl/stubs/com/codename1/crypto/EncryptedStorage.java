/**
 * 
 *         <p>Provides common cryptographic use cases such as encrypted filesystem as a simplified API facade</p>
 *     
 */
package com.codename1.crypto;


/**
 *  A Storage implementation that seamlessly encrypts it's contents based on a key. To setup this 
 *  encryption use the Storage.install() method, notice that this only applies to storage and doesn't
 *  apply to the database or FileSystemStorage!
 * 
 *  @author Shai Almog
 */
public class EncryptedStorage extends com.codename1.io.Storage {

	public EncryptedStorage() {
	}

	@java.lang.Override
	public java.io.InputStream createInputStream(String name) {
	}

	@java.lang.Override
	public java.io.OutputStream createOutputStream(String name) {
	}

	/**
	 *  Use this method 
	 */
	public static void install(String keyStr) {
	}
}
