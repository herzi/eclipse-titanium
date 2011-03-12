package ticlipse.wizards;

import org.eclipse.osgi.util.NLS;

public class NewWizardMessages extends NLS {
	private static final String BUNDLE_NAME = "ticlipse.wizards.messages"; //$NON-NLS-1$
	public static String TitaniumProjectNewWizard_Create_a_new_Titanium_Project;
	public static String TitaniumProjectNewWizard_New_Titanium_Project;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, NewWizardMessages.class);
	}

	private NewWizardMessages() {
	}
}
