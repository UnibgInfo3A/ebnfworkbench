/**
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang;

import it.unibg.ebnfwb.lang.EbnfLangStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class EbnfLangStandaloneSetup extends EbnfLangStandaloneSetupGenerated {
  public static void doSetup() {
    EbnfLangStandaloneSetup _ebnfLangStandaloneSetup = new EbnfLangStandaloneSetup();
    _ebnfLangStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
