package org.sugarj.editor.wizard;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.internal.ui.wizards.JavaProjectWizard;

/**
 * This adds a new wizard to eclipse which changes the builder in the 
 * .project file of created projects to org.sugarj.editor.SugarJBuilder.
 * It works by extending the original wizard by adding some code to the 
 * performFinish() method.
 * Due to the restriction warnings this should be only a temporary solution.
 * Later on the new SugarJNature should set the builder and this class will
 * become obsolete
 */

public class SugarJNewWizard extends JavaProjectWizard {
	
	public boolean performFinish() {
		boolean res = super.performFinish();

		IProject project = getCreatedElement().getJavaProject().getProject();
		
		try {
		   final String BUILDER_ID = "org.sugarj.editor.SugarJBuilder";
		   IProjectDescription desc = project.getDescription();
		   ICommand[] commands = desc.getBuildSpec();
		   boolean found = false;

		   for (int i = 0; i < commands.length; ++i) {
		      if (commands[i].getBuilderName().equals(BUILDER_ID)) {
		         found = true;
		         break;
		      }
		   }
		   if (!found) { 
		      //add builder to project
		      ICommand command = desc.newCommand();
		      command.setBuilderName(BUILDER_ID);
		      ICommand[] newCommands = new ICommand[commands.length];

		      newCommands[0] = command;
		      desc.setBuildSpec(newCommands);
		      project.setDescription(desc, null);
		   }
			} catch (CoreException e) {
			System.out.println("error on setting JSugar Builder");
		}

		return res;

	}

}
