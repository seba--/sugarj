package org.sugarj.editor;

import org.osgi.framework.BundleContext;

/**
 * @author seba
 */
public class SugarJActivator extends Activator {
  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    // force loading of SugarJ IMP plugin
    SugarJParseController.getDescriptor();
  }
}
