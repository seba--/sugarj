package org.sugarj.builder;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.spoofax.jsglr.shared.BadTokenException;
import org.sugarj.common.path.RelativePath;
import org.sugarj.driver.Result;
import org.sugarj.util.ProcessingListener;

/**
 * @author seba
 */
public class MarkingProcessingListener implements ProcessingListener {
  
  private IProject project;
  
  public MarkingProcessingListener(IProject project) {
    this.project = project;
  }

  private IResource getResource(RelativePath sourceFile) throws JavaModelException {
    if (!sourceFile.getAbsolutePath().startsWith(project.getLocation().toString()))
      return null;
    
    try {
      for (IPackageFragmentRoot frag : JavaCore.create(project).getAllPackageFragmentRoots())
        if (frag.getKind() == IPackageFragmentRoot.K_SOURCE) {
          IResource resource = project.findMember(frag.getPath().makeRelativeTo(project.getFullPath()).append(sourceFile.getRelativePath()));
          if (resource != null)
            return resource;
        }
    } catch (JavaModelException e) { }
    return null;
  }
  
  @Override
  public void processingStarts(RelativePath sourceFile) {
    try {
      IResource resource = getResource(sourceFile);
      if (resource != null)
        resource.deleteMarkers(IMarker.MARKER, true, IResource.DEPTH_INFINITE);
    } catch (CoreException e) {
    }
  }

  @Override
  public void processingDone(Result result) {
    try {
      IResource resource = getResource(result.getSourceFile());
      if (resource == null)
        return;
      
      for (String error : result.getCollectedErrors()) {
        IMarker marker = resource.createMarker(IMarker.PROBLEM);
        marker.setAttribute(IMarker.MESSAGE, "compilation failed: " + error);
      }
      
      for (BadTokenException error : result.getParseErrors()) {
        IMarker marker = resource.createMarker(IMarker.PROBLEM);
        marker.setAttribute(IMarker.MESSAGE, "parsing failed: " + error.getLocalizedMessage());
      }
    } catch (CoreException e) {
    }
  }

}
