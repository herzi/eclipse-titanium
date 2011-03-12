package ticlipse.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class TitaniumProjectNewWizard extends Wizard implements INewWizard {
	
	private WizardNewProjectCreationPage initialPage;
	
	@Override
	public void addPages() {
		super.addPages();
		
		initialPage = new WizardNewProjectCreationPage("Titanium Project Wizard");
		initialPage.setTitle("Titanium Project");
		initialPage.setDescription("Create a new Titanium Project");
		
		addPage (initialPage);
	}
	
	public TitaniumProjectNewWizard() {
		setWindowTitle ("Titanium Project");
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
