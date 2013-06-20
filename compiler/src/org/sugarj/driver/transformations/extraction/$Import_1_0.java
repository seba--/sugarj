package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import_1_0 extends Strategy 
{ 
  public static $Import_1_0 instance = new $Import_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Import_1_0");
    Fail67:
    { 
      IStrategoTerm z_109 = null;
      IStrategoTerm y_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail67;
      y_109 = term.getSubterm(0);
      IStrategoList annos40 = term.getAnnotations();
      z_109 = annos40;
      term = n_18.invoke(context, y_109);
      if(term == null)
        break Fail67;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consImport_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}