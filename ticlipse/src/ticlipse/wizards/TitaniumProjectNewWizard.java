package ticlipse.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class TitaniumProjectNewWizard extends Wizard implements INewWizard {
	
	private static final String WIZARD_NAME = "Titanium Project"; //$NON-NLS-1$
	private static final String PAGE_NAME = "Titanium Project Wizard"; //$NON-NLS-1$
	private WizardNewProjectCreationPage initialPage;
	
	@Override
	public void addPages() {
		super.addPages();
		
		initialPage = new WizardNewProjectCreationPage(PAGE_NAME);
		initialPage.setTitle(NewWizardMessages.TitaniumProjectNewWizard_New_Titanium_Project);
		initialPage.setDescription(NewWizardMessages.TitaniumProjectNewWizard_Create_a_new_Titanium_Project);
		
		addPage (initialPage);
	}
	
	public TitaniumProjectNewWizard() {
		setWindowTitle (WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		return true;
	}

}
